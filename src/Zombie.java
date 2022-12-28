public class Zombie extends Monster{
    private String name;

    String className = this.getClass().getName();

    public Zombie(String name) {
        super(name, 5);
        System.out.println("Monster " + name + " the Zombie was created");
        this.name = name;
    }

    public void growl(){
        System.out.print("Raaaauuughhhh");
    }

    public void attack(){
        System.out.println("Monster " + name + " the " + className + "attacked with damage 5");
    }

}
