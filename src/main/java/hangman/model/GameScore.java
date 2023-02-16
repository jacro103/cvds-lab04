package hangman.model;

/**
 * Interface about the diferente forms to calculate de game score
 */
public interface GameScore{
    
    public int calculateScore(int correctCount , int incorrectCount );
}