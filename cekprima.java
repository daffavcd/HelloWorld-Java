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
public class cekprima {

    private static int ambilNilaiRekursif(int bil, int num) {
        if (num == 1) {
            return 1;
        } else if (bil % num == 0) {
            return 1 + ambilNilaiRekursif(bil, --num);
        } else {
            return 0 + ambilNilaiRekursif(bil, --num);
        }
    }

    public static boolean cekBilanganPrima(int bil) {
        if (bil > 1) {
            return (ambilNilaiRekursif(bil, bil) == 2);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int bil = 100;
        if (cekBilanganPrima(bil)) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }
    }

}
