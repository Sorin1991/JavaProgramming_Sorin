package week16;

public class FreeWeight extends Lifting {

    @Override
    public void perform() {
        System.out.println("Lifting Free Weight with dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return 0;
    }

    @Override
    public void endLift() {

    }
}
    /*
    How many methods does this class have to implement
     */
