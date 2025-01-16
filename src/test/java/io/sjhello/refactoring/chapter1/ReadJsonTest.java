package io.sjhello.refactoring.chapter1;

import static org.assertj.core.api.Assertions.*;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class ReadJsonTest {

	private ObjectMapper objectMapper;
	private ClassLoader classLoader;

	@BeforeEach
	void setUp() {
		this.objectMapper = JsonMapper.builder()
			.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
			.build();
		this.classLoader = this.getClass().getClassLoader();
	}

	@Test
	void playsJsonTest() throws Exception {
		InputStream playsStream = classLoader.getResourceAsStream("chapter1/plays.json");

		if (playsStream == null) {
			throw new IllegalStateException("Cannot find plays.json");
		}
		Map<String, Play> plays = objectMapper.readValue(playsStream, new TypeReference<>() {});

		assertThat(plays).isNotNull();
		assertThat(plays.get("hamlet").getName()).isEqualTo("hamlet");
		assertThat(plays.get("hamlet").getType()).isEqualTo(PlayType.TRAGEDY);
	}

	@Test
	void invoiceReadTest() throws Exception {
		InputStream invoiceStream = classLoader.getResourceAsStream("chapter1/invoices.json");

		if (invoiceStream == null) {
			throw new IllegalStateException("Cannot find invoices.json");
		}
		List<Invoice> invoices = objectMapper.readValue(invoiceStream, new TypeReference<>() {});

		assertThat(invoices).isNotNull();
		assertThat(invoices.size()).isEqualTo(1);
		assertThat(invoices.get(0).getCustomer()).isEqualTo("BigCo");
	}
}
