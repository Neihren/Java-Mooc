public class Part02_11 {

    // Programming exercice: Greatest
    public static void main(String[] args) {
        int anwser = greatest(2, 7, 3);
        System.out.println("greatest: " + anwser);
    }

    public static int greatest(int number1, int number2, int number3) {
        if (number1 > number2) {
            if (number1 > number3) {
                return (number1);
            }
        }
        else {
            if (number2 > number3) {
                return (number2);
            }
        }
        return (number3);
    }
}