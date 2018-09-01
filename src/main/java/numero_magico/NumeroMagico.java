package numero_magico;

public class NumeroMagico {

    int crearNumeroMagico() {
        int coso = (int) (Math.random() * 100) + 1;
        return coso;
    }

    String compararNumeros(int numUsuario) {
        int NumeroMagico = 70;
        if (numUsuario<NumeroMagico){
        return "MAYOR";
        }
        else if (numUsuario == NumeroMagico) {
            return "IGUAL";
        }
        else{
        return "MENOR";
                }
    }
     
}
