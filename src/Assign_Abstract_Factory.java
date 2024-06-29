//interface Car {
//    void draw();
//}
//  class SportsCar implements Car {
//    @Override
//    public void draw() {
//        System.out.println("Inside RoundedRectangle::draw() method.");
//    }
//}
// class SUVCar implements Car {
//    @Override
//    public void draw() {
//        System.out.println("Inside RoundedSquare::draw() method.");
//    }
//}
//
//abstract class AbstractFactory {
//    abstract Car getcar(String carType) ;
//}
//class SPortsFactory extends AbstractFactory {
//    @Override
//    public Car getcar(String carType){
//        if(carType.equalsIgnoreCase("Sports")){
//            return new SportsCar();
//        }else if(carType.equalsIgnoreCase("SUVCar")){
//            return new SUVCar();
//        }
//        return null;
//    }
//}
//class SUVFactory extends AbstractFactory {
//    @Override
//    public Car getcar(String carType){
//        if(carType.equalsIgnoreCase("Sports")){
//            return new SportsCar();
//        }else if(carType.equalsIgnoreCase("SUV")){
//            return new SUVCar();
//        }
//        return null;
//    }
//}
//class FactoryProducer {
//    public static AbstractFactory getFactory(boolean car){
//        if(car){
//            return new SPortsFactory();
//        }else{
//            return new SUVFactory();
//        }
//    }
//}
//
//
//
//public class Assign_Abstract_Factory {
//    public static void main(String[] args) {
//
//        AbstractFactory carFactory = FactoryProducer.getFactory(false);
//        Car car = carFactory.getcar("Sports");
//        car.draw();
//        Car car2 = carFactory.getcar("SUV");
//        car2.draw();
//
//    }
//}
