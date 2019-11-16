package br.com.champtech.view;

import br.com.champtech.db.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Fukutu
 */
public class LoginPanel extends javax.swing.JPanel {

    private final MainFrame mainFrame;

    /*
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        this.mainFrame = MainFrame.INSTANCE;
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

        loginPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        userEmailInput = new javax.swing.JTextField();
        entrarBtn = new javax.swing.JButton();
        senhaInput = new javax.swing.JPasswordField();
        rbEsqueci = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtemailLogin3 = new javax.swing.JTextField();
        btLogin1 = new javax.swing.JButton();
        txtSenhaLogin3 = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 498));
        setMinimumSize(new java.awt.Dimension(800, 498));
        setPreferredSize(new java.awt.Dimension(800, 498));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setMaximumSize(new java.awt.Dimension(800, 32767));
        loginPanel.setMinimumSize(new java.awt.Dimension(800, 458));
        loginPanel.setPreferredSize(new java.awt.Dimension(800, 498));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userEmailInput.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        userEmailInput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null));
        userEmailInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userEmailInputMouseClicked(evt);
            }
        });
        jPanel4.add(userEmailInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 40));

        entrarBtn.setBackground(new java.awt.Color(0, 204, 0));
        entrarBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        entrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        entrarBtn.setText("Entrar");
        entrarBtn.setFocusPainted(false);
        entrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBtnActionPerformed(evt);
            }
        });
        jPanel4.add(entrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 40));

        senhaInput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null));
        senhaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senhaInputMouseClicked(evt);
            }
        });
        jPanel4.add(senhaInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 40));

        rbEsqueci.setBackground(new java.awt.Color(255, 255, 255));
        rbEsqueci.setText("Lembrar login");
        jPanel4.add(rbEsqueci, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

        jButton3.setForeground(new java.awt.Color(102, 0, 204));
        jButton3.setText("Problemas com o login?");
        jButton3.setBorder(null);
        jButton3.setFocusPainted(false);
        jButton3.setOpaque(false);
        jButton3.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 180, -1));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Não possui cadastro?");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Já possui cadastro?");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtemailLogin3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtemailLogin3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null));
        txtemailLogin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtemailLogin3MouseClicked(evt);
            }
        });
        jPanel8.add(txtemailLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 40));

        btLogin1.setBackground(new java.awt.Color(0, 204, 0));
        btLogin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btLogin1.setText("Continuar");
        btLogin1.setFocusPainted(false);
        btLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogin1ActionPerformed(evt);
            }
        });
        jPanel8.add(btLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, 40));

        txtSenhaLogin3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null));
        txtSenhaLogin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenhaLogin3MouseClicked(evt);
            }
        });
        jPanel8.add(txtSenhaLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 40));

        jButton4.setForeground(new java.awt.Color(102, 0, 204));
        jButton4.setText("Problemas com o cadastro?");
        jButton4.setBorder(null);
        jButton4.setFocusPainted(false);
        jButton4.setOpaque(false);
        jButton4.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, -1));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        add(loginPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void userEmailInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userEmailInputMouseClicked
        userEmailInput.setText("");
    }//GEN-LAST:event_userEmailInputMouseClicked

    private void entrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBtnActionPerformed

        Statement statment = ConnectionFactory.getStatement();

        String login = userEmailInput.getText();
        String senha = new String(senhaInput.getPassword());
        String txtSql = "SELECT * FROM tb_usuario WHERE usuario = '%s' OR email = '%s' AND senha = '%s'";

        String cmd = String.format(txtSql, login, login, senha);

        try {

            ResultSet result = statment.executeQuery(cmd);

            if (result.next()) {

                int type = result.getInt("id_classe");
                System.out.println(type);
                switch (type) {

                    // cliente
                    case 1:
                        this.mainFrame.changeCurrentCard("homeCard");
                        break;

                    // funcionario
                    case 2:
                        this.mainFrame.changeCurrentCard("funcionarioCard");
                        break;
                }
            }
            
            result.close();

        } catch (SQLException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_entrarBtnActionPerformed

    private void senhaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhaInputMouseClicked
        senhaInput.setText("");
    }//GEN-LAST:event_senhaInputMouseClicked

    private void txtemailLogin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailLogin3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailLogin3MouseClicked

    private void btLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLogin1ActionPerformed

    private void txtSenhaLogin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaLogin3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaLogin3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin1;
    private javax.swing.JButton entrarBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JRadioButton rbEsqueci;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JPasswordField txtSenhaLogin3;
    private javax.swing.JTextField txtemailLogin3;
    private javax.swing.JTextField userEmailInput;
    // End of variables declaration//GEN-END:variables
}
