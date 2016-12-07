package pkg3_integracionnumerica;

/**
 *
 * @author Luis Eduardo Rosero Correa
 */
public class Derivadas{

public double derivadaRegresiva(String funcion, double x, double h) throws UnknownFunctionException, UnparsableExpressionException
    {
        double dr = (funcc(funcion, x) - funcc(funcion, (x-h)))/h;
        return dr;
    }
    
    public double derivadaDiferenciasCentrales(String funcion, double x, double h) throws UnknownFunctionException, UnparsableExpressionException
    {
        double ddc = (funcc(funcion, (x+h)) - funcc(funcion, (x-h)))/(2*h);
        return ddc;
    }
    
    public double segundaDerivada(String funcion, double x, double h) throws UnknownFunctionException, UnparsableExpressionException
    {
        double inc = (2 * h);
        double y = x+inc;
        double z = x-inc;
        double segunda = (funcc(funcion, y) - (2*funcc(funcion, x)) + funcc(funcion, z) ) / (inc*inc);
        return segunda;
    }
    
}
