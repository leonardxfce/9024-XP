package ahorcado;

import java.util.ArrayList;

public class Ahorcado {

    public String palabra;
    int letrasRestantes;
    ArrayList<String> conjuntoDePalabras = new ArrayList<>();
    int tamañoArrayLetras; //cantidad de letras que contiene la palabra
    String[] letrasPalabras; //array que contendrá las letras 'adivinadas' de la palabra elegida
    public ArrayList<String> letrasIngresadas;//array que contiene las letras que ingresa el usuario

    public Ahorcado() {
        this.letrasRestantes = 0;
        this.conjuntoDePalabras.add("buho");
        this.conjuntoDePalabras.add("caso");
        this.conjuntoDePalabras.add("auto");
        this.conjuntoDePalabras.add("gato");
    }

    void datosAhorcado() {
        this.tamañoArrayLetras = palabra.length(); //le asigna el tamaño al array dependiendo del tamaño de la palabra
        this.letrasPalabras = new String[tamañoArrayLetras]; //dimensiono el array q tendra las letras de la palabra
        this.letrasIngresadas = new ArrayList<>();
        this.letrasIngresadas.add(0, "");
    }

    void agregarPalabras() {
        this.conjuntoDePalabras.add("casa");
        this.conjuntoDePalabras.add("papel");
    }

    String elegirPalabra() {
        int tamano = this.conjuntoDePalabras.size() - 1;
        int indice = (int) (Math.random() * tamano);
        String palabraElegida = this.conjuntoDePalabras.get(indice);
        this.conjuntoDePalabras.remove(indice);
        return palabraElegida;
    }

    boolean comprobarLetra(char letra) {
        boolean z = false;
        String letraString = Character.toString(letra);
        for (int i = 0; i < this.palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                z = true;
                this.letrasRestantes--;
                letrasPalabras[i] = letraString;
            }
        }
        return z;
    }

    boolean adivinoLaPalabra() {
        boolean z = false;
        if (this.letrasRestantes == 0) {
            z = true;
        }
        return z;
    }

    String mostrarJuego() {
        String acumulador = "";
        for (int i = 0; i < palabra.length(); i++) {
            if (this.letrasPalabras[i] == null) {
                letrasPalabras[i] = " _";
            }
            acumulador = acumulador + letrasPalabras[i];
        }
        return acumulador;
    }

    boolean comprobarExistenciaDeLetra(String b) {
        boolean noExiste = true;
        for (int i = 0; i < letrasIngresadas.size(); i++) {
            String a = letrasIngresadas.get(i);
            if (b.equals(a)) {
                noExiste = false;
            }
            //al comenzar el array tiene en la primera posicion un "", debe ser eliminado
            if (letrasIngresadas.get(0) == "") {
                letrasIngresadas.remove(0);
            }
        }
        if (noExiste == true) {
            letrasIngresadas.add(b);
        }
        return noExiste;
    }

}
