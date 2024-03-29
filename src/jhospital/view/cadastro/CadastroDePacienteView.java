/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.view.cadastro;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import jhospital.controller.PacienteController;


/**
 *
 * @author admin
 */
public class CadastroDePacienteView extends javax.swing.JPanel {
    
    private JTabbedPane tabbedPane;
    
    private void limparDados() {
            textFieldNome.setText("");
            textFieldEmail.setText("");
            textFieldEndereco.setText("");
            textFieldTelefone.setText("");
            textFieldQuarto.setText("");
            textFieldDoenca.setText("");
            textFieldDiasInternado.setText("");
            comboBoxPlanoDeSaude.setSelectedIndex(0);
         
         
        }

    /**
     * Creates new form CadastroDePacienteView
     */
    public CadastroDePacienteView(JTabbedPane tabbedPanel) {
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

        jLabel1 = new javax.swing.JLabel();
        labelCadastroDoPaciente = new javax.swing.JLabel();
        separatorSuperior = new javax.swing.JSeparator();
        labelNome = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelQuarto = new javax.swing.JLabel();
        labelDiasInternado = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        textFieldEndereco = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldQuarto = new javax.swing.JTextField();
        textFieldDiasInternado = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelDoenca = new javax.swing.JLabel();
        labelPlanoDeSaude = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldDoenca = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        comboBoxPlanoDeSaude = new javax.swing.JComboBox<>();
        buttonSalvar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        labelCadastroDoPaciente.setText("Cadastro de Paciente");

        labelNome.setText("Nome Completo: ");

        labelEndereco.setText("Endereço: ");

        labelEmail.setText("Email: ");

        labelQuarto.setText("Quarto: ");

        labelDiasInternado.setText("Dias Internado: ");

        labelTelefone.setText("Telefone: ");

        labelDoenca.setText("Doença: ");

        labelPlanoDeSaude.setText("Plano de Saúde: ");

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        comboBoxPlanoDeSaude.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separatorSuperior)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelEndereco, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(labelQuarto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDiasInternado, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldDiasInternado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelDoenca)
                                            .addComponent(labelPlanoDeSaude)
                                            .addComponent(labelTelefone))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                            .addComponent(textFieldDoenca)
                                            .addComponent(comboBoxPlanoDeSaude, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(textFieldNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldEndereco)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCadastroDoPaciente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastroDoPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuarto)
                    .addComponent(textFieldQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDoenca)
                    .addComponent(textFieldDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDiasInternado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDiasInternado)
                    .addComponent(labelPlanoDeSaude)
                    .addComponent(comboBoxPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(textFieldNome != null &&
                !textFieldNome.getText().equals("") &&
                textFieldEmail != null &&
                !textFieldEmail.getText().equals("") &&
                textFieldEndereco != null &&
                !textFieldEndereco.getText().equals("") &&
                textFieldDoenca != null &&
                !textFieldDoenca.getText().equals("")
                ) {
            PacienteController pc = new PacienteController();
            try {
                pc.inserir(textFieldNome.getText(),
                        textFieldEmail.getText(),
                        textFieldEndereco.getText(),
                        textFieldTelefone.getText(),
                        textFieldQuarto.getText(),
                        textFieldDoenca.getText(),
                        textFieldDiasInternado.getText(),
                        (String)comboBoxPlanoDeSaude.
                                getSelectedItem());
                JOptionPane.showMessageDialog(this,
                        "Contato salvo com sucesso!",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limparDados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possivel salvar contato\n"
                + e.getLocalizedMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "O nome, email, endereço, e doença do " + "paciente são campos obrigatórios!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        
            
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboBoxPlanoDeSaude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCadastroDoPaciente;
    private javax.swing.JLabel labelDiasInternado;
    private javax.swing.JLabel labelDoenca;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPlanoDeSaude;
    private javax.swing.JLabel labelQuarto;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JSeparator separatorSuperior;
    private javax.swing.JTextField textFieldDiasInternado;
    private javax.swing.JTextField textFieldDoenca;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldQuarto;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
