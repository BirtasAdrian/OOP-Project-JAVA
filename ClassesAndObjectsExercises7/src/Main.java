public class Main {
    public static void main(String[] args) {

    GasCooker gasCooker = new GasCooker();

    gasCooker.coupleGas();
    gasCooker.pressFirstEyeButton();
    gasCooker.pressFirstEyeButton();
    gasCooker.pressFirstEyeButton();
    gasCooker.pressSecondEyeButton();
    gasCooker.pressThirdEyeButton();
    gasCooker.pressForthEyeButton();

    AirConditioner ac = new AirConditioner();
    ac.turnOn();
    ac.raiseTemperature();
    ac.raiseTemperature();
    ac.raiseTemperature();
    ac.raiseTemperature();
    ac.swing();
        System.out.println(ac);
        ac.swing();
        ac.lowTemperature();
        System.out.println(ac);

    }
}


//1. Create class GasCooker, with the following fields: boolean isGasConnected, eyeOneIsLit, eyeTwoIsLit. eyeThreeIsLit, eyeFourIsLit
//   and the following methods: coupleGas(), decoupleGas(), pressFirstEyeButton(), pressSecondEyeButton(), pressThirdEyeButton,
//   Each method will turn the respective eye on if it is off and off if it is on.
//   If at some point the user turns on all four eyes, as a safety method, all eyes will turn off
//   and the gas will be automatically switched off.
//   Create a gas cooker and test all its features.

//2. Create the AirConditioner class, with boolean on, int temperature, boolean swinging and turnOn() methods,
//   turnOff(), raiseTemperature(), lowerTemperature() and swing() methods
//   Override the toString method to print the current state of each air conditioner.
//   Create an air conditioner and test its functionality.
