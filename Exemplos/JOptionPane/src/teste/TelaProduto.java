package teste;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import java.util.ArrayList;

public class TelaProduto {
	public static void main(String[] args) {
		
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		// REGEX para verificar as verificações
		//começo loop
		JLabel lbNome = new JLabel("Nome:");
		JLabel lbPreco = new JLabel("preço:");
		JLabel lbCategoria = new JLabel("Categoria:");
		JLabel lbAvalicao = new JLabel("Avaliação:");
		JTextField txNome = new JTextField();
		JTextField txPreco = new JTextField();
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.addItem("Espostes");
		cbCategoria.addItem("Infantil");
		cbCategoria.addItem("Tecnologia");
		cbCategoria.addItem("Lazer");
		cbCategoria.addItem("Cozinha");
		
		JTable tabelaProdutos = new JTable(
				new Object[][] {{"Batata", "1.95"}},
				new Object[] {"Nome", "Preço"});
		
		Object[] componentes = {lbNome, txNome, lbPreco, txPreco, lbCategoria, cbCategoria, tabelaProdutos};
		
		JOptionPane.showMessageDialog(null, componentes, "Produto", JOptionPane.DEFAULT_OPTION);
		
		Produto p = new Produto();
		p.setNome(txNome.getText());
		p.setPreco(Double.parseDouble(txPreco.getText()));
		p.setCategoria(cbCategoria.getSelectedItem());
		
		listaProdutos.add(p);
		//fim loop
		
		//mostrar produtos
		//Jlist;
		//JTable;
		for(int cont = 0; cont < listaProdutos.size(); cont++) {
			System.out.print("\nNome: " + listaProdutos.get(cont).getNome() + "\nPreco: " + listaProdutos.get(cont).getPreco());
		}
		
		for(Produto p: listaProdutos) {
			System.out.print("\nNome: " + p.getNome() + "\nPreco: " + p.getPreco());
		}
	}
}
