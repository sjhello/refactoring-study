package io.sjhello.refactoring.chapter1;

import java.util.List;
import java.util.Map;

public class Statement {

	public String statement(List<Invoice> invoices, Map<String, Play> playMap) {
		StatementData statementData = new StatementData(invoices.get(0), playMap);
		return renderPlainText(statementData);
	}

	public String htmlStatement(List<Invoice> invoices, Map<String, Play> playMap) {
		StatementData statementData = new StatementData(invoices.get(0), playMap);
		return renderHtml(statementData);
	}

	public String renderHtml(StatementData statementData) {
		StringBuilder result = new StringBuilder(String.format("<h1> 청구내역 (고객명: %s)\n </h1>", statementData.getInvoice().getCustomer()));
		result.append("<table> \n");
		result.append("<tr><th> 연극 </th> <th>좌석 수</th> <th>금액</th>");
		for (Performance performance : statementData.getInvoice().getPerformances()) {
			result.append(String.format("<tr><td> %s: </td> <td> $%d </td> <td> %d석 </td></tr>\n",statementData.playFor(performance).getName(), statementData.amountFor(performance) / 100, performance.getAudience()));
		}
		result.append("</table>\n");

		result.append(String.format("총액: $%d\n", statementData.totalAmount()));
		result.append(String.format("적립 포인트: %d점", statementData.totalVolumeCredits()));
		return result.toString();
	}

	private String renderPlainText(StatementData statementData) {
		StringBuilder result = new StringBuilder(String.format("청구 내역 (고객명: %s)\n", statementData.getInvoice().getCustomer()));
		for (Performance performance : statementData.getInvoice().getPerformances()) {
			// 청구내역을 출력한다
			result.append(String.format("%s: $%d (%d석)\n", statementData.playFor(performance).getName(), statementData.amountFor(performance) / 100, performance.getAudience()));
		}

		result.append(String.format("총액: $%d\n", statementData.totalAmount() / 100));
		result.append(String.format("적립 포인트: %d점", statementData.totalVolumeCredits()));
		return result.toString();
	}
}
