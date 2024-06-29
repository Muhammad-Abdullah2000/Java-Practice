//interface Car {
//    void draw();
//}
//class SportsCar implements Car {
//
//    @Override
//    public void draw() {
//        System.out.println("Sports Car.");
//    }
//}
//class SUVCar implements Car {
//
//    @Override
//    public void draw() {
//        System.out.println("SUV Car.");
//    }
//}
//
//class carFactory {
//
//    //use getShape method to get object of type shape
//    public Car getcar(String carType){
//        if(carType == null){
//            return null;
//        }
//        if(carType.equalsIgnoreCase("Sports")){
//            return new SportsCar();
//
//        } else if(carType.equalsIgnoreCase("SUV")){
//            return new SUVCar();
//
//        }
//
//
//        return null;
//    }
//}
//public class Assing_Fatory {
//    public static void main(String[] args) {
//        carFactory carFactory = new carFactory();
//        Car car1 = carFactory.getcar("Sports");
//        car1.draw();
//        Car car2 = carFactory.getcar("Sports");
//        car2.draw();
//
//
//
//    }
//}
