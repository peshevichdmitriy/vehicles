public class Truck extends Vehicle implements Transportation{
    private final Wheel wheel1;
    private final Wheel wheel2;
    private final Wheel wheel3;
    private final Wheel wheel4;

    public Truck(){
        this.wheel1 = new Wheel("Truck whell");
        this.wheel2 = new Wheel("Truck whell");
        this.wheel3 = new Wheel("Truck whell");
        this.wheel4 = new Wheel("Truck whell");
    }
    @Override
    public void carryCargo() {

    }
}
