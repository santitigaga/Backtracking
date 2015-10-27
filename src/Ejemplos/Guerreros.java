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
public class Guerreros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int piedras[] = new int[7];

        //blancos 1 negros 0
        piedras[0] = 0;
        piedras[1] = 0;
        piedras[2] = 0;
        piedras[3] = 2;
        piedras[4] = 1;
        piedras[5] = 1;
        piedras[6] = 1;
        mover(piedras);
    }

    public static void mover(int[] p) {
        if (p[0] == 1 && p[1] == 1 && p[2] == 1 && p[4] == 0 && p[5] == 0 && p[6] == 0) {
            System.out.println("se encontro una solucion");
        } else {
            for (int i = 0; i < p.length; i++) {
                if (p[i] == 2) {
                    if ((i - 2 >= 0) && p[i - 2] == 0) {
                        p[i] = 0;
                        p[i - 2] = 2;
                        mostrar(p);
                        mover(p);
                        p[i] = 2;
                        p[i - 2] = 0;
                    }
                    if ((i - 1) >= 0 && p[i - 1] == 0) {
                        p[i] = 0;
                        p[i - 1] = 2;
                        mostrar(p);
                        mover(p);
                        p[i] = 2;
                        p[i - 1] = 0;
                    }
                    if ((i + 1) < p.length && p[i + 1] == 1) {
                        p[i] = 1;
                        p[i + 1] = 2;
                        mostrar(p);
                        mover(p);
                        p[i] = 2;
                        p[ i+1] = 1;
                    }
                    if ((i + 2) < p.length && p[i + 2] == 1) {
                        p[i] = 1;
                        p[i + 2] = 2;
                        mostrar(p);
                        mover(p);
                        p[i] = 2;
                        p[i + 2] = 1;
                    }

                }
            }
        }
    }

    public static void mostrar(int[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println(" ");

    }
}
