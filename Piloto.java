
public class Piloto {

	int ID;
	String nome;
	String CHT;
	String dataVoo;
	String horaVoo;
	
	
	void pilotar(boolean trabalhando) {
		
		
		if(trabalhando == true) {
			System.out.println("O piloto está voando");
		}else {
			System.out.println("O piloto não foi nesse voo");
		}
		
		
	}
	
}
