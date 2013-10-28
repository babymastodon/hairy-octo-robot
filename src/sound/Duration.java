package sound;

/**
 * A musical duration, represented
 * as a fraction in reduced form.
 */
public class Duration {

    private int numerator;
    private int denominator;


    /**
     * Create a duration object with the given numerator
     * and denominator.
     *
     * The arguments need not be in reduced-form, but when
     * the duration is constructed, they are reduced.
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
     * Get the numerator of the duration in reduced form.
     *
     * @return the numerator
     */
    public int getNumerator(){
        return numerator;
    }

    /**
     * Get the denominator of the duration in reduced form.
     *
     * @return the denominator 
     */
    public int getDenominator(){
        return denominator;
    }

    /**
     * Add this duration to the other duration and return
     * a new Duration containing the sum (in reduced form).
     *
     * @return a new duration contianing this + other
     */
    public Duration add(Duration other){
        return new Duration(numerator*other.denominator + other.numerator*denominator,
                            denominator*other.denominator);
    }

    /**
     * Multiply this duration with the other duration and return
     * a new Duration containing the product (in reduced form).
     *
     * @return A new duration containing this * other
     */
    public Duration mul(Duration other){
        return new Duration(numerator * other.numerator,
                            denominator * other.denominator);
    }

    /**
     * Divide this duration by the other duration and return
     * a new Duration containing the quotient (in reduced form).
     *
     * @return A new duration containing this / other
     */
    public Duration div(Duration other){
        return new Duration(numerator * other.denominator,
                            denominator * other.numerator);
    }

    private void reduce(){
        for (int i=2; i<=numerator; i++){
            while (numerator%i == 0 && denominator%i == 0){
                numerator /= i;
                denominator /= i;
            }
        }
    }


    /**
     * Two durations are equal if their fractions (numerator/denominator)
     * have the same value.
     *
     * @return true of the two objects are semanticaly equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Duration that = (Duration) obj;
        return this.numerator == that.numerator &&
            this.denominator == that.denominator;
    }

    /**
     * Updated to reflect the new equals function.
     *
     * @return an integer hashcode.
     */
    @Override
    public int hashCode() {
        return numerator * 1253 + denominator * 91;
    }

}
