public class Mammal extends Animal {
    private int age;
    private Habitat habitat;

    public Mammal(String species, int age, Habitat habitat) {
        super(species);
        this.age = age;
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public Habitat getHabitat() {
        return habitat;
    }


    public void printInfo() {
        System.out.println("This is a mammal of species: " + getSpecies() + ", age: " + age + ", and habitat: " + habitat.getType());
    }

    // non-rewritable method
    public final void eat() {
        System.out.println("The mammal is eating.");
    }
}
