public class Speedboat extends Vehicle implements Transportation{
    private final Propeller propeller;

    public Speedboat(){
        this.propeller = new Propeller("Speedboat propeller");
    }
    @Override
    public void carryCargo() {

    }
}
