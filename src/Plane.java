
public class Plane implements Travel{
    int Price = cost();
    public int cost() {
        return 1000;
    }
    public void Beijing(int Funds) {
        if(Funds >= Price)
            System.out.println("I can Fly to Beijing");
    }
}