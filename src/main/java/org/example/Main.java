package org.example;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[4];
        try {
            System.out.println("тест");
            nums[7] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("О, нет, у нас ошибка");
        }
    }
}