package hangman.model;

public class PowerScore implements GameScore{

    /**
     * @pre
     * @pos
     * @param correctCount puntaje de letras acertadas
     * @param incorrectCount puntaje de letras no acertadas
     * @throws
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
