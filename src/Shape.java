/*
Overload
Exercise: overload

define a class called Shape that has:
an instance variable shapeName
an instance variable numberOfEdges
1 basic constructor method with no params that
informs the user about the Shape object creation
assign Undefined shape to the object's shapeName
4 params overload constructor methods:
for circle:
takes a double radius param
informs the user about the object creation
assigns the shapeName
for square
takes an int edges param and a double edgeLength param
informs the user about the object creation
assigns the values to numberOfEdges and to shapeName
for rectangle:
takes an int edges param and 2 double (e1, e2) params
informs the user about the object creation
assigns the values to numberOfEdges and to shapeName
for triangle:
takes an int edges param and 3 double (e1, e2, e3) params
informs the user about the object creation
assigns the values to numberOfEdges and to shapeName
a method called getShapeDetails() that returns an informative String containing:
shapeName
numberOfEdges
 */
public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape() {
        System.out.println("A shape has been created");
        shapeName =  "Undefined shape";
    }

    public Shape(double radius) {
        System.out.println("A circle has been created");
        shapeName =  "circle";
    }

    public Shape(int edges, double edgeLength) {
        System.out.println("A square has been created");
        shapeName =  "square";
        this.numberOfEdges = edges;
    }

    public Shape(double e1, double e2) {
        System.out.println("A rectangle has been created");
        this.shapeName =  "rectangle";
        this.numberOfEdges = 4;
    }

    public Shape(double e1, double e2, double e3) {
        System.out.println("A triangle has been created");
        this.shapeName =  "triangle";
        this.numberOfEdges = 3;
    }


    public String getShapeDetails() {
        return "Type of shape: " + shapeName + ", Number of edges: " + numberOfEdges+'\n';
    }
}
