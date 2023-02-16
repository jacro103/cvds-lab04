package hangman.model;

public class BonusScore implements GameScore{

    /**
     * @pre 0 puntos
     * @pos -5 letras incorrectas
     * @pos +10 letras correctas
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
