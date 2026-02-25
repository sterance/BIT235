
import java.util.Scanner;

class ex07 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a mark (0-100): ");

        String userInput = myObj.nextLine();
        int mark = Integer.parseInt(userInput);
        if (mark > 100 || mark < 0) {
            System.out.println("invalid input");
        } else {
            if (mark > 80) {
                System.out.println("HD");
            } else if (mark > 70) {
                System.out.println("D");
            } else if (mark > 60) {
                System.out.println("C");
            } else if (mark > 50) {
                System.out.println("P");
            } else {
                System.out.println("F");
            }
        }
    }
}
