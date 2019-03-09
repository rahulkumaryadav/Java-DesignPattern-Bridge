package vehicleExample;

public class Bike extends Vehicle {
    public Bike(WorkShop workShop, WorkShop workShop2) {
        super(workShop, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike ....");
        workShop.work();
        workShop2.work();

    }
}
