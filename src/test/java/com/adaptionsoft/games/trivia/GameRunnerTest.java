package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.trivia.runner.GameRunner;
import com.adaptionsoft.games.uglytrivia.Game;
import org.junit.Test;

import java.util.Random;

public class GameRunnerTest {

    @Test
    public void gameRunner() {
        Game aGame = new Game();

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        Random rand = new Random(1);

        boolean winner = false;
        while(! winner) {

            aGame.roll(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                aGame.currentPlayGaveWrongAnswer();
            } else {
                winner = aGame.currentPlayerGaveCorrectAnswer();
            }



        };

    }
}
