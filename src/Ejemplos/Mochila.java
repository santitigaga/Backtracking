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
public class Mochila {

    public static void main(String[] args) {
        int Objetos[] = {10, 3, 5, 7, 2};
        int mochila = 15;
        llenar(mochila, Objetos);
    }

    public static void llenar(int m, int o[]) {
        int var=0;
        if (m == 0) {
            System.out.println("se encontro una solucion");
        } else {
            for (int i = 0; i < o.length; i++) {
                if (o[i] != -1) {
                    if (o[i] <= m) {
                         var = o[i];
                        m =m -o[i];
                        mostrar(var, m);
                        o[i] = -1;
                        llenar(m, o);
                           o[i] = var;
                        m += o[i];
                        System.out.println("se saco el objeto: "+var+" la mochila quedo con espacio de: "+m);
                   
                      }
                }

            }
        }

    }

    public static void mostrar(int o, int m) {

        System.out.print("Entro el objeto de peso: " + o + " La mochila tiene cupo de " + m);

        System.out.println(" ");

    }
}
