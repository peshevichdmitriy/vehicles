public class Helicopter extends CargoVehicle implements Transportation{
    private final Wheel wheel1;
    private final Wheel wheel2;
    private final Wheel wheel3;
    private final Propeller propeller1;
    private final Propeller propeller2;

    public Helicopter(Cargo cargo){
        super(cargo);
        this.wheel1 = new Wheel("Helicopter wheel");
        this.wheel2 = new Wheel("Helicopter wheel");
        this.wheel3 = new Wheel("Helicopter wheel");
        this.propeller1 = new Propeller("Helicopter propeller");
        this.propeller2 = new Propeller("Helicopter propeller");
    }
    @Override
    public void addCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
