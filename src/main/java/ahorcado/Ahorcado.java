package ahorcado;

import java.util.ArrayList;

public class Ahorcado {

    public String palabra;
    public ArrayList<String> letrasIngresadas;//array que contiene las letras que ingresa el usuario
    int letrasRestantes;
    ArrayList<String> conjuntoDePalabras = new ArrayList<>();
    int tamañoArrayLetras; //cantidad de letras que contiene la palabra
    String[] letrasPalabras; //array que contendrá las letras 'adivinadas' de la palabra elegida

    public Ahorcado() {
        letrasRestantes = 0;
        conjuntoDePalabras.add("buho");
        conjuntoDePalabras.add("caso");
        conjuntoDePalabras.add("auto");
        conjuntoDePalabras.add("gato");
    }

    void datosAhorcado() {
        tamañoArrayLetras = palabra.length(); //le asigna el tamaño al array dependiendo del tamaño de la palabra
        letrasPalabras = new String[tamañoArrayLetras]; //dimensiono el array q tendra las letras de la palabra
        letrasIngresadas = new ArrayList<>();
        letrasIngresadas.add(0, "");
    }

    void agregarPalabras() {
        conjuntoDePalabras.add("papel");
        conjuntoDePalabras.add("casa");
    }

    String elegirPalabra() {
        int tamano = conjuntoDePalabras.size();
        int indice = (int) (Math.random() * tamano);
        String palabraElegida = conjuntoDePalabras.get(indice);
        conjuntoDePalabras.remove(indice);
        return palabraElegida;
    }

    boolean comprobarLetra(char letra) {
        boolean z = false;
        String letraString = Character.toString(letra);
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                z = true;
                letrasRestantes--;
                letrasPalabras[i] = letraString;
            }
        }
        return z;
    }

    boolean adivinoLaPalabra() {
        boolean z = false;
        if (letrasRestantes == 0) {
            z = true;
        }
        return z;
    }

    String mostrarJuego() {
        String acumulador = "";
        for (int i = 0; i < palabra.length(); i++) {
            if (letrasPalabras[i] == null) {
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
        if (noExiste) {
            letrasIngresadas.add(b);
        }
        return noExiste;
    }

}
