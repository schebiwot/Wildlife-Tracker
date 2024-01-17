public class EndangeredAnimal extends Animal {
    public String health;
    public String age;

    public EndangeredAnimal(int id, String name, String health, String age) {
        super(id, name);
        this.health = health;
        this.age = age;
    }
}