package academy.mindswap;

public class Worskhop {
    private Worskhop(){};

    public static Tire[] changeTires(int integrityLimit,Tire[] tires){
        for (int i = 0; i < tires.length; i++) {
            if(tires[i].getIntegrity() < integrityLimit){
                tires[i] = new Tire();
            }
            System.out.println(tires[i].getIntegrity());
        }
        return tires;
    }
}
