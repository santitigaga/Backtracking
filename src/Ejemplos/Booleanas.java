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
public class Booleanas {

    public static void main(String[] args) {
        int j = 1;
        int x[] = {0, 1, 0, 1};
         presentar(x, j);

    }

    public static void presentar(int x[], int j) {
        if (validar(x)) {
            System.out.print("eureca");
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + ", ");
            }
            System.out.println("");
        } else {
            
            for (int i = 0; i < x.length - 1; i++) {
                if (j != i && j < x.length) {
                    mostar(x);
                    x[j] = 1;
                    presentar(x, j + 1);
                    x[j] = 0;
                } else if (j < x.length) {
                    mostar(x);
                    j++;
                    x[j] = 1;
                    presentar(x, j);
                    x[j] = 0;
                    presentar(x, j);

                }

            }
        }
    }

    public static boolean validar(int x[]) {
        int unos = 0;
        if (x[0]!=x[1]) {
           for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                unos++;


            } 
            } 
        }else{
        return false;
        }
        
        

        if (unos % 2 != 0) {
            return true;
        }
        return false;
    }

    private static void mostar(int[] x) {
        for (int i = 0; i <x.length; i++) {
            System.out.print(x[i]); 
        }
        System.out.println("");
    }
}
