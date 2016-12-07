package pkg3_integracionnumerica;

/**
 *
 * @author Luis Eduardo Rosero Correa
 */
public class Trapecios{


   public double sumatoriaTrapecios(String funcion, double h, double n, double a, double b) throws UnknownFunctionException, UnparsableExpressionException {
        double sumatoria = 0.000d, aux = 0.000d;
        for (int i = 1; i < n - 1; i++) {
            double x = (a + (i * h));
            aux = aux + (funcc(funcion, x));
        }
        sumatoria = (h / 2) * (funcc(funcion, a) + (2 * aux) + funcc(funcion, b));
        return sumatoria;
    }

    
}
