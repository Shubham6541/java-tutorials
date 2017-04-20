package com.nklkarthi.powermockito.introduction;

public class CollaboratorForPartialMocking {

    public static String staticMethod() {
        return "Hello nklkarthi!";
    }

    public final String finalMethod() {
        return "Hello nklkarthi!";
    }

    private String privateMethod() {
        return "Hello nklkarthi!";
    }

    public String privateMethodCaller() {
        return privateMethod() + " Welcome to the Java world.";
    }
}