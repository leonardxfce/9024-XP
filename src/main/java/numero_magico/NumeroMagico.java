package numero_magico;

public class NumeroMagico {

    int numMagico;

    int crearNumeroMagico() {
        this.numMagico = (int) (Math.random() * 100) + 1;
        return numMagico;
    }

    String compararNumeros(int numUsuario) {
        if (numUsuario < numMagico) {
            return "Mayor";
        } else if (numUsuario == numMagico) {
            return "Igual";
        } else {
            return "Menor";
        }
    }

}
