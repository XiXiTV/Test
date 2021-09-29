package Farm;

public class Test {
    public static void main(String[] args) {
        SGfarm sGfarm=new SGfarm();
        Animal animal= sGfarm.newAnimal();
        Plant plant=sGfarm.newPlant();
        animal.show();
        plant.show();
        SRfarm sRfarm=new SRfarm();
        animal= sRfarm.newAnimal();
        plant=sRfarm.newPlant();
        animal.show();
        plant.show();
    }
}
