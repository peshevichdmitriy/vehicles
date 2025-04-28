public abstract class CargoVehicle extends Vehicle implements Transportation{
    public Cargo cargo;

    public CargoVehicle(Cargo cargo){
        this.cargo = cargo;
    }
}
