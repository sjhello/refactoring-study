package io.sjhello.refactoring.chapter6.extractmethod;

import java.time.LocalDateTime;

public class Before {

    public void printOwing(Invoice invoice) {


        printBanner();

        int outstanding = calculateOutstanding(invoice);

        recordDueDate(invoice);
        printDetail(invoice, outstanding);
    }

    private static int calculateOutstanding(Invoice invoice) {
        int outstanding = 0;
        for (int o : invoice.getOrders()) {
           outstanding += o;
        }
        return outstanding;
    }

    private void recordDueDate(Invoice invoice) {
        LocalDateTime today = Clock.today();
        invoice.setDueDate(today.plusDays(today.getDayOfMonth() + 30));
    }

    private void printDetail(Invoice invoice, int outstanding) {
        System.out.println("고객명: " + invoice.getCustomer());
        System.out.println("채무액: " + outstanding);
        System.out.println("마감일: " + invoice.getDueDate());
    }

    private void printBanner() {
        System.out.println("=====================");
        System.out.println("===========고객 채무==========");
        System.out.println("=====================");
    }
}
