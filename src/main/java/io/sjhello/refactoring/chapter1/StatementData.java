package io.sjhello.refactoring.chapter1;

import java.util.Map;

public class StatementData {

	private Invoice invoice;

	private Map<String, Play> plays;

	private PerformanceCalculatorFactory performanceCalculatorFactory;

	public StatementData(Invoice invoice, Map<String, Play> plays) {
		this.invoice = invoice;
		this.plays = plays;
		this.performanceCalculatorFactory = new PerformanceCalculatorFactory();
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public Map<String, Play> getPlays() {
		return plays;
	}

	public Play playFor(Performance performance) {
		return plays.get(performance.getPlayID());
	}

	public int amountFor(Performance performance) {
		return this.performanceCalculatorFactory
			.createPerformanceCalculator(playFor(performance), performance)
			.amount();
	}

	// 총액 계산
	public int totalAmount() {
		int result = 0;
		for (Performance performance : invoice.getPerformances()) {
			result += amountFor(performance);
		}
		return result;
	}

	// 적립 포인트 계산
	public int totalVolumeCredits() {
		int result = 0;
		for (Performance performance : invoice.getPerformances()) {
			result += volumeCreditsFor(performance);
		}
		return result;
	}

	private int volumeCreditsFor(Performance performance) {
		return this.performanceCalculatorFactory
			.createPerformanceCalculator(playFor(performance), performance)
			.volumeCredits();
	}
}
