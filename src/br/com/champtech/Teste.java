package br.com.champtech;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Fukutu
 */
public class Teste extends javax.swing.JFrame {

    private CardLayout cardLayout;
    
    /**
     * Creates new form Teste
     */
    public Teste() {
        initComponents();
        this.cardLayout = (CardLayout) this.contentPanel.getLayout();
        
        ImageIcon logo = new ImageIcon("images/logo.png");
        logo.setImage(logo.getImage().getScaledInstance(logoLabel.getWidth(), logoLabel.getHeight(), Image.SCALE_SMOOTH));
        logoLabel.setIcon(logo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        windowBarPanel = new javax.swing.JPanel();
        windowCloseButton = new javax.swing.JButton();
        windowMinimizeButton = new javax.swing.JButton();
        menuBarPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        buscarLabel = new javax.swing.JLabel();
        navegationBarPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        produtosButton = new javax.swing.JButton();
        montagemButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        homeScrollPane = new javax.swing.JScrollPane();
        homePanel = new javax.swing.JPanel();
        produtosScrollPane = new javax.swing.JScrollPane();
        produtosPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        montagemScrollPane = new javax.swing.JScrollPane();
        montagemPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(204, 0, 153));
        mainPanel.setFocusable(false);
        mainPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        mainPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        mainPanel.setRequestFocusEnabled(false);
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        windowBarPanel.setBackground(new java.awt.Color(0, 0, 0));
        windowBarPanel.setMinimumSize(new java.awt.Dimension(800, 22));
        windowBarPanel.setPreferredSize(new java.awt.Dimension(800, 22));
        windowBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        windowCloseButton.setBackground(new java.awt.Color(204, 51, 0));
        windowCloseButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        windowCloseButton.setForeground(new java.awt.Color(255, 255, 255));
        windowCloseButton.setText("X");
        windowCloseButton.setBorder(null);
        windowCloseButton.setBorderPainted(false);
        windowCloseButton.setFocusPainted(false);
        windowCloseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        windowCloseButton.setPreferredSize(new java.awt.Dimension(15, 13));
        windowBarPanel.add(windowCloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 5, -1, -1));

        windowMinimizeButton.setBackground(new java.awt.Color(255, 153, 0));
        windowMinimizeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        windowMinimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        windowMinimizeButton.setText("-");
        windowMinimizeButton.setBorder(null);
        windowMinimizeButton.setBorderPainted(false);
        windowMinimizeButton.setFocusPainted(false);
        windowMinimizeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        windowMinimizeButton.setPreferredSize(new java.awt.Dimension(15, 13));
        windowMinimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowMinimizeButtonActionPerformed(evt);
            }
        });
        windowBarPanel.add(windowMinimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 5, -1, -1));

        mainPanel.add(windowBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuBarPanel.setBackground(new java.awt.Color(51, 51, 51));
        menuBarPanel.setMinimumSize(new java.awt.Dimension(800, 80));
        menuBarPanel.setPreferredSize(new java.awt.Dimension(800, 80));
        menuBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setOpaque(false);
        menuBarPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 27, 270, 30));

        userLabel.setBackground(new java.awt.Color(255, 255, 255));
        userLabel.setOpaque(true);
        menuBarPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 30, 30));

        logoLabel.setBackground(new java.awt.Color(255, 255, 255));
        menuBarPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 40));

        buscarLabel.setBackground(new java.awt.Color(255, 255, 255));
        buscarLabel.setOpaque(true);
        menuBarPanel.add(buscarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 30, 30));

        mainPanel.add(menuBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, -1, -1));

        navegationBarPanel.setBackground(new java.awt.Color(102, 102, 102));
        navegationBarPanel.setMaximumSize(new java.awt.Dimension(800, 40));
        navegationBarPanel.setMinimumSize(new java.awt.Dimension(800, 40));
        navegationBarPanel.setPreferredSize(new java.awt.Dimension(800, 40));
        navegationBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setBackground(new java.awt.Color(153, 153, 0));
        homeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setFocusPainted(false);
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        navegationBarPanel.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 60, 20));

        produtosButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        produtosButton.setForeground(new java.awt.Color(255, 255, 255));
        produtosButton.setText("Produtos");
        produtosButton.setBorder(null);
        produtosButton.setBorderPainted(false);
        produtosButton.setFocusPainted(false);
        produtosButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        produtosButton.setOpaque(false);
        produtosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosButtonActionPerformed(evt);
            }
        });
        navegationBarPanel.add(produtosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 100, 20));

        montagemButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        montagemButton.setForeground(new java.awt.Color(255, 255, 255));
        montagemButton.setText("Monte seu PC");
        montagemButton.setBorder(null);
        montagemButton.setBorderPainted(false);
        montagemButton.setFocusPainted(false);
        montagemButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        montagemButton.setOpaque(false);
        montagemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montagemButtonActionPerformed(evt);
            }
        });
        navegationBarPanel.add(montagemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 100, 20));

        mainPanel.add(navegationBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, -1, -1));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setMaximumSize(new java.awt.Dimension(800, 458));
        contentPanel.setMinimumSize(new java.awt.Dimension(800, 458));
        contentPanel.setPreferredSize(new java.awt.Dimension(800, 458));
        contentPanel.setLayout(new java.awt.CardLayout());

        homeScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        homeScrollPane.setBorder(null);
        homeScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        homeScrollPane.setMaximumSize(new java.awt.Dimension(800, 458));
        homeScrollPane.setMinimumSize(new java.awt.Dimension(800, 458));
        homeScrollPane.setPreferredSize(new java.awt.Dimension(800, 458));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setMaximumSize(new java.awt.Dimension(800, 32767));
        homePanel.setMinimumSize(new java.awt.Dimension(800, 458));
        homePanel.setPreferredSize(new java.awt.Dimension(800, 1000));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        homeScrollPane.setViewportView(homePanel);

        contentPanel.add(homeScrollPane, "homeCard");

        produtosScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        produtosScrollPane.setBorder(null);
        produtosScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        produtosPanel.setBackground(new java.awt.Color(255, 255, 255));
        produtosPanel.setMaximumSize(new java.awt.Dimension(800, 32767));
        produtosPanel.setMinimumSize(new java.awt.Dimension(800, 458));
        produtosPanel.setPreferredSize(new java.awt.Dimension(800, 1000));
        produtosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 40));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        produtosPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        produtosScrollPane.setViewportView(produtosPanel);

        contentPanel.add(produtosScrollPane, "produtosCard");

        montagemScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        montagemScrollPane.setBorder(null);
        montagemScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        montagemScrollPane.setMaximumSize(new java.awt.Dimension(800, 32767));
        montagemScrollPane.setMinimumSize(new java.awt.Dimension(800, 458));

        montagemPanel.setBackground(new java.awt.Color(255, 255, 255));
        montagemPanel.setMaximumSize(new java.awt.Dimension(800, 32767));
        montagemPanel.setMinimumSize(new java.awt.Dimension(800, 458));

        javax.swing.GroupLayout montagemPanelLayout = new javax.swing.GroupLayout(montagemPanel);
        montagemPanel.setLayout(montagemPanelLayout);
        montagemPanelLayout.setHorizontalGroup(
            montagemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        montagemPanelLayout.setVerticalGroup(
            montagemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        montagemScrollPane.setViewportView(montagemPanel);

        contentPanel.add(montagemScrollPane, "montagemCard");

        mainPanel.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void windowMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowMinimizeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_windowMinimizeButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        this.cardLayout.show(this.contentPanel, "homeCard");
        homeButton.setForeground(Color.ORANGE);
        produtosButton.setForeground(Color.WHITE);
        montagemButton.setForeground(Color.WHITE);

    }//GEN-LAST:event_homeButtonActionPerformed

    private void produtosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosButtonActionPerformed
        this.cardLayout.show(this.contentPanel, "produtosCard");
        produtosButton.setForeground(Color.ORANGE);
        homeButton.setForeground(Color.WHITE);
        montagemButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_produtosButtonActionPerformed

    private void montagemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montagemButtonActionPerformed
        this.cardLayout.show(this.contentPanel, "montagemCard");
        montagemButton.setForeground(Color.ORANGE);
        produtosButton.setForeground(Color.WHITE);
        homeButton.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_montagemButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JScrollPane homeScrollPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuBarPanel;
    private javax.swing.JButton montagemButton;
    private javax.swing.JPanel montagemPanel;
    private javax.swing.JScrollPane montagemScrollPane;
    private javax.swing.JPanel navegationBarPanel;
    private javax.swing.JButton produtosButton;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JScrollPane produtosScrollPane;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPanel windowBarPanel;
    private javax.swing.JButton windowCloseButton;
    private javax.swing.JButton windowMinimizeButton;
    // End of variables declaration//GEN-END:variables
}
