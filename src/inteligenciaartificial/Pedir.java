package inteligenciaartificial;

import java.util.Scanner;

public class Pedir {

    String nombre;
    Scanner sc = new Scanner(System.in);

    public String nombre() {
        System.out.println("Introduce nombre");
        return sc.nextLine();
    }

}
