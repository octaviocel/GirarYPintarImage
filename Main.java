/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintablanco;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("############################");
        System.out.println("############################");
        System.out.println("##Bienvenido al Imaginator##");
        System.out.println("############################");
        System.out.println("############################");
        int ciclo = 1;
        while (ciclo != 3) {
            System.out.println("QUE QUIERES HACER");
            System.out.println("[1]Pintar Imagen");
            System.out.println("[2] Rotar Imagen");
            System.out.println("[3] Salir");
            ciclo = sc.nextInt();
            if (ciclo != 3) {
                System.out.println("Escribe el nombre con extension");
                String path = sc.next();
                if (ciclo == 1) {
                    System.out.println("Dame un cuadrante");
                    Integer cuadrante = sc.nextInt();
                    PintarImage img = new PintarImage("C:\\Users\\DELL\\Desktop\\" + path, cuadrante);
                }
                if (ciclo == 2) {
                    GirarImage gir = new GirarImage("C:\\Users\\DELL\\Desktop\\" + path);
                }
                System.out.println("\n\n\n\n");
            }

        }

    }
}
