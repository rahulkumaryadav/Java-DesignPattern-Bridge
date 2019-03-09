package vehicleExample;

public class Car extends Vehicle {
    public Car(WorkShop workShop, WorkShop workShop2) {
        super(workShop, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Car..");
        workShop.work();
        workShop2.work();
    }
}
