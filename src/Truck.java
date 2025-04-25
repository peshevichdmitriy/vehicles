public class Truck extends Vehicles implements Transportation{
    private final Wheel wheel1, wheel2, wheel3, wheel4;

    public Truck(){
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wheel3 = new Wheel();
        this.wheel4 = new Wheel();
    }
    @Override
    public void carriesCargo() {

    }
}
