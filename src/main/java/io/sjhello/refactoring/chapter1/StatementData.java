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

	public Play playFor(Performance performance) {
		return plays.get(performance.getPlayID());
	}

	public int amountFor(Performance performance) {
		return new PerformanceCalculator(performance, playFor(performance)).amount();
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
		int result = 0;

		// 포인트를 적립한다.
		result += Math.max(performance.getAudience() - 30, 0);

		// 희극 관객 5명마다 추가포인트를 제공한다.
		if (playFor(performance).getType().equals(PlayType.COMEDY)) {
			result += Math.floor(performance.getAudience() / 5);
		}
		return result;
	}
}
