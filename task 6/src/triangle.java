public class triangle {
    double x1 , y2 , z3 , H;
    void getdata(double x , double y , double z , double h)
    {
        x1=x;
        y2=y;
        z3=z;
        H=h;
    }
    void tarea()
    {
        double trianglearea = (y2*H)/2;
        System.out.println("trianglearea = "+trianglearea);
    }
    void tcircumference()
    {
        double trianglecircumference = x1+y2+z3;
        System.out.println("trianglecircumference = "+trianglecircumference);
    }
}
