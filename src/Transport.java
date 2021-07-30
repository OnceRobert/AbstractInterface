interface Travel{
    int cost();
    void Beijing(int Funds);
}

public class Transport{
    public static void main (String args[]){
        //System.out.print("Yes");
        Train Plans = new Train();
        Plans.Beijing(500);
        Bus P1 = new Bus();
        P1.Beijing(500);

        Car P2 = new Car();
        P2.Beijing(500);

        Plane P3 = new Plane();
        P3.Beijing(500);
    }

}
