package lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for(int i =0; i<line.length(); i++) {
            stack.push(line.charAt(i));
        }

        for (int i = 0; i < line.length(); i++) {
            System.out.print(stack.pop());
        }

    }
}
