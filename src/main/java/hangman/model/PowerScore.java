package hangman.model;

public class PowerScore implements GameScore{

    /**
     * @pre 0 puntos
     * @pos -8 letras incorrectas
     * @pos 500 puntaje maximo
     * @pos 0 min puntaje 
     * @param correctCount puntaje de letras acertadas
     * @param incorrectCount puntaje de letras no acertadas
     * @throws
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
