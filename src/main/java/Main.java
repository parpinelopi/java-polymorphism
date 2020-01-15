public class Main {
    public static void main(String[] args) {

        class Car {
            private String name;
            private int wheels;
            private int cylinders;
            private int doors;
            private int speed;
            private boolean engine;


            public Car(String name, int wheels, int cylinders, int speed, boolean engine) {
                this.name = name;
                this.wheels = 4;
                this.cylinders = cylinders;
                this.engine = true;
            }

            public void startEngine(boolean engine) {

                if (engine == true) {
                    System.out.println("Start engine");
                } else {
                    System.out.println("No engine");
                }

            }

            public void accelerate(int additionalSpeed) {
                if (speed != 0) {
                    speed = additionalSpeed + speed;
                    System.out.println("Accelerate the car by:" + additionalSpeed + "and make total speed" + speed);

                } else {
                    System.out.println("Start engine first");
                }
            }
        }
    }
}