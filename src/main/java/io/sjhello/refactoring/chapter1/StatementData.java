package io.sjhello.refactoring.chapter1;

public class StatementData {

	private Invoice invoice;

	public StatementData() {
	}

	public StatementData(Invoice invoice) {
		this.invoice = invoice;
	}

	public Invoice getInvoice() {
		return invoice;
	}
}
