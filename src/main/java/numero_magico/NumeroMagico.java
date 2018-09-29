package numero_magico;

public class NumeroMagico {

    int numMagico;

    int crearNumeroMagico() {
        this.numMagico = (int) (Math.random() * 100) + 1;
        return this.numMagico;
    }

    String compararNumeros(int numUsuario) {
        if (numUsuario < this.numMagico) {
            return "Mayor";
        } else if (numUsuario == this.numMagico) {
            return "Igual";
        } else {
            return "Menor";
        }
    }

}
