public class Main {
    public static void main(String[] args) {

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        Square square = new Square(10);

        int triangleSidesNumber = getTotalSides(equilateralTriangle);
        int squareSidesNumber = getTotalSides(square);

        System.out.println("the equilateral triangle has " + triangleSidesNumber + " sides");
        System.out.println("the square has " + squareSidesNumber + " sides");

        int trianglePerimeter = getPerimeter(equilateralTriangle);
        int squarePerimeter = getPerimeter(square);

        System.out.println("The perimter of triangle is equal with " + trianglePerimeter);
        System.out.println("The perimter of square is equal with " + squarePerimeter);

    }

    public static int getTotalSides(RegularPolygon regularPolygon) {
        return regularPolygon.getNumSides();
    }

    public static int getPerimeter(RegularPolygon regularPolygon) {
        return regularPolygon.getNumSides() * regularPolygon.getSideLength();
    }


//    Create an application with the following features:
//   - An interface called RegularPolygon with two abstract methods: getNumSides() and getSideLenght().

//   - An EquilateralTriangle class that implements the interface, has getNumSide() return 3 and getSideLenght()
//   which returns an instance variable set by the constructor


//  - A Square class that implements the interface, has getNumSides() return 4 and getSideLenght() return
//  an instance variable set by the constructor.

//  - In the Main class, create two methods:
//  - a static getTotalSides() method, which waits for a parameter of type RegularPolygon and returns the total number of
//  sides of all elements

//  - a static method getPerimeter(RegularPolygon p), which returns the perimeter of the passed shape.

}
