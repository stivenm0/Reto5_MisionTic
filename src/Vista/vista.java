package Vista;



import javax.swing.table.DefaultTableModel;
import Controller.ctConsultas;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Estiven
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
     ctConsultas ct;
     DefaultTableModel dtm;
     String[] titulos;

    public vista() {
        
        initComponents();
        ct = new ctConsultas();
        dtm = new DefaultTableModel();
        titulos = new String[4];
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Consulta_one = new javax.swing.JButton();
        Consulta_three = new javax.swing.JButton();
        Consulta_two = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONSULTAS CONSTRUCCIÓN");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jTabbedPane2.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "  ", "  ", "  ", "  "
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        Consulta_one.setBackground(new java.awt.Color(0, 153, 153));
        Consulta_one.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Consulta_one.setText("Consulta 1");
        Consulta_one.setActionCommand("");
        Consulta_one.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Consulta_one.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Consulta_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta_oneActionPerformed(evt);
            }
        });

        Consulta_three.setBackground(new java.awt.Color(0, 153, 153));
        Consulta_three.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Consulta_three.setText("Consulta 3");
        Consulta_three.setActionCommand("");
        Consulta_three.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Consulta_three.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Consulta_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta_threeActionPerformed(evt);
            }
        });

        Consulta_two.setBackground(new java.awt.Color(0, 153, 153));
        Consulta_two.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Consulta_two.setText("Consulta 2");
        Consulta_two.setActionCommand("");
        Consulta_two.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Consulta_two.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Consulta_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta_twoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Consulta_one, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Consulta_two, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Consulta_three, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consulta_one, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consulta_two, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consulta_three, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Consultas", jPanel1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Consulta_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta_oneActionPerformed
        // TODO add your handling code here:
        titulos= new String[]{"ID_Lider", "Nombre", "Apellido", "ciudad"};
        dtm.setColumnIdentifiers(titulos);
        
        
        jTable1.setModel(ct.Consulta_1(dtm));
        dtm = new DefaultTableModel();
    }//GEN-LAST:event_Consulta_oneActionPerformed

    private void Consulta_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta_threeActionPerformed
        // TODO add your handling code here:
        titulos= new String[]{"ID_Compra", "Constructora", "Banco_Vinculado"};
        dtm.setColumnIdentifiers(titulos);
        
        jTable1.setModel(ct.Consulta_3(dtm));
        
        dtm = new DefaultTableModel();
    }//GEN-LAST:event_Consulta_threeActionPerformed

    private void Consulta_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta_twoActionPerformed
        // TODO add your handling code here:
         titulos= new String[]{"ID_Proyecto", "Constructora", "Número_Habitaciones", "ciudad"};
        dtm.setColumnIdentifiers(titulos);
     
        jTable1.setModel(ct.Consulta_2(dtm));
        dtm = new DefaultTableModel();
    }//GEN-LAST:event_Consulta_twoActionPerformed
 
    
    
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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consulta_one;
    private javax.swing.JButton Consulta_three;
    private javax.swing.JButton Consulta_two;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
