public class GiantSnake extends Monster {

    public static String scream = "SSSSSS";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 7);
    }

    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean volume) {
        if (volume)
            System.out.print(scream.toUpperCase());
        else
            System.out.print(scream);
        super.growl();
    }

    public void attack() {
        super.attack();
        growl();
    }

}
