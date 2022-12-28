public class Monster {
    private String name;
    private int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void growl(){
        System.out.println(name + " the Zombie growled");
    }
    public void attack(){
        System.out.println("Monster " + name + " the Zombie " +
                "attacked with damage " + damage);
    }

}
