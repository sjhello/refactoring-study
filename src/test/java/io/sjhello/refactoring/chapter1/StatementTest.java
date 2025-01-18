package io.sjhello.refactoring.chapter1;

import static org.assertj.core.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
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
	void statementTest() throws IOException {
		// given
		List<Invoice> invoices = findInvoices();
		Map<String, Play> playMap = findPlays();

		// then
		String result = Statement.statement(invoices, playMap);
		assertThat(result).isEqualTo("""
			청구 내역 (고객명: BigCo)
			Hamlet: $650 (55석)
			As You Like It: $580 (35석)
			Othello: $500 (40석)
			총액: $1730
			적립 포인트: 47점""");
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
