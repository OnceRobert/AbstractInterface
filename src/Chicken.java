abstract class Sales{
    abstract int price();
    abstract int amount();
}

class Cock extends Sales{
    public int price(){
        return 5;
    }
    public int amount(){
        return 1;
    }
}

class Hen extends Sales{
    public int price(){
        return 3;
    }
    public int amount(){
        return 1;
    }
}

class Chickens extends Sales{
    public int price(){
        return 1;
    }
    public int amount(){
        return 3;
    }
}

public class Chicken{
    public static void main(String[] args){
        int Cocks = 0, Hens = 0, Chicks = 0, Money = 100, Total = 0;
        Cock C = new Cock();
        Hen H = new Hen();
        Chickens Ch = new Chickens();
        int MaxC = Money/C.price() + 1;
        int MaxH = Money/H.price() + 1;
        int MaxCh = Money/Ch.price() + 1;
        for(Cocks = MaxC;Cocks>=0;Cocks--){
            for (Hens = MaxH; Hens>=0;Hens--) {
                for (Chicks = MaxCh; Chicks >= 0; Chicks--) {
                    Total = Cocks * C.amount() + Hens * H.amount() + Chicks * Ch.amount();
                    Money = 100 - (Cocks * C.price() + Hens * H.price() + Chicks * Ch.price());
                    //System.out.println("Cock :" + Cocks + " Hens :" + Hens + " Chicks :" + Chicks + " Total :" + Total + " Money :" + Money);
                    if (Total == 100 && Money == 0) {
                        System.out.println("You must buy these amount of Cock :" + Cocks * C.amount() + " Hens :" + Hens * H.price() + " Chicks :" + Chicks * Ch.amount());

                    }
                }
            }
        }
    }
}