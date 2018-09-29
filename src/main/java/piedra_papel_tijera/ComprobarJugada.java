/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijera;

/**
 * @author caro_
 */
public class ComprobarJugada {
    public String comprobar(int jugadaComputadora, String datoUsuario) {

        String posibilidades[] = {"tijera", "piedra", "papel"};
        if (datoUsuario.equals(posibilidades[jugadaComputadora])) {
            return "empato";
        }
        if ((datoUsuario.equals("tijera")) && (posibilidades[jugadaComputadora].equals("papel")) ||
                (datoUsuario.equals("papel")) && (posibilidades[jugadaComputadora].equals("piedra")) ||
                (datoUsuario.equals("piedra")) && (posibilidades[jugadaComputadora].equals("tijera"))) {
            return "gano";
        } else {
            return "perdio";
        }

    }

    public String jugarTresVeces(int jugadaComputadora, String datoUsuario) {
        String resultJugada[] = new String[3];
        for (int i = 0; i < 3; i++) {
            resultJugada[i] = this.comprobar(jugadaComputadora, datoUsuario);

        }
        return "";

    }

    public String computadoraResult(int numA) {
        String posibilidades[] = {"tijera", "piedra", "papel"};
        String retor = "La jugada de la computadora fue: " + posibilidades[numA];
        return retor;
    }

}
