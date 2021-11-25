package com.nyt.kuzmenko;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println("Welcome on our site ");
        System.out.println("Please choose entity you want to work with: L (Label), P (Post), W (Writer) ");
        String entity = scanner.next();
        if (validEntity(entity)) {

        } else {
            throw new RuntimeException("You entered invalid entity: " + entity);
        }

    }

    private static boolean validEntity(String entity) {
        if ("L".equals(entity) || "Label".equals(entity) || "LABEL".equals(entity)) {
            return true;
        } else if ("P".equals(entity) || "Post".equals(entity) || "POST".equals(entity)) {
            return true;
        } else if ("W".equals(entity) || "Writer".equals(entity) || "WRITER".equals(entity)) {
            return true;
        }
        return false;
    }

}
