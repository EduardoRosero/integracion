package splines;

/**
 *
 * @author Alejandra
 */
public class FactorizacionCrout {

    public double[] metodoCrout(double[][] matrizA) {
        double vectorB[] = new double[matrizA.length];
        vectorB = obtenerVectorB(matrizA);
        System.out.println("Vector b");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println(vectorB[i] + "\t");
        }
        double[][] matrizL = new double[matrizA.length][matrizA.length + 1];
        double[][] matrizU = new double[matrizA.length][matrizA.length + 1];
        double matrizLAumentada[][] = new double[matrizA.length][matrizA.length + 1];
        double matrizLTAumentada[][] = new double[matrizA.length][matrizA.length + 1];
        double vectorY[] = new double[matrizA.length];
        double vectorX[] = new double[matrizA.length];

        matrizL = llenarMatrizDeCeros(matrizL);
        matrizU = llenarMatrizDeCeros(matrizU);
        for (int i = 0; i < matrizA.length; i++) {
            matrizL[i][0] = matrizA[i][0];
            matrizU[i][i] = 1d;
        }

        for (int k = 0; k < matrizU.length; k++) {
            for (int i = k; i < matrizU.length; i++) {
                double suma = 0d;
                for (int p = 0; p < k; p++) {
                    suma = suma + (matrizL[i][p] * matrizU[p][k]);
                    // matrizL[i][k] = matrizA[i][k] -suma;
                }
                matrizL[i][k] = matrizA[i][k] - suma;
            }

            for (int j = k; j < matrizU.length; j++) {
                double suma = 0d;
                for (int p = 0; p < k; p++) {
                    suma = suma + (matrizL[k][p] * matrizU[p][j]);
                    //matrizU[k][j] = (matrizA[k][j] - suma)/ matrizL[k][k];
                }
                matrizU[k][j] = (matrizA[k][j] - suma) / matrizL[k][k];
            }

        }

        imprimirMatriz(matrizL, "L");
        imprimirMatriz(matrizU, "U");
        matrizLAumentada = calcularMatrizAumentada(matrizL, vectorB);
        vectorY = calcularValoresVectorSolucionY(matrizLAumentada);
        matrizLTAumentada = calcularMatrizAumentada(matrizU, vectorY);
        vectorX = calcularValoresVectorSolucionX(matrizLTAumentada);
        System.out.println("Vector y");
        for (int i = 0; i < vectorY.length; i++) {
            System.out.println(vectorY[i] + "\t");
        }
        System.out.println("Vector x");
        for (int i = 0; i < vectorX.length; i++) {
            System.out.println(vectorX[i] + "\t");
        }
        double determinante = calcularDeterminante(matrizL);
        System.out.println("\n\nDeterminante:  " + determinante);
        return vectorX;
    }

    public void imprimir(double[][] matriz) {
        System.out.println("\n\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  \t\t");
            }
            System.out.println();
        }
    }

    public double[][] calcularMatrizAumentada(double[][] matriz, double[] vectorB) {
        double[][] matrizA = new double[matriz.length][matriz.length + 1];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizA[i][j] = matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            matrizA[i][matriz.length] = vectorB[i];

        }
        return matrizA;
    }

    public double[] obtenerVectorB(double[][] matrizA) {
        double vectorB[] = new double[matrizA.length];
        for (int i = 0; i < matrizA.length; i++) {
            vectorB[i] = matrizA[i][matrizA.length];
        }
        return vectorB;
    }

    /**
     * Método para imprimir una matriz.
     *
     * @param matrizA Matriz de n x n de tipo double que se va a imprimir
     * @param mensaje parámetro de tipo String correspondiente al nombre de la
     * matriz a imprimir
     */
    private void imprimirMatriz(double[][] matrizA, String mensaje) {
        System.out.println("\n\n*****   Matriz " + mensaje + "   *****");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public double[][] llenarMatrizDeCeros(double[][] matriz) {
        double[][] m = new double[matriz.length][matriz.length + 1];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = 0d;

            }

        }
        return m;
    }

    public double[] calcularValoresVectorSolucionX(double[][] matrizA) {
        double[] valoresX = new double[matrizA.length];
        /*
            Calcular primer valor de x=n
         */
        valoresX[matrizA.length - 1] = matrizA[matrizA.length - 1][matrizA.length] / matrizA[matrizA.length - 1][matrizA.length - 1];
        /*
            Calcular demás valores de x
         */
        for (int i = valoresX.length - 2; i >= 0; i--) {
            double sum = 0d;
            int acum = 1;
            for (int j = i; j < valoresX.length; j++) {
                if (i != j) {
                    sum = sum + (matrizA[i][j] * valoresX[j]);
                    acum++;
                }
            }
            valoresX[i] = (matrizA[i][i + acum] - sum) / matrizA[i][i];
        }
        return valoresX;
    }

    public double[] calcularValoresVectorSolucionY(double[][] matrizA) {
        double[] valoresX = new double[matrizA.length];
        /*
            Calcular primer valor de x=n
         */
        //valoresX[matrizA.length-1]= matrizA[matrizA.length-1][matrizA.length]/matrizA[matrizA.length-1][matrizA.length-1];
        valoresX[0] = matrizA[0][matrizA.length] / matrizA[0][0];
        /*
            Calcular demás valores de x
         */
        //for (int i = valoresX.length - 2; i >= 0; i--) {
        for (int i = 1; i < matrizA.length; i++) {
            double sum = 0d;
            int acum = 1;
            for (int j = 0; j < i; j++) {
                if (i != j) {
                    sum = sum + (matrizA[i][j] * valoresX[j]);
                    acum++;
                }
            }
            valoresX[i] = (matrizA[i][matrizA.length] - sum) / matrizA[i][i];
        }
        return valoresX;
    }
    
    public double calcularDeterminante(double[][]matrizL)
    {
        int n = matrizL.length;
        double determinante=1d;
        for (int i = 0; i < n; i++) 
        {
            determinante = determinante*matrizL[i][i];
        }
        return determinante;
    }

}
