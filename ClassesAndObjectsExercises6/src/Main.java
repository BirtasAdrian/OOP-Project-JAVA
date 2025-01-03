public class Main {
    public static void main(String[] args) {

        PC computer = new  PC(8, "I7 13000K");
        Monitor monitor = new Monitor(24.9);

        computer.pressPowerButton();
        computer.pressPowerButton();
        computer.pressPowerButton();

        monitor.pressPowerButton();
        monitor.pressPowerButton();
        monitor.pressPowerButton();

        Bus bus1 = new Bus("Mercedes", 20,60);
        for(int i = 0; i < 16; i++){
        bus1.addPassenger();
        }

        Bus bus2 = new Bus("Mercedes", 15, 50);
        for(int i = 0; i < 3; i++){
            bus2.addPassenger();
        }

        bus1.reachNextStation();
        bus2.reachNextStation();

        Plane plane1 = new Plane("Boeing", "737", 30);

        plane1.land();
        plane1.fly();
        for (int i = 0; i < 16; i++) {
            plane1.addPassenger();
        }
        plane1.fly();
        plane1.land();
    }
}


// 1. Create the PC and Monitor classes. The PC will have the following characteristics: boolean on, int ram,
//    String processor,pressPowerButton()
//    Monitor will have the following characteristics: boolean on, double diagonal, pressPowerButton()
//    For both classes, the pressPowerButton() method will turn on the PC/monitor if it is off, and turn it off if it is on.
//    Create a pc and a monitor. Turn them on and off.

//2. Create the Bus class with the following properties: String brand, int maxPassengers, int maxSpeed, and the addPassenger()
//   and reachNextStation() methods.
//   A bus cannot take more passengers than its maximum capacity.
//   If a bus has more than half its maximum passenger capacity on board, it will go to the next station
//   at half its top speed. If it has less than half it will go at full speed.
//   Create two buses for which to add passengers.
//   Make both buses go to the next stop differently (max speed/half speed - depending on the number of passengers).
//

//3. Create the Plane class with fields String brand, String model, boolean isFlying, int maxPassengers and methods addPassenger()
//   fly() and land(). A plane will fly if it's on the ground and if it has at least half of its maximum capacity
//   on board of passengers.
//   A plane will land only if it flies. Create a plane to call and test all its features, in every case.

