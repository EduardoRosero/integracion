package pkg3_integracionnumerica;

/**
 *
 * @author Luis Eduardo Rosero Correa
 */
public class Riemann{




   public double sumatoriaRiemannDer(String funcion, double h, double n, double a) throws UnknownFunctionException, UnparsableExpressionException {
        double sumatoria = 0.000d;
        for (int i = 1; i <= n; i++) {
            double x = (a + (i * h));
            sumatoria = sumatoria + (h * (funcc(funcion, x)));
        }
        return sumatoria;
    }

    public double devuelveFuncion(double x) {
        double funcion = x * x;
        return funcion;
    }

    public double sumatoriaRiemannIzq(String funcion, double h, double n, double a) throws UnknownFunctionException, UnparsableExpressionException {
        double sumatoria = 0.000d;
        for (int i = 0; i < n; i++) {
            double x = (a + (i * h));
            sumatoria = sumatoria + (h * (funcc(funcion, x)));
        }
        return sumatoria;
    }

    
}
