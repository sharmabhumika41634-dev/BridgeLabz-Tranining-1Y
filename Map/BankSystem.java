package com.gla.Map;
import java.util.*;
public class BankSystem {
    public static void main(String[] args) {

        Map<String,Double> acc = new HashMap<>();

        acc.put("101",5000.0);
        acc.put("102",8000.0);

        // deposit
        acc.put("101", acc.get("101")+2000);

        // withdraw
        if (acc.get("102") >= 3000)
            acc.put("102", acc.get("102")-3000);

        List<Map.Entry<String,Double>> list = new ArrayList<>(acc.entrySet());
        list.sort((a,b)->Double.compare(b.getValue(), a.getValue()));

        System.out.println("Top Customer: " + list.get(0));
    }
}
