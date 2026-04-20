package com.gla.streamapi.StreamapiPromblemStatement;
import java.time.*;
import java.util.*;

public class LoggingTransactions {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(101, 102);

        ids.forEach(id ->
                System.out.println(LocalDateTime.now() + " - " + id)
        );
    }
}
