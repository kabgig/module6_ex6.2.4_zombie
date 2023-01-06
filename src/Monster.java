public abstract class Monster {
    //Fix this class
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    public abstract void attack(Monster monster);

    protected boolean damage(int dhp) {
        hp -= dhp;
        return hp <= 0;
    }

    public boolean isDestroyed(){
        return hp <= 0;
    }

    protected int getForce() {
        return force;
    }

}
