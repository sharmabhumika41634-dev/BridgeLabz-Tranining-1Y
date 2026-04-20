package com.gla.streamapi.LambdaExpressions;
interface Light {
    void turnOn();
}
public class SmartHome {
    public static void main(String[] args) {

        Light motion = () -> System.out.println("Light ON by motion");
        Light time = () -> System.out.println("Light ON at night");
        Light voice = () -> System.out.println("Light ON by voice command");

        motion.turnOn();
        time.turnOn();
        voice.turnOn();
    }
}
