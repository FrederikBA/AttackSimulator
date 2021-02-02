import java.time.LocalTime;

public class Vampire implements Attack {
    private String name;

    public Vampire(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int monsterAttack() {
        LocalTime lt = LocalTime.now();
        int strength = lt.getHour() + 1;
        return strength;
    }

    @Override
    public String toString() {
        return name + " Strength: " + monsterAttack();
    }
}
