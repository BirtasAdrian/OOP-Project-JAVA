package packageProtected;

import packageDefault.TestDefault;

public class Main {
    public static void main(String[] args) {


        TestDefault testDefault = new TestDefault();
//        testDefault.text = "Ana has apples";

        TestParent testParent = new TestParent();
        testParent.text = "Ana has appples";
    }
}
