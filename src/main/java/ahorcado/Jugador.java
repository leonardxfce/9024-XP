package ahorcado;

import java.util.Scanner;

public class Jugador {
    String nombre;
    int vidas;
    Scanner read = new Scanner (System.in);

    public Jugador() {
        this.vidas = 3;
    }
    
    String  ingresarLetra (){
         String letra = read.next();
         return letra;
    }

}
