package hangman;
import org.junit.Assert;
import org.junit.Test;

import hangman.model.GameScore;
import hangman.model.OriginalScore;

public class GameScoreTest {

    /**
     * OriginalScore: 
     * @pre 100 puntos
     * @pos -10 letras incorrectas
     * @pos 0 min puntaje
     * PowerScore:
     * @pre 0 puntos
     * @pos -8 letras incorrectas
     * @pos 500 puntaje maximo
     * @pos 0 min puntaje 
     * BonusScore:
     * @pre 0 puntos
     * @pos -5 letras incorrectas
     * @pos +10 letras correctas
     * @pos 0 min puntaje
     */


    @Test
    public void validateGameOriginalScore() {
        GameScore gamescore = new OriginalScore();
        Assert.assertEquals(RegisterResult.VALID, );
    }
}
