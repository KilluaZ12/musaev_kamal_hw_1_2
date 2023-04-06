public class Human extends Mammal {
    private String name;

    public Human(String species, int age, Habitat habitat, String name) {
        super(species, age, habitat);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printInfo() {
        String var10001 = this.name;
        System.out.println("This is a human of name: " + var10001 + ", species: " + this.getSpecies() + ", age: " + this.getAge() + ", and habitat: " + this.getHabitat().getType());
    }
}
