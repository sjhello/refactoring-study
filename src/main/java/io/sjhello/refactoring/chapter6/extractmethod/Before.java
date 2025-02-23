package io.sjhello.refactoring.chapter6.extractmethod;

import java.time.LocalDateTime;

public class Before {

    public void printOwing(Invoice invoice) {
        int outstanding = 0;

        printBanner();

        // 미해결 채무(outstanding)을 계산한다
        for (int o : invoice.getOrders()) {
           outstanding += o;
        }

        // 마감일(dueDate)을 기록한다
        LocalDateTime today = Clock.today();
        invoice.setDueDate(today.plusDays(today.getDayOfMonth() + 30));

        printDetail(invoice, outstanding);
    }

    private static void printDetail(Invoice invoice, int outstanding) {
        System.out.println("고객명: " + invoice.getCustomer());
        System.out.println("채무액: " + outstanding);
        System.out.println("마감일: " + invoice.getDueDate());
    }

    private static void printBanner() {
        System.out.println("=====================");
        System.out.println("===========고객 채무==========");
        System.out.println("=====================");
    }
}
