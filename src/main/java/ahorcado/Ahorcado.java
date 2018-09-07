package ahorcado;

import java.util.ArrayList;

public class Ahorcado {
    public String palabra;
    int letraRestantes;
    int vidas;
    ArrayList<String> conjuntoDePalabra = new ArrayList<>();

    public Ahorcado() {
        this.letraRestantes = 0;
        this.vidas = 3;
        this.conjuntoDePalabra.add("buho");
        this.conjuntoDePalabra.add("casa");
        this.conjuntoDePalabra.add("auto");
        this.conjuntoDePalabra.add("gato");
    }
    
    String elegirPalabra () {
        int tamano = this.conjuntoDePalabra.size()-1;
        int indice = (int) (Math.random()*tamano);
        String palabraElegida=this.conjuntoDePalabra.get(indice);
        this.conjuntoDePalabra.remove(indice);
        return palabraElegida;
    }

    boolean  comprobarLetra(char letra ) {
        boolean z=false;
        
        for (int i=0 ; i< this.palabra.length() ; i++){
            if (palabra.charAt(i) == letra){
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
    /*String comprobarVidas (){
        String estado;
        if (this.vidas == 0 ){
            estado = "Perdiste";
        }
        return estado;
    }*/
}
