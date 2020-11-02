package yy;

import yy.game.Game;
import yy.game.sub.Cricket;
import yy.game.sub.Football;

public class Client {
    public static void main(String[] args) {

        Game cricket = new Cricket();
        cricket.play();

        Game footBall = new Football();
        footBall.play();
    }
}