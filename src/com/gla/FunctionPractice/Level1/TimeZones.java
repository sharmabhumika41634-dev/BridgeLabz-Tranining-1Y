package com.gla.FunctionPractice.Level1;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones {
    static void displayTime(String zone) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println(zone + " : " + time);
    }

    public static void main(String[] args) {

        displayTime("GMT");                // Greenwich Mean Time
        displayTime("Asia/Kolkata");       // IST
        displayTime("America/Los_Angeles"); // PST
    }
}
