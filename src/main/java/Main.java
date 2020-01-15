public class Main {
    public static void main(String[] args) {
       Car car = new Car("roadTripCar", 8);
       System.out.println(car.startEngine());
       System.out.println(car.accelerate());
       System.out.println(car.brake());

    }
}


        class Car {
            private String name;
            private int wheels;
            private int cylinders;
            private boolean doors;
            private int speed;
            private boolean engine;


            public Car(String name, int cylinders) {
                this.name = name;
                this.wheels = 4;
                this.speed=speed;
                this.doors= true;
                this.cylinders = cylinders;
                this.engine = true;
            }

            public String getName() {
                return name;
            }

            public int getCylinders() {
                return cylinders;
            }

            public int getSpeed() {
                return speed;
            }

            public String startEngine() {
                return "Car->startEngine()";
            }

            public String accelerate() {
              return "Car->accelerate()";
            }

            public String brake(){
                return "Car->brake()";
            }
        }

        class Tesla extends Car{
            public Tesla(String name, int cylinders) {
                super(name, cylinders);
            }

            @Override
            public String startEngine() {
                return "Tesla->startEngine()";
            }

            @Override
            public String accelerate() {
                return "Tesla->accelerate()";
            }

            @Override
            public String brake() {
                return "Tesla->brake()";
            }
        }



      //  class Mustang extends Car{
      //      public Mustang(String name, int cylinders) {
        //        super(name, cylinders);
          //  }

        //}


        //class Volvo extends Car{

          //  }

            //}





