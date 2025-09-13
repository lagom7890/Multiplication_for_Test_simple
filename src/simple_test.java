import java.security.SecureRandom;
import java.util.Scanner;

public class simple_test {

        private static final SecureRandom rn = new SecureRandom();
        public static void main(String[] args) {

            Scanner ip = new Scanner(System.in);
            boolean flag1 = true;

            System.out.println("If you want to stop, you can press <ctrl> + d in windows or <ctrl> + z in mac or linux.");

            while (flag1) {
                int firstNumber = 1 + rn.nextInt(9);
                int secondNumber = 1 + rn.nextInt(9);

                System.out.printf("How much is %d times %d?%n", firstNumber, secondNumber);
                int input = ip.nextInt();

                //calculate the question
                int result = firstNumber * secondNumber;

                //analyze
                if (result == input) {
                    System.out.println(correct());
                } else {
                    boolean flag2 = false;
                    while (!flag2) {
                        System.out.println(incorrect());
                        System.out.printf("How much is %d times %d?%n", firstNumber, secondNumber);
                        int input1 = ip.nextInt();
                        if (result == input1) {
                            System.out.println(correct());
                            flag2 = true;
                        }
                    }
                }
            }
        }
        public static String correct(){

            int responseNumber = 1 + rn.nextInt(4);
            switch (responseNumber){
                case 1:
                    return "Very good!";
                case 2:
                    return "Excellent!";
                case 3:
                    return "Nice work!";
                case 4:
                    return "Keep up the good work!";
                default:
                    break;
            }
            return "Correct";
        }
        public static String incorrect(){
            int responseNumber = 1 + rn.nextInt(4);
            switch (responseNumber){
                case 1:
                    return "No. Please try again!";
                case 2:
                    return "Wrong. Try once more.";
                case 3:
                    return "Don't give up!";
                case 4:
                    return "No. Keep trying.";
                default:
                    break;
            }
            return "incorrect";
        }

    

}
