public class circle {
    double radius;

    void setData(double r) {
        radius=r;
    }
    void area ()
    {
        double circlearea = 3.14 * radius * radius;
        System.out.println("Area of circle = " + circlearea);
    }

    void circumference()
    {
        double c = 2 * 3.14 * radius;
        System.out.println("circumference of circle = "+c);
    }

}
