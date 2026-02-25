public class ex8 {
    public static void main(String[] args) {
        int temperature = 32;
        if (temperature > 30) {
            System.out.println("It is hot.");
        }
        if (temperature <= 30 && temperature >= 20) {
            System.out.println("It is mild.");
        }
        if (temperature < 20) {
            System.out.println("It is cold.");
        }
    }
}