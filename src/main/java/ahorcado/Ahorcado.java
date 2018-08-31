package ahorcado;

import java.util.ArrayList;

public class Ahorcado {
    String palabras;
    int letraRestantes;
    int vidas;
    ArrayList<String> conjuntoDePalabra = new ArrayList<String>();

    public Ahorcado() {
        this.palabras = "buho";
        this.letraRestantes = palabras.length();
        this.vidas = 3;
        this.conjuntoDePalabra.add("buho");
        this.conjuntoDePalabra.add("casa");
        this.conjuntoDePalabra.add("auto");
        this.conjuntoDePalabra.add("gato");
    }
    
    String elegirPalabra () {
        int tamaño = this.conjuntoDePalabra.size()-1;
        int indice = (int) (Math.random()*tamaño);
        String palabra=this.conjuntoDePalabra.get(indice);
        this.conjuntoDePalabra.remove(indice);
        System.out.println(palabra);
        return palabra;
    }

    boolean  comprobarLetra(char letra) {
        boolean z=false;
        
        for (int i=0 ; i< palabras.length() ; i++){
            if (palabras.charAt(i) == letra){
                z=true;
                this.letraRestantes --; 
            }
        }
        return z;
    }
    boolean adivinoLaPalabra(){
        boolean z=false;
        if (this.letraRestantes==0){
        z=true;
        }
        return z;
    }
    int vidasRestantes(boolean z){
        boolean vida = true;
        if (z == false){
            this.vidas -- ;
        }
        return this.vidas;
    }
}
