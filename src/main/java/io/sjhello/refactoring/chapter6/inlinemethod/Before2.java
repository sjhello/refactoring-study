package io.sjhello.refactoring.chapter6.inlinemethod;

import java.util.HashMap;
import java.util.Map;

public class Before2 {

    public Map<String, String> reportLines(Customer aCustomer) {
        Map<String, String> lines = new HashMap<>();
        lines.put("name", aCustomer.getName());
        lines.put("location", aCustomer.getLocation());
        return lines;
    }

}
