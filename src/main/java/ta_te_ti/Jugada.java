package ta_te_ti;

/**
 *
 * @author ikariRules
 */
public class Jugada {
    
    
    public void buscarGanador(int[] g){
        for (int i = 0 ; i < 2; ++i){
            if (g[i]==5){
                System.out.println("win");
            }
           // System.out.println(campoDeJuego[i]);
        }
        for (int r = 3 ; r < 5; ++r){
            if (g[r]==5){
                System.out.println("win");
            }
           // System.out.println(campoDeJuego[i]);
        }
        for (int h = 6 ; h <8 ; ++h){
            if (g[h]==5){
                System.out.println("win");
            }
           // System.out.println(campoDeJuego[i]);
        }
        for (int u = 0 ; u < g.length; ++u){
            if (g[0] == g[3] && g[3] == g[6]){
                System.out.println("win");
            }
           // System.out.println(campoDeJuego[i]);
        }
        for (int p = 0 ; p < g.length; ++p){
            if (g[1] == g[4] && g[4] == g[7]){
                System.out.println("win");
            }
           // System.out.println(campoDeJuego[i]);
        }
         for (int p = 0 ; p < g.length; ++p){
            if (g[2] == g[5] && g[5] == g[8]){
                System.out.println("win");
            }
           // System.out.println(campoDeJuego[i]);
        }
                  for (int p = 0 ; p < g.length; ++p){
            if (g[0] == g[4] && g[4] == g[8]){
                System.out.println("win");
            }
           // System.out.println(campoDeJuego[i]);
        }
                 for (int p = 0 ; p < g.length; ++p){
            if (g[2] == g[4] && g[4] == g[6]){
                System.out.println("win");
            }
           // System.out.println(campoDeJuego[i]);
        }
    }
}
