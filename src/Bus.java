public class Bus implements Travel{
    int Price = cost();
    public int cost() {
        return 300;
    }
    public void Beijing(int Funds) {
        if(Funds >= Price)
            System.out.println("I can take a bus to Beijing");
    }
}