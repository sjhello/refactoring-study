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
			Play play = playMap.get(performance.getPlayID());
			int thisAmount = 0;

			switch (play.getType()) {
				case TRAGEDY:	// 비극
					thisAmount = 40000;
					if (performance.getAudience() > 30) {
						thisAmount += 1000 * (performance.getAudience() - 30);
					}
					break;
				case COMEDY:	// 희극
					thisAmount = 30000;
					if (performance.getAudience() > 20) {
						thisAmount += 10000 + 500 * (performance.getAudience() - 20);
					}
					thisAmount += 300 * performance.getAudience();
					break;
				default:
					throw new IllegalArgumentException("알 수 없는 장르: " + play.getType());
			}

			// 포인트를 적립한다.
			volumeCredits += Math.max(performance.getAudience() - 30, 0);

			// 희극 관객 5명마다 추가포인트를 제공한다.
			if (PlayType.COMEDY.equals(play.getType())) {
				volumeCredits += Math.floor(performance.getAudience() / 5);
			}

			// 청구내역을 출력한다
			result.append(String.format("%s: $%d (%d석)\n", play.getName(), thisAmount / 100, performance.getAudience()));
			totalAmount += thisAmount;
		}

		result.append(String.format("총액: $%d\n", totalAmount / 100));
		result.append(String.format("적립 포인트: %d점", volumeCredits));
		return result.toString();
	}
}
