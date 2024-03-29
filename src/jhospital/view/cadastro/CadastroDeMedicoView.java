/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.view.cadastro;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author admin
 */
public class CadastroDeMedicoView extends javax.swing.JPanel {
    private JTabbedPane tabbedPane;

    /**
     * Creates new form CadastroDeMedico
     */
    public CadastroDeMedicoView(JTabbedPane tabbedPanel) {
        this.tabbedPane = tabbedPanel;
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

        labelCadastroDeMedico = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelNome = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelEspecialidade = new javax.swing.JLabel();
        labelValorDaHora = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelHorasMensais = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        textFieldEndereco = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldHorasMensais = new javax.swing.JTextField();
        textFieldEspecialidade = new javax.swing.JTextField();
        textFieldValorDaHora = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        labelCadastroDeMedico.setText("Cadastro de Médico");

        labelNome.setText("Nome Completo:");

        labelEndereco.setText("Endereço:");

        labelEmail.setText("Email:");

        labelEspecialidade.setText("Especialidade:");

        labelValorDaHora.setText("Valor da Hora:");

        labelTelefone.setText("Telefone:");

        labelHorasMensais.setText("Horas Mensais:");

        buttonSalvar.setText("Salvar");

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCadastroDeMedico)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEndereco)
                            .addComponent(labelNome)
                            .addComponent(labelEmail)
                            .addComponent(labelEspecialidade)
                            .addComponent(labelValorDaHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNome)
                            .addComponent(textFieldEndereco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textFieldValorDaHora, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldEspecialidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldEmail, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelHorasMensais, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldHorasMensais, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(textFieldTelefone))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(424, Short.MAX_VALUE)
                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastroDeMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(labelTelefone)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEspecialidade)
                    .addComponent(labelHorasMensais)
                    .addComponent(textFieldHorasMensais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorDaHora)
                    .addComponent(textFieldValorDaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonCancelar))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(this, 
                "Deseja mesmo fechar o cadastro de cliente sem salvar?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        tabbedPane.remove(this);
        tabbedPane.validate();
        tabbedPane.repaint();
        }
    }//GEN-LAST:event_buttonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCadastroDeMedico;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JLabel labelHorasMensais;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelValorDaHora;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldEspecialidade;
    private javax.swing.JTextField textFieldHorasMensais;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTelefone;
    private javax.swing.JTextField textFieldValorDaHora;
    // End of variables declaration//GEN-END:variables
}
