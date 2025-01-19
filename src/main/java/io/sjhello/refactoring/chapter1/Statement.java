package io.sjhello.refactoring.chapter1;

import java.util.List;
import java.util.Map;

public class Statement {

	public String statement(List<Invoice> invoices, Map<String, Play> playMap) {
		StatementData statementData = new StatementData(invoices.get(0), playMap);
		return renderPlainText(statementData);
	}
	private String renderPlainText(StatementData statementData) {
		StringBuilder result = new StringBuilder(String.format("청구 내역 (고객명: %s)\n", statementData.getInvoice().getCustomer()));
		for (Performance performance : statementData.getInvoice().getPerformances()) {
			// 청구내역을 출력한다
			result.append(String.format("%s: $%d (%d석)\n", statementData.playFor(performance).getName(), statementData.amountFor(performance) / 100, performance.getAudience()));
		}

		result.append(String.format("총액: $%d\n", statementData.totalAmount() / 100));
		result.append(String.format("적립 포인트: %d점", totalVolumeCredits(statementData.getPlays(), statementData.getInvoice(), statementData)));
		return result.toString();
	}

	// 적립 포인트 계산
	private int totalVolumeCredits(Map<String, Play> playMap, Invoice invoice, StatementData statementData) {
		int result = 0;
		for (Performance performance : invoice.getPerformances()) {
			result += statementData.volumeCreditsFor(performance);
		}
		return result;
	}
}
