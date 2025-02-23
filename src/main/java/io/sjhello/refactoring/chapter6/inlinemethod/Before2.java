package io.sjhello.refactoring.chapter6.inlinemethod;

import java.util.HashMap;
import java.util.Map;

public class Before2 {

    public Map<String, String> reportLines(Customer aCustomer) {
        Map<String, String> lines = new HashMap<>();
        gatherCustomerData(lines, aCustomer);
        return lines;
    }

    private void gatherCustomerData(Map<String, String> out, Customer aCustomer) {
        out.put("name", aCustomer.getName());
        out.put("location", aCustomer.getLocation());
    }
}
