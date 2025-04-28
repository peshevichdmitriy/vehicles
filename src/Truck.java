public class Truck extends CargoVehicle implements Transportation{
    private final Wheel wheel1;
    private final Wheel wheel2;
    private final Wheel wheel3;
    private final Wheel wheel4;

    public Truck(Cargo cargo){
        super(cargo);
        this.wheel1 = new Wheel("Truck whell");
        this.wheel2 = new Wheel("Truck whell");
        this.wheel3 = new Wheel("Truck whell");
        this.wheel4 = new Wheel("Truck whell");
    }
    @Override
    public void addCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
