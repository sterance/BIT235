public class Main {
    public static void main(String[] args) {
        Animal spot = new Animal();
        spot.species = "dog";
        spot.age = 5;
        Animal moustache = new Animal();
        moustache.species = "cat";
        moustache.age = 2;
        System.err.printf("The first animal is a %s and they are %d years old.%n", spot.species, spot.age);
        System.err.printf("The second animal is a %s and they are %d years old.%n", moustache.species, moustache.age);
    }
}