public class Driver {
  public static void main(String[] args) {
    Animal cat = new Animal();
    Animal dog = new Animal();
    cat.setName("Anton");
    cat.setAge(3);
    dog.setName("Spot");
    dog.setAge(12);
    System.out.printf("The cat's name is %s, and they are %d years old.%nThe dog's name is %s, and they are %d years old.%n", cat.getName(), cat.getAge(), dog.getName(), dog.getAge());
  }
}