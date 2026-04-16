/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrocliente;
import javax.swing.*;
import java.awt.Container;
import java.awt.Color;

/**
 *
 * @author Renato Aparecido da Silva - 2° DS/AMS
 */
public class CadastroCliente extends JFrame {

        JLabel titulo;
    JLabel lblNome, lblCPF, lblRG, lblEndereco, lblCidade, lblEstado, lblCEP;

    JTextField txtNome, txtCPF, txtRG, txtEndereco, txtCidade, txtEstado, txtCEP;

    public CadastroCliente() {
        super("Cadastro de Cliente");

         ImageIcon icone = new ImageIcon(getClass().getResource("/zl.jpg"));
setIconImage(icone.getImage());

        Container tela = getContentPane();
        tela.setLayout(null);

        tela.setBackground(new Color(210, 205, 200));

        // Título
        titulo = new JLabel("Cadastro de Cliente");
        titulo.setBounds(130, 10, 200, 25);
        titulo.setForeground(Color.RED);

        // Labels
        lblNome = new JLabel("Nome:");
        lblCPF = new JLabel("CPF:");
        lblRG = new JLabel("RG:");
        lblEndereco = new JLabel("Endereço:");
        lblCidade = new JLabel("Cidade:");
        lblEstado = new JLabel("Estado:");
        lblCEP = new JLabel("CEP:");

        // Campos
        txtNome = new JTextField(50);
        txtCPF = new JTextField(20);
        txtRG = new JTextField(20);
        txtEndereco = new JTextField(50);
        txtCidade = new JTextField(30);
        txtEstado = new JTextField(20);
        txtCEP = new JTextField(10);

        // Posições
        lblNome.setBounds(50, 50, 100, 20);
        txtNome.setBounds(150, 50, 200, 20);

        lblCPF.setBounds(50, 80, 100, 20);
        txtCPF.setBounds(150, 80, 120, 20);

        lblRG.setBounds(50, 110, 100, 20);
        txtRG.setBounds(150, 110, 120, 20);

        lblEndereco.setBounds(50, 140, 100, 20);
        txtEndereco.setBounds(150, 140, 200, 20);

        lblCidade.setBounds(50, 170, 100, 20);
        txtCidade.setBounds(150, 170, 200, 20);

        lblEstado.setBounds(50, 200, 100, 20);
        txtEstado.setBounds(150, 200, 120, 20);

        lblCEP.setBounds(50, 230, 100, 20);
        txtCEP.setBounds(150, 230, 100, 20);

        // Adicionando
        tela.add(titulo);

        tela.add(lblNome);
        tela.add(txtNome);

        tela.add(lblCPF);
        tela.add(txtCPF);

        tela.add(lblRG);
        tela.add(txtRG);

        tela.add(lblEndereco);
        tela.add(txtEndereco);

        tela.add(lblCidade);
        tela.add(txtCidade);

        tela.add(lblEstado);
        tela.add(txtEstado);

        tela.add(lblCEP);
        tela.add(txtCEP);

        setSize(420, 320);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        CadastroCliente app = new CadastroCliente();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}