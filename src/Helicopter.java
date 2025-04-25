public class Helicopter extends  Vehicles implements Transportation{
    private final Wheel wheel1, wheel2, wheel3;
    private final Propeller propeller1, propeller2;

    public Helicopter(){
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wheel3 = new Wheel();
        this.propeller1 = new Propeller();
        this.propeller2 = new Propeller();
    }
    @Override
    public void carriesCargo() {

    }
}
