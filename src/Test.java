/*
Overload
Exercise: overload

define a testing class where you:
create the 5 Shape objects using all the different constructor invocations
invoke getShapeDetails() for each Shape object and assign the returned values to dedicated String variables
print in console the values of the 5 dedicated String variables
 */
public class Test {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape circle = new Shape(3.85);
        Shape square = new Shape(4,2.5);
        Shape rectangle = new Shape(3.5,2.8);
        Shape triangle = new Shape(3.5,8.5,4.7);

        String s = shape.getShapeDetails();
        String c = circle.getShapeDetails();
        String sq = square.getShapeDetails();
        String r = rectangle.getShapeDetails();
        String t = triangle.getShapeDetails();

        System.out.println(s+c+sq+r+t);

    }
}
