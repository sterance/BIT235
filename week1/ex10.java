
import java.util.Scanner;

class ex10 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a your age: ");
        String userInputAge = myObj.nextLine();
        int age = Integer.parseInt(userInputAge);
        System.out.println("Do you have a driver's license (y/n): ");
        String userInputLicense = myObj.nextLine();
        boolean license = (userInputLicense.equals("y"));

        if (age >= 18 && license) {
            System.out.println("You can drive independently.");
        } else if (age >= 16 && license) {
            System.out.println("You can drive with restrictions.");
        } else {
            System.out.println("You cannot drive.");
        }
    }
}
