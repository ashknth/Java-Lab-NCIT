package lab2_Shape;

/**
 * Created by ashoknath on 7/6/19.
 */
public class Shape {
    int l;
    int b;
    int x;
    int y;
    public Shape(int l, int b,int x, int y)
    {
    this.l=l;
        this.b=b;
        this.x=x;
        this.y=y;
    }
    public Shape(int x,int y)
    {
        this(0,0,x,y);
    }
    public Shape()
    {
        this(0,0,0,0);
    }
public void show()
{
    System.out.println(x);
    System.out.println(y);
    System.out.println(l);
    System.out.println(b);
}



}
