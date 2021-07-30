public class Car implements Travel{
    int Price = cost();
    public int cost() {
        return 500;
    }
    public void Beijing(int Funds) {
        if(Funds >= Price)
            System.out.println("I can Drive to Beijing");
    }
}