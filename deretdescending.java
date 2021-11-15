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
public class deretdescending {

    static void deret(int i) {
        if (i >= 0) {
            System.out.print(i + " ");
            deret(--i);
        }
    }

    public static void main(String[] args) {
        int i = 10;
        deret(i);
    }
}
