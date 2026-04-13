package com.gla.Map;
import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        String[] votes = {"A","B","A","C","B","A","C","A"};

        Map<String,Integer> map = new HashMap<>();

        for (String v : votes) {
            map.put(v, map.getOrDefault(v,0)+1);
        }

        String winner = null;
        int max = 0;

        for (var e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println("Winner: " + winner);
        System.out.println(map);
    }
}
