
public class MainDriver {

    public static void main(String[] args) {
        Student myself = new Student(7654321, "Chris", "Smith", 6274530);
        System.out.printf("Student ID: %d%nName: %s %s%nPhone: %d%n", myself.getId(), myself.getGivenName(), myself.getFamilyName(), myself.getPhone());
    }
}
