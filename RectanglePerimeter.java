public class RectanglePerimeter { 
    private double length; 
    private double breadth; 

    // Constructor to initialize length and breadth 
    public RectanglePerimeter(double length, double breadth) { 
        this.length = length; 
        this.breadth = breadth; 
    } 

    // Method to calculate perimeter 
    public double getPerimeter() { 
        return 2 * (length + breadth); 
    } 

    // Display method 
    public void display() { 
        System.out.println("Rectangle Length: " + length); 
        System.out.println("Rectangle Breadth: " + breadth); 
        System.out.println("Perimeter of Rectangle: " + getPerimeter()); 
    } 

    // Main method for demonstration 
    public static void main(String[] args) { 
        RectanglePerimeter rect = new RectanglePerimeter(8, 5); 
        rect.display(); 
    } 
}

