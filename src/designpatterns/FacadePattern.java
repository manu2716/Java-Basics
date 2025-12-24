package designpatterns;

// this example can also be explained with Shape interface like Factory Pattern
interface Vehicle{
    void type();
}

class Car implements Vehicle{
    @Override
    public void type(){
        System.out.println("Car");
    }
}

class Bike implements Vehicle{
    @Override
    public void type(){
        System.out.println("Bike");
    }
}

class Bus implements Vehicle{
    @Override
    public void type(){
        System.out.println("Bus");
    }
}

class VehicleSelector{

    private Vehicle car;
    private Vehicle bus;
    private Vehicle bike;

    public VehicleSelector(){
        car = new Car();
        bike = new Bike();
        bus = new Bus();
    }

    public void vehicleCar(){
        car.type();
    }

    public void vehicleBike(){
        bike.type();
    }
    public void vehicleBus(){
        bus.type();
    }
}

public class FacadePattern {

    public static void main(String[] args) {
        VehicleSelector vehicleSelector = new VehicleSelector();

        vehicleSelector.vehicleCar();
        vehicleSelector.vehicleBike();
        vehicleSelector.vehicleBus();
    }
}
