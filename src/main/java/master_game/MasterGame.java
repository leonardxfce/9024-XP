package master_game;

import java.util.Scanner;

public class MasterGame {

    Game juego;

    public MasterGame(Game juego) {
        this.juego = juego;
    }

    public void play() {
        Scanner teclado = new Scanner(System.in);
        juego.jugada(teclado.nextLine());
    }
}
