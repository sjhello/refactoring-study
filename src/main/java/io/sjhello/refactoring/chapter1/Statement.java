package io.sjhello.refactoring.chapter1;

import java.util.List;
import java.util.Map;

public class Statement {

	public String statement(List<Invoice> invoices, Map<String, Play> playMap) {
		int totalAmount = 0;
		int volumeCredits = 0;
		Invoice invoice = invoices.get(0);

		StringBuilder result = new StringBuilder(String.format("청구 내역 (고객명: %s)\n", invoice.getCustomer()));

		for (Performance performance : invoice.getPerformances()) {
			int thisAmount = amountFor(performance, playMap);

			// 포인트를 적립한다.
			volumeCredits += Math.max(performance.getAudience() - 30, 0);

			// 희극 관객 5명마다 추가포인트를 제공한다.
			if (PlayType.COMEDY.equals(playFor(playMap, performance).getType())) {
				volumeCredits += Math.floor(performance.getAudience() / 5);
			}

			// 청구내역을 출력한다
			result.append(String.format("%s: $%d (%d석)\n", playFor(playMap, performance).getName(), thisAmount / 100, performance.getAudience()));
			totalAmount += thisAmount;
		}

		result.append(String.format("총액: $%d\n", totalAmount / 100));
		result.append(String.format("적립 포인트: %d점", volumeCredits));
		return result.toString();
	}

	private Play playFor(Map<String, Play> playMap, Performance performance) {
		return playMap.get(performance.getPlayID());
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
}
