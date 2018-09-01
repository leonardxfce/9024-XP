package numero_magico;

public class NumeroMagico {

    int crearNumeroMagico() {
        int coso = (int) (Math.random() * 100) + 1;
        System.out.println("este es el numero"+coso);
        return coso;
    }

    String compararNumeros(int numUsuario) {
        int NumeroMagico = 70;
        System.out.println("El numero aleatorio es"+NumeroMagico);
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
