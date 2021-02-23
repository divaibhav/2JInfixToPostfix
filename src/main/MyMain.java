package main;

import infix.postfix.InfixToPostfix;

public class MyMain {
    public static void main(String[] args) {
        InfixToPostfix convertor = new InfixToPostfix();
        String infix = "5+6^2";//"A+(B*C-(D/E^F)*G)*H";
        String postfix = convertor.infixToPostfix(infix);
        System.out.println("postfix = " + postfix);
        double result = convertor.postfixEvaluation(postfix);
        System.out.println("result = " + result);
    }
}
