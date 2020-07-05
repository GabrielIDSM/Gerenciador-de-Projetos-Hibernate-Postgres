package UI;

import BLL.FazendoBLL;
import BLL.FeitoBLL;
import DTO.FazendoDTO;
import DTO.ProjetoDTO;
import DTO.UsuarioDTO;
import java.util.List;
import javax.swing.JOptionPane;

public class pnlNovaTarefaFeito extends javax.swing.JPanel {
    //Atributos
    frmPrincipal principal;
    UsuarioDTO usuario;
    ProjetoDTO projeto;
    FazendoDTO fazendo;
    List<FazendoDTO> fazendoList;
    FazendoBLL fazendoBll = new FazendoBLL();
    FeitoBLL feitoBll = new FeitoBLL();
    //Construtor
    public pnlNovaTarefaFeito(UsuarioDTO usuario, ProjetoDTO projeto, frmPrincipal principal) {
        this.usuario = usuario;
        this.projeto = projeto;
        this.principal = principal;
        initComponents();
        btnConfirmar.setEnabled(false);
        fazendoList = fazendoBll.Read(projeto);
        if(!fazendoList.isEmpty()) for(FazendoDTO f : fazendoList){
            if(f.getEstagio() == 2) cbcxItens.addItem("[ID - " + f.getID() + "] " + f.getTitulo()); //Apenas itens marcados para verificação
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnlOp = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        lbItem = new javax.swing.JLabel();
        cbcxItens = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204,204,255));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        pnlOp.setBackground(new java.awt.Color(255, 255, 255));
        pnlOp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        btnConfirmar.setBackground(new java.awt.Color(153, 255, 153));
        btnConfirmar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpLayout = new javax.swing.GroupLayout(pnlOp);
        pnlOp.setLayout(pnlOpLayout);
        pnlOpLayout.setHorizontalGroup(
            pnlOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlOpLayout.setVerticalGroup(
            pnlOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOVO ITEM");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        lbItem.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lbItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbItem.setText("Item");

        cbcxItens.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbcxItens.setMaximumRowCount(6);
        cbcxItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcxItensActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(cbcxItens, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbcxItens, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(325, 325, 325))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //Determina o objeto
        fazendo = fazendoList.get(cbcxItens.getSelectedIndex());
        //Efetua a inserção de dados
        int result = feitoBll.NovoFeito(fazendo);
        if(result == feitoBll.FEITO_CRIADO){
            JOptionPane.showMessageDialog(principal, "Item criado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            principal.ConfirmarLogin(usuario, projeto);
        }else{
            JOptionPane.showMessageDialog(principal, "Erro desconhecido", "Verifique a conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }                                            

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int op = JOptionPane.showConfirmDialog(principal, "Deseja sair ?", "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(op == JOptionPane.YES_OPTION){
            principal.ConfirmarLogin(usuario, projeto);
        }
    }                                           

    private void cbcxItensActionPerformed(java.awt.event.ActionEvent evt) {                                          
        btnConfirmar.setEnabled(true);
    }                                         


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cbcxItens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbItem;
    private javax.swing.JPanel pnlOp;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration                   
}
