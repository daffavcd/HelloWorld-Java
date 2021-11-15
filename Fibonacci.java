/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package jobsheet11_tugas;

/**
 *
 * @author Unknown
 */
public class Fibonacci {

    public static Integer fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            int hasil = fibonacci(i);
            System.out.print(hasil + " ");
        }
    }
}
