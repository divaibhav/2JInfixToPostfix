package main;

import infix.postfix.InfixToPostfix;

public class MyMain {
    public static void main(String[] args) {
        InfixToPostfix convertor = new InfixToPostfix();
        String infix = "5+6";//"A+(B*C-(D/E^F)*G)*H";
        System.out.println(convertor.infixToPostfix(infix));
    }
}
