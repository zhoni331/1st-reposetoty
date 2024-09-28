interface Transport{
    void deliver();
}
class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by the land using a truck");
    }
}
class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by the water using a ship");
    }
}
class Drone implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by the air using a drone");
    }
}
abstract class Transportfactory{
    public abstract Transport createTransport();
    public void deliverproduct(){
        Transport transport = createTransport();
        transport.deliver();
    }
}
class landTransportFactory extends Transportfactory{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
class waterTransportFactory extends Transportfactory{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
class airTransportFactory extends Transportfactory{
    @Override
    public Transport createTransport() {
        return new Drone();
    }
}
public class DeliverySystem {
    public static void main(String[] args){
        Transportfactory landFactory = new landTransportFactory();
        landFactory.deliverproduct();

        Transportfactory waterFactory = new waterTransportFactory();
        waterFactory.deliverproduct();

        Transportfactory airFactory = new airTransportFactory();
        airFactory.deliverproduct();
    }
}
