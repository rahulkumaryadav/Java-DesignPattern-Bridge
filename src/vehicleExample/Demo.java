package vehicleExample;

public class Demo {
    public static void main(String[] args) {
        Vehicle bmw=new Car(new Make(),new Assemble());
        bmw.manufacture();


        Vehicle bmx=new Bike(new Make(),new Assemble());
        bmx.manufacture();
    }
}
