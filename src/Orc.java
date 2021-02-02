import java.util.Random;

public class Orc implements Attack {
    private String name;
    private Random rd;

    public Orc(String name) {
        this.name = name;
        rd = new Random();
    }

    public String getName() {
        return name;
    }


    public int monsterAttack() {
        int strength = 1 + rd.nextInt(44);
        return strength;
    }

    @Override
    public String toString() {
        return name + " Strength: " + monsterAttack();
    }
}

