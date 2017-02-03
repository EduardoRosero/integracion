package splines;

/**
 *
 * @author Alejandra
 */
public class Puntos 
{
    private double x=0d;
    private double y=0d;

    public Puntos() {
    }

    
    public Puntos(double x0, double y0)
    {
       
        this.x=x0;
        this.y=y0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public String toString()
    {
        return ("( "+x+" ; "+y+")");
        
    }
}
