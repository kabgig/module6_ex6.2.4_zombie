public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie ", 5);
    }

    public void growl() {
        System.out.print("Raaaauuughhhh ");
        super.growl();
    }
}
