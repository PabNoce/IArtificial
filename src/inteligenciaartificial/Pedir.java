/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Pedir {

    String nombre;
    Scanner sc = new Scanner(System.in);

    public String nombre() {
        System.out.println("Introduce nombre");
        return sc.nextLine();
    }

}
