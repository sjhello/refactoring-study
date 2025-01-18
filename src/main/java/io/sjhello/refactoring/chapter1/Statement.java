package io.sjhello.refactoring.chapter1;

import java.util.List;
import java.util.Map;

public class Statement {

	public String statement(List<Invoice> invoices, Map<String, Play> playMap) {
		Invoice invoice = invoices.get(0);

		StringBuilder result = new StringBuilder(String.format("청구 내역 (고객명: %s)\n", invoice.getCustomer()));
		for (Performance performance : invoice.getPerformances()) {
			// 청구내역을 출력한다
			result.append(String.format("%s: $%d (%d석)\n", playFor(playMap, performance).getName(), amountFor(performance, playMap) / 100, performance.getAudience()));
		}

		result.append(String.format("총액: $%d\n", totalAmount(playMap, invoice) / 100));
		result.append(String.format("적립 포인트: %d점", totalVolumeCredits(playMap, invoice)));
		return result.toString();
	}

	// 총액 계산
	private int totalAmount(Map<String, Play> playMap, Invoice invoice) {
		int totalAmount = 0;
		for (Performance performance : invoice.getPerformances()) {
			totalAmount += amountFor(performance, playMap);
		}
		return totalAmount;
	}

	private int amountFor(Performance performance, Map<String, Play> playMap) {
		int result;
		switch (playFor(playMap, performance).getType()) {
			case TRAGEDY:	// 비극
				result = 40000;
				if (performance.getAudience() > 30) {
					result += 1000 * (performance.getAudience() - 30);
				}
				break;
			case COMEDY:	// 희극
				result = 30000;
				if (performance.getAudience() > 20) {
					result += 10000 + 500 * (performance.getAudience() - 20);
				}
				result += 300 * performance.getAudience();
				break;
			default:
				throw new IllegalArgumentException("알 수 없는 장르: " + playFor(playMap, performance).getType());
		}
		return result;
	}

	// 적립 포인트 계산
	private int totalVolumeCredits(Map<String, Play> playMap, Invoice invoice) {
		int volumeCredits = 0;
		for (Performance performance : invoice.getPerformances()) {
			volumeCredits += volumeCreditsFor(performance, playMap);
		}
		return volumeCredits;
	}

	private int volumeCreditsFor(Performance performance, Map<String, Play> playMap) {
		int volumeCredits = 0;

		// 포인트를 적립한다.
		volumeCredits += Math.max(performance.getAudience() - 30, 0);

		// 희극 관객 5명마다 추가포인트를 제공한다.
		if (playFor(playMap, performance).getType().equals(PlayType.COMEDY)) {
			volumeCredits += Math.floor(performance.getAudience() / 5);
		}
		return volumeCredits;
	}

	private Play playFor(Map<String, Play> playMap, Performance performance) {
		return playMap.get(performance.getPlayID());
	}
}
