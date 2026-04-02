package org.example;// UC 3 - Display "Hello" with Command-Line Argument or Default Message

// UC4 - Display hello

public class HelloApp {

    public static void main(String[] args) {

        String name = "";
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            nameBuilder.append(args[i]);

            if (i < args.length - 1) {
                nameBuilder.append(" ");
            }
        }

        name = nameBuilder.toString();

        System.out.println("Hello " + name + "!");
    }
}