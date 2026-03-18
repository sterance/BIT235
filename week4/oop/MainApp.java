
public class MainApp {

    public static void main(String[] args) {
      System.out.println("Hello from my first class");
      Greeting initialGreeting = new Greeting();
      initialGreeting.sayHello("Chris");
      Greeting subsequentGreeting = new Greeting();
      subsequentGreeting.sayHello("Linus Torvalds");
      Student firstStudent = new Student();
      firstStudent.studentID = "s1564427";
      Student secondStudent = new Student();
      secondStudent.studentID = "abc123";
      firstStudent.displayID(firstStudent.studentID);
      secondStudent.displayID(secondStudent.studentID);
    }
}
