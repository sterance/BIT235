
public class Driver {

    public static void main(String[] args) {
        System.out.println(flip("Fred"));
    }

    public static StringBuilder flip(String input) {
        StringBuilder output = new StringBuilder(input);
        return output.reverse();
    }
}
