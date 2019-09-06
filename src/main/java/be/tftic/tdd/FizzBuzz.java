package be.tftic.tdd;

public class FizzBuzz {


    public String generate(int minNumber, int maxNumber) {
        return evaluateNumbers(minNumber, maxNumber);

    }

    private String evaluateNumbers(int minNbr, int maxNbr) {
        String result = "";
        while (minNbr <= maxNbr) {
            result += evaluateNumber(minNbr++);
        }
        return result;
    }

    private String evaluateNumber(int n) {
        return (n % 15 == 0) ? "FizzBuzz" : (n % 3 == 0
        ) ? "Fizz" : (n % 5 == 0) ? "Buzz" :
                String.valueOf(n);
    }
}
