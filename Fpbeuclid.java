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
public class Fpbeuclid {

    static int FPB(int a, int b) {
        int r = 0;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 45;
        int b = 20;
        System.out.println("FPB %d dan %d : %d " + a + " " + b + " " + FPB(a, b));
    }
}
