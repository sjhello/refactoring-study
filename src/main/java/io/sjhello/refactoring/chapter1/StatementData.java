package io.sjhello.refactoring.chapter1;

import java.util.Map;

public class StatementData {

	private Invoice invoice;

	private Map<String, Play> plays;

	public StatementData() {
	}

	public StatementData(Invoice invoice, Map<String, Play> plays) {
		this.invoice = invoice;
		this.plays = plays;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public Map<String, Play> getPlays() {
		return plays;
	}
}
