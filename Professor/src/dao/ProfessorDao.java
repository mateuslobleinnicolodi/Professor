package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Professor;

public class ProfessorDao {
    public static boolean inserir(Professor objeto) {
        String sql = "INSERT INTO Professor (nome, sobrenome, endereco) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            ps.setString(2, objeto.getSobrenome());
            ps.setString(3, objeto.getEndereco());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        Professor objeto = new Professor();
        objeto.setNome("Mateus");
        objeto.setSobrenome("Nicolodi");
        objeto.setEndereco("R. Paraíso 184, Espumoso");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
