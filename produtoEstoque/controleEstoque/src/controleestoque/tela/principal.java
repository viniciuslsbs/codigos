/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * principal.java
 *
 * Created on 18/03/2013, 00:42:26
 */

package controleestoque.tela;

import com.itextpdf.text.Image;
import controleestoque.tela.relatorio;
import javax.swing.ImageIcon;

/**
 *
 * @author re
 */
public class principal extends javax.swing.JFrame {

    /** Creates new form principal */
    public principal() {
        initComponents();
        try{
//Adicionando o icone
    ImageIcon icon = new ImageIcon(getClass().getResource("/imagem/inic.png"));
    super.setIconImage(icon.getImage());
}catch(Exception e) {
        System.out.println("Icone erro:\n" + e.getMessage());
}
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMSistema = new javax.swing.JMenu();
        JMICadastro = new javax.swing.JMenuItem();
        JMIMovimentoEstoque = new javax.swing.JMenuItem();
        JMIListarProduto = new javax.swing.JMenuItem();
        JMIRelatorio = new javax.swing.JMenuItem();
        JMAjuda = new javax.swing.JMenu();
        JMISobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RTM - Estoque");
        setMinimumSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        JMSistema.setText("Sistema");

        JMICadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JMICadastro.setText("Cadastro Produto");
        JMICadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICadastroActionPerformed(evt);
            }
        });
        JMSistema.add(JMICadastro);

        JMIMovimentoEstoque.setText("Movimento Estoque");
        JMIMovimentoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIMovimentoEstoqueActionPerformed(evt);
            }
        });
        JMSistema.add(JMIMovimentoEstoque);

        JMIListarProduto.setText("Listar Produto");
        JMIListarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListarProdutoActionPerformed(evt);
            }
        });
        JMSistema.add(JMIListarProduto);

        JMIRelatorio.setText("Relatorio");
        JMIRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIRelatorioActionPerformed(evt);
            }
        });
        JMSistema.add(JMIRelatorio);

        jMenuBar1.add(JMSistema);

        JMAjuda.setText("Ajuda");

        JMISobre.setText("Sobre");
        JMISobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMISobreActionPerformed(evt);
            }
        });
        JMAjuda.add(JMISobre);

        jMenuBar1.add(JMAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMICadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadastroActionPerformed

        cadastro cadastro = new cadastro(this, true);

        cadastro.show();

    }//GEN-LAST:event_JMICadastroActionPerformed

    private void JMIListarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListarProdutoActionPerformed

        listar listar = new listar(this, true);

        listar.show();
    }//GEN-LAST:event_JMIListarProdutoActionPerformed

    private void JMISobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMISobreActionPerformed

        sobre sobre = new sobre(this, true, this.getLocation());
        sobre.show();

    }//GEN-LAST:event_JMISobreActionPerformed

    private void JMIMovimentoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIMovimentoEstoqueActionPerformed

        movimentoEstoque movimentoEstoque = new movimentoEstoque(this, true);
        movimentoEstoque.show();
    }//GEN-LAST:event_JMIMovimentoEstoqueActionPerformed

    private void JMIRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIRelatorioActionPerformed

        relatorio relatorio = new relatorio(this,true);
        relatorio.show();

    }//GEN-LAST:event_JMIRelatorioActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMAjuda;
    private javax.swing.JMenuItem JMICadastro;
    private javax.swing.JMenuItem JMIListarProduto;
    private javax.swing.JMenuItem JMIMovimentoEstoque;
    private javax.swing.JMenuItem JMIRelatorio;
    private javax.swing.JMenuItem JMISobre;
    private javax.swing.JMenu JMSistema;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
