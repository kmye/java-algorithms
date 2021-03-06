package sg.com.kmye.algo.recursion;

public class SuperDigit {

    public static int superDigit(String n, int k) {
        n = n.chars().mapToLong(Character::getNumericValue).sum() * k + "";
        return (n.length() > 1) ?
                superDigit(n, 1)
                : Character.getNumericValue(n.charAt(0));
    }



}
