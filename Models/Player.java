package Models;

public class Player extends Person {
    private final String role;

    public Player(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println(id + " - " + name + " - " + role);
    }
}
