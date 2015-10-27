/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author Santitigaga
 */
public class seguimiento4 {

    public static void main(String[] args) {
        Backtrack(1, 3, 9);
    }

    public static void Backtrack(int b, int c, int d) {
        if (b <= c) {
            System.out.println("d: "+d);
            for (int k = b; k <= c; k++) {
                Backtrack(b + 1, c, k);
                System.out.println("b: " + (b + 1) + " c: " + c + " k: " + k);
            }
        }

    }

}
