package ta_te_ti;

public class Tateti {

    public static void main(String[] args) {
        Jugada jugadas = new Jugada();
        Tablero miTablero = new Tablero();
        int contador = 0;
        boolean bandera = false;
        int campodejuego[] = miTablero.retornoArray();
        while (contador == 9) {
            int valor = jugadas.pedirNumero();
            if(campodejuego[valor] != 0){
                bandera = true;
            }
            if(bandera==false){
               miTablero.elTablero(valor); 
            } else {
                System.out.println("la posicion esta ocupada");
            }
            contador++;
        }
        
    }
}
