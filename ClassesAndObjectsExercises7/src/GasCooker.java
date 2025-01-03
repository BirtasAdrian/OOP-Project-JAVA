public class GasCooker {

    boolean isGasConnected;
    boolean eyeOneIsLit;
    boolean eyeTwoIsLit;
    boolean eyeThreeIsLit;
    boolean eyeFourIsLit;

    public void coupleGas() {
        if (isGasConnected) {
            System.out.println("The gas is already connected");
        } else {
            isGasConnected = true;
            System.out.println("The gas has been connected");
        }
    }

    public void decoupleGas() {
        if (isGasConnected) {
            isGasConnected = false;
            System.out.println("The gas hase been decoupled");
        } else {
            System.out.println("The gas is already decoupled");
        }
    }

    public void pressFirstEyeButton() {
        if (eyeOneIsLit) {
            System.out.println("The eye 1 has been turned off.");
            eyeOneIsLit = false;
        } else {
            if (isGasConnected) {
                System.out.println("The eye 1 has been turned on");
                eyeOneIsLit = true;
                securityCheck();
            } else {
                System.out.println("The gas is not connected");
            }
        }
    }

    public void pressSecondEyeButton() {
        if (eyeTwoIsLit) {
            System.out.println("The eye 2 has been turned off.");
            eyeTwoIsLit = false;
        } else {
            if (isGasConnected) {
                System.out.println("The eye 2 has been turned on");
                eyeTwoIsLit = true;
                securityCheck();
            } else {
                System.out.println("The gas is not connected");
            }
        }
    }

    public void pressThirdEyeButton() {
        if (eyeThreeIsLit) {
            System.out.println("The eye 3 has been turned off.");
            eyeThreeIsLit = false;
        } else {
            if (isGasConnected) {
                System.out.println("The eye 3 has bee turned on");
                eyeThreeIsLit = true;
                securityCheck();
            } else {
                System.out.println("The gas is not connected");
            }
        }
    }

    public void pressForthEyeButton() {
        if (eyeFourIsLit) {
            System.out.println("The eye 4 has been turned off.");
            eyeFourIsLit = false;
        } else {
            if (isGasConnected) {
                System.out.println("The eye 4 has bee turned on");
                eyeFourIsLit = true;
                securityCheck();
            } else {
                System.out.println("The gas is not connected");
            }
        }
    }

    public void securityCheck() {
        if (eyeOneIsLit && eyeTwoIsLit && eyeThreeIsLit && eyeFourIsLit) {
            System.out.println("WARNING. The Gas Cooker has been turned off and the gas was decoupled");
            eyeOneIsLit = false;
            eyeTwoIsLit = false;
            eyeThreeIsLit = false;
            eyeFourIsLit = false;
            decoupleGas();
        }
    }
}
