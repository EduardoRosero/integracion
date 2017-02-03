package lagrange;

import lagrange.Puntos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.math.plot.Plot2DPanel;
import org.math.plot.plotObjects.BaseLabel;

/**
 *
 * @author Alejandra
 */
public class PantallaLagrange extends javax.swing.JFrame {

    /**
     * Creates new form PantallaLagrange
     */
    ArrayList<Puntos> puntos = new ArrayList<Puntos>();
    private int n = 0;

    public PantallaLagrange() {
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        //setSize(width/2, height/2);		
        setLocationRelativeTo(null);
        setVisible(true);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INTERPOLACION LAGRANGE");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("LAGRANGE"));

        jLabel1.setText("Numero de puntos");

        jTextField1.setText("jTextField1");

        jButton1.setText("INGRESAR PUNTOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Valor de X:");

        jTextField2.setText("jTextField1");

        jButton2.setText("INTERPOLAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("RESULTADO:");

        jTextField3.setText("jTextField1");

        jButton3.setText("GRAFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("NUEVO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea1.setText("");
        puntos.clear();
        try {
            String token;
            n = Integer.parseInt(jTextField1.getText());
            for (int i = 0; i < n; i++) {
                Puntos pp;
                token = null;
                token = JOptionPane.showInputDialog("Ingrese punto x;y");
                String punto[] = token.split(";");
                double x = Double.parseDouble(punto[0]);
                double y = Double.parseDouble(punto[1]);
                if (i != 0) {
                    if (verificarRepeticion(puntos, x)) {
                        if (verificarOrden(puntos, x)) {
                            pp = new Puntos(x, y);
                            puntos.add(pp);
                            jTextArea1.append("( " + token + " )\r\n");
                        } else {
                            JOptionPane.showMessageDialog(null, "Los puntos deben ingresarse \n de manera ordenada", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                            i--;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede ingresar dos\n veces el mismo valor para x", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                        i--;
                    }
                } else {
                    pp = new Puntos(x, y);
                    puntos.add(pp);
                    jTextArea1.append("( " + token + " )\r\n");

                }

            }

            for (int i = 0; i < n; i++) {
                System.out.println(puntos.get(i).toString());
            }
        } catch (NumberFormatException formato) {
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException arr) {
            JOptionPane.showMessageDialog(null, "No se ha realizado el ingreso \n de datos de manera correcta.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean verificarRepeticion(ArrayList<Puntos> puntos, double x) {
        int repeticion = 0;
        try {

            for (int i = 0; i < puntos.size(); i++) {
                if (x == puntos.get(i).getX()) {
                    repeticion++;
                }

            }
        } catch (IndexOutOfBoundsException e) {
        }
        if (repeticion != 0) {
            return false;
        } else {
            return true;
        }

    }

    public boolean verificarOrden(ArrayList<Puntos> puntos, double x) {
        int repeticion = 0;
        try {

            for (int i = 0; i < puntos.size(); i++) {
                if (x <= puntos.get(i).getX()) {
                    repeticion++;
                }

            }
        } catch (IndexOutOfBoundsException e) {
        }
        if (repeticion != 0) {
            return false;
        } else {
            return true;
        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            DecimalFormat decimales = new DecimalFormat("0.00000");
            ArrayList<Puntos> copiaPuntos = new ArrayList<Puntos>();
            copiaPuntos = (ArrayList) puntos.clone();

            Lagrange lagrange = new Lagrange();
            double x0 = Double.parseDouble(jTextField2.getText());
            if ((x0 > copiaPuntos.get(0).getX()) && (x0 < copiaPuntos.get(copiaPuntos.size() - 1).getX())) {
                double resultado = lagrange.calcularLagrange(copiaPuntos, x0, n);
                jTextField3.setText(String.valueOf(decimales.format(resultado)));
            } else {
                JOptionPane.showMessageDialog(null, "El punto a interpolar debe estar\n  en el intervalo:  (" + copiaPuntos.get(0).getX() + " ; " + copiaPuntos.get(copiaPuntos.size() - 1).getX() + ")", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException formato) {
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            ArrayList<Puntos> copiaPuntos = new ArrayList<Puntos>();

            copiaPuntos = (ArrayList) puntos.clone();
            Lagrange lagrange;
            double[] x = new double[copiaPuntos.size()];
            double[] y = new double[copiaPuntos.size()];

            double h = 0.01;
            int p = (int) ((copiaPuntos.size() / h) + 1)*2;
            double[] xc = new double[p];
            double[] yc = new double[p];
            for (int i = 0; i < y.length; i++) {
                x[i] = copiaPuntos.get(i).getX();
                y[i] = copiaPuntos.get(i).getY();
            }
            for (int i = 0; i < p; i++) {
                xc[i] = copiaPuntos.get(0).getX() + (i * h);
            }

            for (int i = 0; i < p; i++) {
                lagrange = new Lagrange();
                yc[i] = lagrange.calcularLagrange(copiaPuntos, xc[i], n);;
            }
            Plot2DPanel plot = new Plot2DPanel();
            plot.getAxis(0);
            plot.addLegend("SOUTH");
            plot.setAxisLabels("X", "Y");
            plot.addScatterPlot("Puntos", Color.BLUE, x, y);
            plot.addLinePlot("Interpolación Lagrange", Color.RED, xc, yc);
            BaseLabel titulo = new BaseLabel("INTERPOLACION LAGRANGE", Color.BLACK, 0.5, 1.1);
            plot.addPlotable(titulo);
            JFrame frame = new JFrame("INTERPOLACION SPLINE");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(600, 500);
            frame.add(plot, BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (IndexOutOfBoundsException exep) {
            JOptionPane.showMessageDialog(null, "Error realizando gráfica\nverifique ingreso de datos.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        n=0;
        puntos.removeAll(puntos);
        puntos.clear();

    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaLagrange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaLagrange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaLagrange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaLagrange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaLagrange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
