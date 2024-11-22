public class Rectangle implements GeometricObject
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public String toString()
    {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }

    public double getArea()
    {
        return length * width;
    }

    public double getPerimeter()
    {
        return 2 * (length + width);
    }
}
