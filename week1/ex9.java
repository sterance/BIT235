
import java.util.Scanner;

class ex9 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a username: ");
        String username = myObj.nextLine();
        System.out.println("Enter a password: ");
        String password = myObj.nextLine();
        if (username.equals("admin") && password.equals("java123")) {
            System.out.println("Login Successful.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
