/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Alejo
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Container = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jmAdmision = new javax.swing.JMenu();
        jmiCItas = new javax.swing.JMenuItem();
        jmiHistorialCitas = new javax.swing.JMenuItem();
        jmEnfermero = new javax.swing.JMenu();
        jmMedico = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icon-user.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 28, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Nombre Usuario");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 153, 32));

        jButton1.setBackground(new java.awt.Color(126, 198, 81));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cerrar sesion");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/rsz_icon-sanna-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(240, 240, 240));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(126, 199, 80));
        jTextField2.setText("Centro Clinico");
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(240, 240, 240));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(126, 199, 80));
        jTextField3.setText("SANNA /");
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 50));

        Container.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 690, 390));

        jMenuBar.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar.setBorder(null);
        jMenuBar.setForeground(new java.awt.Color(0, 0, 0));

        jmAdmision.setBackground(new java.awt.Color(51, 51, 255));
        jmAdmision.setForeground(new java.awt.Color(0, 0, 0));
        jmAdmision.setText("Admision");

        jmiCItas.setText("Agendar Cita");
        jmAdmision.add(jmiCItas);

        jmiHistorialCitas.setText("Historial Citas");
        jmAdmision.add(jmiHistorialCitas);

        jMenuBar.add(jmAdmision);

        jmEnfermero.setText("Enfermero");
        jMenuBar.add(jmEnfermero);

        jmMedico.setText("Medico");
        jMenuBar.add(jmMedico);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Container;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JMenu jmAdmision;
    private javax.swing.JMenu jmEnfermero;
    private javax.swing.JMenu jmMedico;
    private javax.swing.JMenuItem jmiCItas;
    private javax.swing.JMenuItem jmiHistorialCitas;
    // End of variables declaration//GEN-END:variables
}