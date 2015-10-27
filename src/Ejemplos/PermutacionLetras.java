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
public class PermutacionLetras {

    public static void main(String[] args) {
        char numeros[] = {'A', 'B','C', 'D'};
        diferencia(numeros, 0);

    }

    public static void diferencia(char[] v, int p) {
 if (validar(v)) {
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
            System.out.println("");
        } else {
            for (int i = 0; i < v.length - 1; i++) {
               // mostrar(v);
                if (p != i && p < v.length) {
                    int aux = v[i];
                    v[i] = v[p];
                    v[p] = (char)aux;
                    diferencia(v, p + 1);
                    aux = v[i];
                    v[i] = v[p];
                    v[p] = (char)aux;

                } else if (p < v.length) {
                    p++;
                    int aux = v[i];
                    v[i] = v[p];
                    v[p] = (char)aux;
                    diferencia(v, p + 1);
                    aux = v[i];
                    v[i] = v[p];
                    v[p] = (char)aux;

                }
            }
        }

    }

    private static boolean validar(char[] n) {
        int x = 0;
        for (int i = 0; i < n.length - 1; i++) 
        {
           
            if ((n[i] - n[i + 1] >= 2 || n[i + 1] - n[i] >= 2)) {
                x++;
            } else {

            }
            if (x == n.length-1 ) {
                return true;
            }
        }
        return false;
    }

    public static void mostrar(int[] n) {

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
        }

        System.out.println(" ");

    }

}
