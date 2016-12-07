package pkg3_integracionnumerica;

/**
 *
 * @author Luis Eduardo Rosero Correa
 */
public class Simpson{

    public double sumatoriaSimpson(String funcion, double h, double n, double a) throws UnknownFunctionException, UnparsableExpressionException {
        double pares = 0.000d, impares = 0.000d, sumatoria = 0.000d;
        for (int i = 1; i < n; i = i + 2) {
            double x = (a + (i * h));
            impares = impares + funcc(funcion, x);
        }

        for (int i = 2; i <= n; i = i + 2) {
            double x = (a + (i * h));
            pares = pares + funcc(funcion, x);
        }
        //sumatoria = (h / 3) * (devuelveFuncion(a) + (2 * pares) + (4 * impares)); //este es el que vale
        sumatoria = (h / 3) * (funcc(funcion, a) + (2 * pares) + (4 * impares));
        return sumatoria;
    }


    
}
