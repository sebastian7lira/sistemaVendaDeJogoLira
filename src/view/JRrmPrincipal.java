/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author u07679183120
 */
public class JRrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JRrmPrincipal
     */
    public JRrmPrincipal() {
        initComponents();
        setTitle("Sistema de compra e venda");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuJogos = new javax.swing.JMenuItem();
        jMnuSistema = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();
        jMnuVendaProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setMnemonic('c');
        jMenu1.setText("Cadastros");

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('u');
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuUsuarios);

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mm.png"))); // NOI18N
        jMnuClientes.setMnemonic('l');
        jMnuClientes.setText("Clientes");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuClientes);

        jMnuJogos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuJogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jogo-arcade.png"))); // NOI18N
        jMnuJogos.setMnemonic('l');
        jMnuJogos.setText("Jogos");
        jMnuJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuJogosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuJogos);

        jMnuSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/processo-interno.png"))); // NOI18N
        jMnuSistema.setMnemonic('l');
        jMnuSistema.setText("Sistema");
        jMnuSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSistemaActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuSistema);
        jMenu1.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMnuSair.setMnemonic('s');
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('m');
        jMenu2.setText("Movimentos");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/etiqueta-de-venda.png"))); // NOI18N
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuVendas);

        jMnuVendaProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar-ao-carrinho.png"))); // NOI18N
        jMnuVendaProduto.setText("Vendas Produto");
        jMnuVendaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendaProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuVendaProduto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
        JDlgUsuario  JDlgUsuarios  = new JDlgUsuario(this, true);
        JDlgUsuarios.setVisible(true);
           
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
        // TODO add your handling code here:
         JDlgCliente  JDlgCliente  = new JDlgCliente(this, true);
        JDlgCliente.setVisible(true);
    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        // TODO add your handling code here:
        JDlgVenda  JDlgVenda  = new JDlgVenda(this, true);
        JDlgVenda.setVisible(true);
    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jMnuVendaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendaProdutoActionPerformed
        // TODO add your handling code here:
        JDlgVendaProduto  JDlgVendaProduto   = new JDlgVendaProduto (this, true);
        JDlgVendaProduto .setVisible(true);
    }//GEN-LAST:event_jMnuVendaProdutoActionPerformed

    private void jMnuJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuJogosActionPerformed
        // TODO add your handling code here:
         JDlgJogos  JDlgJogos   = new JDlgJogos (this, true);
        JDlgJogos .setVisible(true);
    }//GEN-LAST:event_jMnuJogosActionPerformed

    private void jMnuSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSistemaActionPerformed
        // TODO add your handling code here:
             JDlgSistema  JDlgSistema   = new JDlgSistema (this, true);
        JDlgSistema .setVisible(true);
    }//GEN-LAST:event_jMnuSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(JRrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenuItem jMnuJogos;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuSistema;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendaProduto;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
