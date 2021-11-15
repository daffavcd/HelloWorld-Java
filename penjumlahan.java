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
public class penjumlahan {

    static int faktorialPenjumlahan(int i) {

        if (i == 0 || i == 1) {
            return 1;
        }

        return i + faktorialPenjumlahan(i - 1);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(faktorialPenjumlahan(8));
    }
}
