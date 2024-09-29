package org.example;

import java.util.ArrayList;
import java.util.List;

class Button {
    private int count = 0;

    public int click() {
        count++;
        return count;
    }
}

class Balance {
    private int leftWeight = 0;
    private int rightWeight = 0;

    public void addLeft(int weight) {
        leftWeight += weight;
    }

    public void addRight(int weight) {
        rightWeight += weight;
    }

    public String result() {
        if (leftWeight == rightWeight) {
            return "=";
        } else if (leftWeight > rightWeight) {
            return "L";
        } else {
            return "R";
        }
    }
}

class Bell {
    private boolean isDing = true;

    public String sound() {
        if (isDing) {
            isDing = false;
            return "ding";
        } else {
            isDing = true;
            return "dong";
        }
    }
}

class OddEvenSeparator {
    private List<Integer> evenNumbers = new ArrayList<>();
    private List<Integer> oddNumbers = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public List<Integer> even() {
        return evenNumbers;
    }

    public List<Integer> odd() {
        return oddNumbers;
    }
}

class Table {
    private int[][] table;

    public Table(int rows, int cols) {
        table = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return table[row][col];
    }

    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    public int rows() {
        return table.length;
    }

    public int cols() {
        return table[0].length;
    }

    public double average() {
        int sum = 0, count = 0;
        for (int[] row : table) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : table) {
            for (int value : row) {
                sb.append(value).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        Button button = new Button();
        System.out.println("Button clicked: " + button.click());
        System.out.println("Button clicked: " + button.click());

        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);
        System.out.println("Balance result: " + balance.result());

        Bell bell = new Bell();
        System.out.println("Bell sound: " + bell.sound());
        System.out.println("Bell sound: " + bell.sound());

        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(2);
        separator.addNumber(5);
        separator.addNumber(10);
        System.out.println("Odd numbers: " + separator.odd());
        System.out.println("Even numbers: " + separator.even());

        Table table = new Table(2, 2);
        table.setValue(0, 0, 10);
        table.setValue(1, 1, 20);
        System.out.println("Table content:");
        System.out.println(table);
        System.out.println("Average: " + table.average());
    }
}