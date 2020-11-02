package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//  Ввести с консоли число в бинарном формате. Перевести его в десятичный формат,
//  записать в переменную int и вывести на экран. Необходимо использовать циклы,
//  нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите число в двоичной системе счисления: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        int n = 0;
        for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n += (str.charAt(i) - '0') * j;
        }
        System.out.println("Введенное число в десятичной системе счисления: " + n);
    }
}