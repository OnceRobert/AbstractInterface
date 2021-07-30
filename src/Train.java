public class Train implements Travel{
    int Price = cost();
    public int cost() {
        return 400;
    }

    @Override
    public void Beijing(int Funds) {
        if(Funds >= Price)
            System.out.println("I can take a train to Beijing");
    }
}