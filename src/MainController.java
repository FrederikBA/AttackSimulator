public class MainController {

    public void runProgram() {
        Orc orc = new Orc("Thrall");
        Vampire vampire = new Vampire("Dracula");
        for (int i = 0; i < 10; i++) {
            System.out.println(orc.getName() + " strength: " + orc.monsterAttack());
            System.out.println(vampire.getName() + " strength: " + vampire.monsterAttack());
            if (orc.monsterAttack() > vampire.monsterAttack()) {
                System.out.println(orc.getName() + " wins!" + "\n");
            } else {
                System.out.println(vampire.getName() + " wins!" + "\n");
            }
        }

    }

}
