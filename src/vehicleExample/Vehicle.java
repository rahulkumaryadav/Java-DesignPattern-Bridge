package vehicleExample;

abstract class Vehicle {
    WorkShop workShop;
    WorkShop workShop2;


    public Vehicle(WorkShop workShop, WorkShop workShop2) {
        this.workShop = workShop;
        this.workShop2 = workShop2;
    }

    public abstract void manufacture();
}
