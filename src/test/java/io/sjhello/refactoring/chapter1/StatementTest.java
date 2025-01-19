package io.sjhello.refactoring.chapter1;

import static org.assertj.core.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

class StatementTest {
	private ClassLoader classLoader;
	private ObjectMapper objectMapper;

	@BeforeEach
	void setUp() throws Exception {
		this.objectMapper = JsonMapper.builder()
			.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
			.build();
		this.classLoader = this.getClass().getClassLoader();;
	}

	@Test
	void plainTextStatementTest() throws IOException {
		// given
		Statement statement = new Statement();

		List<Invoice> invoices = findInvoices();
		Map<String, Play> playMap = findPlays();

		// then
		String result = statement.plainTextStatement(invoices, playMap);
		assertThat(result).isEqualTo("""
			청구 내역 (고객명: BigCo)
			Hamlet: $650 (55석)
			As You Like It: $580 (35석)
			Othello: $500 (40석)
			총액: $1730
			적립 포인트: 47점""");
	}

	@Test
	void statementTest2() throws IOException {
		// given
		Statement statement = new Statement();

		List<Invoice> invoices = findInvoices();
		Map<String, Play> playMap = findPlays();

		// then
		String result = statement.htmlStatement(invoices, playMap);
		String expected = """
			<h1> 청구내역 (고객명: BigCo)
			 </h1><table>\s
			<tr><th> 연극 </th> <th>좌석 수</th> <th>금액</th><tr><td> Hamlet: </td> <td> $650 </td> <td> 55석 </td></tr>
			<tr><td> As You Like It: </td> <td> $580 </td> <td> 35석 </td></tr>
			<tr><td> Othello: </td> <td> $500 </td> <td> 40석 </td></tr>
			</table>
			총액: $173000
			적립 포인트: 47점""";
		assertThat(result).isEqualTo(expected);
	}

	private Map<String, Play> findPlays() throws IOException {
		InputStream playMapStream = this.classLoader.getResourceAsStream("chapter1/plays.json");
		if (playMapStream == null) {
			throw new IllegalStateException("plays.json not found");
		}
		Map<String, Play> playMap = this.objectMapper.readValue(playMapStream, new TypeReference<>() {});
		return playMap;
	}

	private List<Invoice> findInvoices() throws IOException {
		InputStream invoicesStream = this.classLoader.getResourceAsStream("chapter1/invoices.json");
		if (invoicesStream == null) {
			throw new IllegalStateException("invoices.json not found");
		}
		List<Invoice> invoices = this.objectMapper.readValue(invoicesStream, new TypeReference<>() {
		});
		return invoices;
	}
}
