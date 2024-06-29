class Car{

}
class Manual{

}

 interface Builder {
    void reset();
    void setSeats(int i);
    void SetEngine(String new_sportsEngine);
    void setTripComputer(boolean b);
    void GPS(boolean b);
}
  class CarBuilder implements Builder {
      private Car car;



      CarBuilder(){
          this.reset();
      }
      public void reset(){
          this.car = new Car();
      }
      public void setSeats(int i){
          this.car = new Car();
      }

      @Override
      public void SetEngine(String new_sportsEngine) {
          this.car = new Car();
      }

      @Override
      public void setTripComputer(boolean b) {
        this.car = new Car();
      }

      @Override
      public void GPS(boolean b) {
        this.car = new Car();
      }


      public Car getCar() {
          return car;
      }
  }
  class CarManualBuilder implements Builder{
      private Manual Manual;
      void carManualBuilder(){
          this.reset();
      }

      @Override
      public void reset() {
          this.Manual = new Manual();
      }

      @Override
      public void setSeats(int i) {
        this.Manual = new Manual();
      }

      @Override
      public void SetEngine(String new_sportsEngine) {
       this.Manual = new Manual();
      }

      @Override
      public void setTripComputer(boolean b) {
          this.Manual = new Manual();
      }

      @Override
      public void GPS(boolean b) {
           this.Manual = new Manual();
      }
      public Manual getManualCar() {
          return Manual;
      }
  }
  class Director{
      private Builder Builder;

      public void setBuilder(Builder builder) {
          this.Builder = builder;
      }

      public void ConstructSportsCar(Builder builder){
          builder.reset();
          builder.setSeats(2);
          builder.SetEngine("New SportsEngine");
          builder.setTripComputer(true);
          builder.GPS(true);
      }
      public void ConstructSUV(Builder builder){
          builder.reset();
          builder.setSeats(7);
          builder.SetEngine("New UVEngine");
          builder.setTripComputer(true);
          builder.GPS(true);
      }
  }

public class Abstract_Factory_Pattern {
    public static void main(String[] args) {

   Director director = new Director();
   CarBuilder builder = new CarBuilder();
   director.ConstructSportsCar(builder);

//   CarManualBuilder builder = new

    }
}
