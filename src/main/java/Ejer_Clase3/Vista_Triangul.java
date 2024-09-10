/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejer_Clase3;

/**
 *
 * @author ferch
 */
public class Vista_Triangul extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Triangul
     */
    public Vista_Triangul() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        labTitulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labPunto1 = new javax.swing.JLabel();
        labPunto2 = new javax.swing.JLabel();
        punt2y = new javax.swing.JTextField();
        punt2x = new javax.swing.JTextField();
        punt1y = new javax.swing.JTextField();
        punt1x = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        labRespuesta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);
        setForeground(new java.awt.Color(204, 204, 204));

        jLayeredPane1.setBackground(new java.awt.Color(153, 255, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        jLayeredPane1.setForeground(new java.awt.Color(153, 255, 204));

        labTitulo.setBackground(new java.awt.Color(102, 102, 102));
        labTitulo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        labTitulo.setText("TEOREMA TRIANGULO");

        jLabel5.setText("X");

        labPunto1.setText("PUNTO 1 : ");

        labPunto2.setText("PUNTO 2 : ");

        punt2y.setBackground(new java.awt.Color(0, 204, 0));
        punt2y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        punt2y.setText("4.5");
        punt2y.setBorder(null);
        punt2y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punt2yActionPerformed(evt);
            }
        });

        punt2x.setBackground(new java.awt.Color(204, 255, 204));
        punt2x.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        punt2x.setText("3.2");
        punt2x.setBorder(null);
        punt2x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punt2xActionPerformed(evt);
            }
        });

        punt1y.setBackground(new java.awt.Color(0, 204, 204));
        punt1y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        punt1y.setText("3.5");
        punt1y.setBorder(null);
        punt1y.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        punt1y.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        punt1y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punt1yActionPerformed(evt);
            }
        });

        punt1x.setBackground(new java.awt.Color(204, 255, 255));
        punt1x.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        punt1x.setText("5.2");
        punt1x.setBorder(null);
        punt1x.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        punt1x.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        punt1x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punt1xActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        labRespuesta.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        labRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labRespuesta.setText("Respuesta: ...");
        labRespuesta.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setText("Y");

        jLayeredPane1.setLayer(labTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labPunto1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labPunto2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(punt2y, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(punt2x, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(punt1y, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(punt1x, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnCalcular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labRespuesta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(labPunto1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(labPunto2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(punt2x, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(punt1x, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(punt1y, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(punt2y, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel4)))
                .addGap(154, 154, 154))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(labRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(labTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labTitulo)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(punt1x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(punt2x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labPunto2)
                            .addComponent(punt2y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(punt1y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labPunto1))))
                .addGap(28, 28, 28)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        double puntoo1x = Double.parseDouble(punt1x.getText());
        double puntoo1y = Double.parseDouble(punt1y.getText());
        
        double puntoo2x = Double.parseDouble(punt2x.getText());
        double puntoo2y = Double.parseDouble(punt2y.getText());
        
        Punto punto1 = new Punto(puntoo1x, puntoo1y);
        Punto punto2 = new Punto(puntoo2x, puntoo2y);
        
        Lado ladoo = new Lado(punto1, punto2);
        ladoo.CalcularLado();
        
        TrianguloRectangulo triangul = new TrianguloRectangulo(ladoo);
        
        String mensaje = "La Hipotenusa del Triangulo es: " + triangul.CalcularHipotenusa();
        labRespuesta.setText("<html>" + mensaje.replace("\n", "<br>") + "</html>");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void punt2yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punt2yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punt2yActionPerformed

    private void punt2xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punt2xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punt2xActionPerformed

    private void punt1xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punt1xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punt1xActionPerformed

    private void punt1yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punt1yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punt1yActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Triangul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Triangul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Triangul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Triangul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Triangul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labPunto1;
    private javax.swing.JLabel labPunto2;
    private javax.swing.JLabel labRespuesta;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JTextField punt1x;
    private javax.swing.JTextField punt1y;
    private javax.swing.JTextField punt2x;
    private javax.swing.JTextField punt2y;
    // End of variables declaration//GEN-END:variables
}
