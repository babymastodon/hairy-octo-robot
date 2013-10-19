package sound;

public class Duration {

    private int numerator;
    private int denominator;


    /**
     * Create a duration object with the given numerator
     * and denominator. Automatically reduces the
     * fraction to lowest terms.
     *
     * @param numerator numberator of the fraction. Positive
     *      and non-zero
     * @param denominator denominator of the fraction. Positive
     *      and non-zero
     */
    public Duration(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }


    /**
     * TODO: write doc
     */
    public int getNumerator(){
        return numerator;
    }

    /**
     * TODO: write doc
     */
    public int getDenominator(){
        return denominator;
    }

    /**
     * TODO: write doc
     */
    public Duration add(Duration other){
        return new Duration(numerator + other.numerator,
                            denominator + other.denominator);
    }

    /**
     * TODO: write doc
     */
    public Duration mul(Duration other){
        return new Duration(numerator * other.numerator,
                            denominator * other.denominator);
    }

    /**
     * TODO: write doc
     */
    public Duration div(Duration other){
        return new Duration(numerator * other.denominator,
                            denominator * other.numerator);
    }

    private void reduce(){
        for (int i=2; i<numerator; i++){
            while (numerator%i == 0 && denominator%i == 0){
                numerator /= i;
                denominator /= i;
            }
        }
    }

}
