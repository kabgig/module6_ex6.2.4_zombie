public class Battle {
    Monster[] m = new Monster[5];
    int count = 0;

    public void add(Monster monster) {
        if (count < 5)
            m[count++] = monster;
        else
            System.out.println("No more monsters!");
    }


}
