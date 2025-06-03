public class RectangleArea { 
    private double length; 
    private double breadth; 

    // Constructor to initialize length and breadth 
    public RectangleArea(double length, double breadth) { 
        this.length = length; 
        this.breadth = breadth; 
    } 

    // Method to calculate area 
    public double getArea() { 
        return length * breadth; 
    } 

    // Display method 
    public void display() { 
        System.out.println("Rectangle Length: " + length); 
        System.out.println("Rectangle Breadth: " + breadth); 
        System.out.println("Area of Rectangle: " + getArea()); 
    } 

    // Main method for demonstration 
    public static void main(String[] args) { 
        RectangleArea rect = new RectangleArea(8, 5); 
        rect.display(); 
    } 
}
