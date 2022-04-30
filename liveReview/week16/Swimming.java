package week16;

public class Swimming extends  Exercise{

    @Override
    public void perform() {
        System.out.println("Swimming in the pool doing laps");
    }

    @Override
     public int getCaloriesCount(int minutes) {
        return minutes*11;
    }


}
