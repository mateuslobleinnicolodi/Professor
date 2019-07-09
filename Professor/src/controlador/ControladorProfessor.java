/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ProfessorDao;
import javax.swing.JOptionPane;
import modelo.Professor;
import tela.manutencao.Manutencao_Professor;

/**
 *
 * @author Administrador
 */
public class ControladorProfessor {

    public static void inserir(Manutencao_Professor man) {
        Professor objeto = new Professor();
        objeto.setNome(man.jtfNome.getText());
        objeto.setSobrenome(man.jtfSobrenome.getText());
        objeto.setEndereco(man.jtfEndereco.getText());
        
        boolean resultado = ProfessorDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
