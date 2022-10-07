package Visao;

import Modelo.Eletrodomesticos;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class JIRemover extends javax.swing.JInternalFrame {

    /**
     * Creates new form JICadastro
     */
    public JIRemover() {
        initComponents();
        txtProduto.setEditable(false);
        txtMarca.setEditable(false);
        txtPreco.setEditable(false);
        txtCor.setEditable(false);
        txtDescricao.setEditable(false);
        cbTensao.setEnabled(false);
        cbTensao.getModel().setSelectedItem("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        lblTensao = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtId = new javax.swing.JTextField();
        cbTensao = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();

        setClosable(true);
        setTitle("Remoção de itens");

        lblNome.setForeground(new java.awt.Color(102, 102, 102));
        lblNome.setText("Nome:");

        lblMarca.setForeground(new java.awt.Color(102, 102, 102));
        lblMarca.setText("Marca:");

        txtProduto.setForeground(new java.awt.Color(102, 102, 102));
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        txtMarca.setForeground(new java.awt.Color(102, 102, 102));

        lblPreco.setForeground(new java.awt.Color(102, 102, 102));
        lblPreco.setText("Preço: R$");

        txtPreco.setForeground(new java.awt.Color(102, 102, 102));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        lblCor.setForeground(new java.awt.Color(102, 102, 102));
        lblCor.setText("Cor:");

        lblTensao.setForeground(new java.awt.Color(102, 102, 102));
        lblTensao.setText("Tensão:");

        txtCor.setForeground(new java.awt.Color(102, 102, 102));
        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });

        lblId.setText("Digite o ID do produto:");

        btnSalvar.setText("Remover");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblDesc.setForeground(new java.awt.Color(102, 102, 102));
        lblDesc.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setForeground(new java.awt.Color(102, 102, 102));
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        cbTensao.setForeground(new java.awt.Color(102, 102, 102));
        cbTensao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "110 v", "220 v", "bivolt" }));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Lupa search.png"))); // NOI18N
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(btnSalvar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lblId)
                            .addComponent(lblMarca)
                            .addComponent(lblPreco)
                            .addComponent(lblCor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTensao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDesc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTensao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(233, 233, 233))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMarca)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTensao))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ID não digitado.");
        }else{
            Eletrodomesticos produtos = new Eletrodomesticos();
            produtos.Deletar(txtId.getText());

            JTextField s[] = {txtProduto, txtMarca, txtPreco, txtCor, txtId};
            Limpador.limpaform(s);
            cbTensao.getModel().setSelectedItem("");       
            txtDescricao.setText("");
            txtId.requestFocus();
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(txtId.getText().equals("") && txtProduto.getText().equals("") && txtMarca.getText().equals("") && txtPreco.getText().equals("") && txtCor.getText().equals("") && txtDescricao.getText().equals("") && cbTensao.getModel().getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Digite algum ID.");
            }else if(txtId.getText().equals("")){
                JTextField args[] = {txtProduto, txtMarca, txtPreco, txtCor};
                Limpador.limpaform(args);
                txtDescricao.setText("");
                cbTensao.getModel().setSelectedItem("");
            }else{
                btnSearch.doClick();
            }
        }
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        Verificador.Apenas_numeros(evt);
    }//GEN-LAST:event_txtIdKeyTyped

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtId.getText().equals("") && txtProduto.getText().equals("") && txtMarca.getText().equals("") && txtPreco.getText().equals("") && txtCor.getText().equals("") && txtDescricao.getText().equals("") && cbTensao.getModel().getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Digite algum ID.");
            txtId.requestFocus();
        }else if(txtId.getText().equals("")){
            JTextField args[] = {txtProduto, txtMarca, txtPreco, txtCor};
            Limpador.limpaform(args);
            txtDescricao.setText("");
            cbTensao.getModel().setSelectedItem("");
        }else{
            btnSalvar.requestFocus();
            JTextField s[] = {txtProduto, txtMarca, txtPreco, txtCor};
            Eletrodomesticos.VerificarID(txtId.getText(), s, txtDescricao, cbTensao);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbTensao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTensao;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}