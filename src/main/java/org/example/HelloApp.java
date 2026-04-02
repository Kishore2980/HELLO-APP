package org.example;// UC 3 - Display "Hello" with Command-Line Argument or Default Message

// UC5 - Hellowithcomma

public class HelloApp {

    public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        String names = nameBuilder.toString();

        System.out.println("Hello " + names + "!");
    }
}