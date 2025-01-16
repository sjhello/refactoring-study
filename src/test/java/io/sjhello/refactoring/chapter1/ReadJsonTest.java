package io.sjhello.refactoring.chapter1;

import static org.assertj.core.api.Assertions.*;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonTest {

	private ObjectMapper objectMapper;
	private ClassLoader classLoader;

	@BeforeEach
	void setUp() {
		this.objectMapper = new ObjectMapper();
		this.classLoader = this.getClass().getClassLoader();
	}

	@Test
	void statement() throws Exception {
		InputStream playsStream = classLoader.getResourceAsStream("chapter1/plays.json");

		if (playsStream == null) {
			throw new IllegalStateException("Cannot find plays.json");
		}
		Map<String, Play> plays = objectMapper.readValue(playsStream, new TypeReference<>() {});

		assertThat(plays).isNotNull();
		assertThat(plays.get("hamlet").getName()).isEqualTo("hamlet");
	}
}
