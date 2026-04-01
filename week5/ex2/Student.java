public class Student extends Person {
    private int id;

    public Student() {
        this.id = 0;
        setGivenName("John");
        setFamilyName("Smith");
        setPhone(1111111);
    }
    public Student(int id, String givenName, String familyName, int phone) {
        this.id = id;
        setGivenName(givenName);
        setFamilyName(familyName);
        setPhone(phone);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}