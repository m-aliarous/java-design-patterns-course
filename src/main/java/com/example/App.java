package com.example;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        var interpreter = new StartWithCapitalLetter();
        var context_ = interpreter.interpret(context);
        System.out.println(context_);
    }

}
