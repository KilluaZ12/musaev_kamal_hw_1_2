public class Main {
    public static void main(String[] args) {
        Mammal objectA = new Mammal("Elephant", 20, new Habitat("Savannah"));
        Human objectB = new Human("Homo sapiens", 30, new Habitat("City"), "John");
        Human objectC = new Human("Homo sapiens", 25, new Habitat("Village"), "Jane");

        System.out.println(objectA.getSpecies() + " " + objectA.getAge() + " " + objectA.getHabitat().getType());
        System.out.println(objectB.getName() + " " + objectB.getSpecies() + " " + objectB.getAge() + " " + objectB.getHabitat().getType());
        System.out.println(objectC.getName() + " " + objectC.getSpecies() + " " + objectC.getAge() + " " + objectC.getHabitat().getType());

        objectA.printInfo();
        objectB.printInfo();
        objectC.printInfo();

        objectA.eat();
        objectB.eat();
        objectC.eat();
    }
}