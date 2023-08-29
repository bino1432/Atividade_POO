package Atividade;

public class teste {
	public static void main (String[] args) {
		
		Gerador g = new Gerador();
		InversorFrequencia i = new InversorFrequencia();
		MotorEletrico m = new MotorEletrico();
		WEG w = new WEG();
		ServicoManutencao s = new ServicoManutencao();
		
		System.out.println(g.Ligado(false));
		System.out.println(i.Ligado(true));
		System.out.println(m.FazerManutencao());
		System.out.println(" ");
		System.out.println("=================== Produtos WEG ===================");
		System.out.println(w.ListarProdutos());
		System.out.println(w.ListarServicosManutencao());
		System.out.println(" ");
		System.out.println("=================== Servicos de Manutencão ===================");
		System.out.println(s.Limpeza());
		System.out.println(s.Parafusos());
		System.out.println(s.Oleo());
				

	}
}
