package lagrange;
import lagrange.Puntos;
import java.util.ArrayList;

/**
 *
 * @author Alejandra
 */
public class Lagrange
{
    double p=0d, l;
    public double calcularLagrange(ArrayList<Puntos> puntos,  double x0,int n)
    {
        for (int i = 0; i < n; i++)
        {
            l=1d;
            for (int j = 0; j < n; j++) 
            {
                
                if (i!=j)
                {
                    l=l*((x0-puntos.get(j).getX())/(puntos.get(i).getX()-puntos.get(j).getX()));
                }
            }
            p = p + (l*puntos.get(i).getY());
        }
        return p;
    }
}
