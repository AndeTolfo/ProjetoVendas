/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.dao.ItemVendaDAO;
import projeto.dao.ProdutosDAO;
import projeto.dao.VendasDAO;
import projeto.model.Clientes;
import projeto.model.ItemVenda;
import projeto.model.Produtos;
import projeto.model.Vendas;

/**
 *
 * @author ander
 */
public class FrmPagamentos extends javax.swing.JFrame {

    /**
     *
     */
    Clientes cliente = new Clientes();
 
    /**
     *
     */
    DefaultTableModel carrinho;
    
    /**
     * Creates new form FrmPagamentos
     */
    public FrmPagamentos() {
        initComponents();
        txtcartao.setText("0");
        txtdinheiro.setText("0");
        txtcheque.setText("0");   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdinheiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcartao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcheque = new javax.swing.JTextField();
        txttroco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnfinalizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobs = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamentos");

        jPanel2.setBackground(new java.awt.Color(0, 63, 178));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pagamentos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        txtdinheiro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtdinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdinheiroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("CARTÃO:");

        txtcartao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtcartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcartaoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("CHEQUE:");

        txtcheque.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtcheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchequeActionPerformed(evt);
            }
        });

        txttroco.setEditable(false);
        txttroco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txttroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrocoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("TROCO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("TOTAL:");

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        btnfinalizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnfinalizar.setText("Finalizar Venda");
        btnfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Observações:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("DINHEIRO:");

        jScrollPane1.setViewportView(txtobs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                            .addComponent(txttroco)
                                            .addComponent(txtcheque)
                                            .addComponent(txtcartao))))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel8)
                    .addContainerGap(515, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtcheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnfinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(jLabel8)
                    .addContainerGap(308, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdinheiroActionPerformed

    private void txtcartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcartaoActionPerformed

    private void txtchequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchequeActionPerformed

    private void txttrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrocoActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarActionPerformed
        // botao finalizar venda
       double pcartao, pcheque, pdinheiro, totalpago, totalvenda, troco;

        pcartao = Double.parseDouble(txtcartao.getText());
        pcheque = Double.parseDouble(txtcheque.getText());
        pdinheiro = Double.parseDouble(txtdinheiro.getText());

        totalvenda = Double.parseDouble(txttotal.getText());

        //Calcularo total e o troco
        totalpago = pcartao + pcheque + pdinheiro;

        troco = totalpago - totalvenda;

        txttroco.setText(String.valueOf(troco));

        Vendas objv = new Vendas();

        //Dados do cliente (cliente_id)
        objv.setCliente(cliente);

        //Pega a data da venda
        Date agora = new Date();
        SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd");
        String datamysql = dataEUA.format(agora);

        objv.setData_venda(datamysql);

        //Total da venda e obs
        objv.setTotal_venda(totalvenda);
        objv.setObs(txtobs.getText());

        VendasDAO dao_v = new VendasDAO();
        dao_v.cadastrarVenda(objv);

        //Retorna o id da ultima venda realizada
        objv.setId(dao_v.retornaultimavenda());
        


        
     
      // Cadastrando os produtos na tabela itemvendas
        for (int i = 0; i < carrinho.getRowCount(); i++) {

            int qtd_estoque , qtd_comprada, qtd_atualizada;
            Produtos objp = new Produtos();
            ProdutosDAO dao_produto = new ProdutosDAO();
          
            ItemVenda item = new ItemVenda();
            item.setVenda(objv);

            objp.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
            item.setProduto(objp);
            item.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
            item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));
                        
            //Baixa no estoque
            qtd_estoque = dao_produto.retornaEstoqueAtual(objp.getId());
            qtd_comprada = Integer.parseInt(carrinho.getValueAt(i, 2).toString());
            qtd_atualizada = qtd_estoque - qtd_comprada;
            
            dao_produto.baixaEstoque(objp.getId(), qtd_atualizada);         

            ItemVendaDAO daoitem = new ItemVendaDAO();
            daoitem.cadastraitem(item);

         }
       /***********************************************************************/
         
        JOptionPane.showMessageDialog(null, "Venda Registrada com Sucesso!");


        
        
        
    }//GEN-LAST:event_btnfinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPagamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcartao;
    private javax.swing.JTextField txtcheque;
    private javax.swing.JTextField txtdinheiro;
    private javax.swing.JTextPane txtobs;
    public javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttroco;
    // End of variables declaration//GEN-END:variables
}
