public class Main {
    public static void main(String[] args) {



        class Car {
            private String name;
            private int wheels;
            private int cylinders;
            private boolean doors;
            private int speed;
            private boolean engine;


            public Car(String name, int wheels, int cylinders, boolean doors, int speed, boolean engine) {
                this.name = name;
                this.wheels = 4;
                this.speed=speed;
                this.doors= true;
                this.cylinders = cylinders;
                this.engine = true;
            }

            public void startEngine(boolean engine, boolean doors) {

                if (engine == true && doors==true ) {
                    System.out.println("Start engine");
                } else {
                    System.out.println("No engine and the doors are still open");
                }

            }

            public void accelerate(int speed, int additionalSpeed) {
                if (speed != 0) {
                    if (speed>0 && speed<100){
                    speed = additionalSpeed + speed;
                    System.out.println("Accelerate the car by:" + additionalSpeed + "and make total speed" + speed);}
                } else {
                    System.out.println("Start engine first");
                }
            }

            public void stopCar(int wheels, int cylinders){
                if (wheels==4 && cylinders==4) {
                    System.out.println("Stop the car safely");
                }else{
                    System.out.println("There is an issue with the car");
            }
        }

        class Tesla extends Car{
            public Tesla(String name, int wheels, int cylinders, boolean doors, int speed, boolean engine) {
                super(name, wheels, cylinders, doors, speed, engine);
            }

            @Override
            public void startEngine(boolean engine, boolean doors) {
                super.startEngine(engine, doors);
            }
        }

        class Mustang extends Car{
            public Mustang(String name, int wheels, int cylinders, boolean doors, int speed, boolean engine) {
                super(name, wheels, cylinders, doors, speed, engine);
            }

            @Override
            public void accelerate(int speed, int additionalSpeed) {
                super.accelerate(speed, additionalSpeed);
            }
        }


        class Volvo extends Car{
            public Volvo(String name, int wheels, int cylinders, boolean doors, int speed, boolean engine) {
                super(name, wheels, cylinders, doors, speed, engine);
            }

            @Override
            public void stopCar(int wheels, int cylinders) {
                super.stopCar(wheels, cylinders);
            }
        }



    }
}