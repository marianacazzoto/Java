package olamundo.swing;

public class Swing extends javax.swing.JFrame {

    public Swing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        lblMensagem = new javax.swing.JLabel();
        btnClique = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(153, 0, 0));
        lblMensagem.setText("Aqui vai aparecer a mensagem");

        btnClique.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClique.setText("Clique em Mim!");
        btnClique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblMensagem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnClique)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblMensagem)
                .addGap(33, 33, 33)
                .addComponent(btnClique, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lblMensagem.getAccessibleContext().setAccessibleName("Aqui vai aparecer a mensagem");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCliqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliqueActionPerformed
        // TODO add your handling code here:
        lblMensagem.setText("Olá,Mundo!");
    }//GEN-LAST:event_btnCliqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swing().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton btnClique;
    private javax.swing.JLabel lblMensagem;
}
