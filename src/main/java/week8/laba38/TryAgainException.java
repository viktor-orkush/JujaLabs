package week8.laba38;

/**
 * Created by Viktor on 25.08.2017.
 */
class TryAgainException extends Exception {

    public TryAgainException() {
        System.out.println("Ничего не сделано повторить транзакцию");
    }
}