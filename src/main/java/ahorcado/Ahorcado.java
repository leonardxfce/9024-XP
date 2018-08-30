package ahorcado;

public class Ahorcado {
    String palabras;
    int letraRestantes;
    int vidas;

    public Ahorcado() {
        this.palabras = "buho";
        this.letraRestantes = palabras.length();
        this.vidas = 3;

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
