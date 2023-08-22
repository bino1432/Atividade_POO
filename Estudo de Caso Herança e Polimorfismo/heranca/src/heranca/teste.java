package heranca;

public class teste {
	
	public static void main (String[]args) {
		Animal animal = new Animal("homo sapiens", 67, "grande");
		Cachorro dog = new Cachorro("canis lupus familiaris", 20, "médio");
		
		System.out.println(dog.latir());
		System.out.println(dog.cachorro());
		//System.out.println(dog.alimenter("Ração"));
		//System.out.println(dog.repousar(5, "min"));
		
		Animal bicho = new Animal();
		//bicho = new Cachorro("canis lupus familiaris", 20, "médio");
		
		//Cachorro dog2 = (Cachorro)bicho;
		
		//System.out.println(bicho.reproduzir());
		//System.out.println(dog.reproduzir());
		
		peixe nemo = new peixe();
		
		System.out.println(nemo.bolhas());
		System.out.println(nemo.peixe());
		
		Sapo frog = new Sapo();
		
		System.out.println(frog.barulho());
		System.out.println(frog.froakie());
		
		PeixeAguaDoce dori = new PeixeAguaDoce();

		System.out.println(dori.bolhas());
		System.out.println(dori.dori());
	}
}
