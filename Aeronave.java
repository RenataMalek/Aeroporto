
public class Aeronave {

	int ID;
	int ano;
	String modelo;
	int capacidade;
	String destino;
	
	void voar(boolean voar) {
		
		 if(voar == false) {
			 System.out.println("O avi�o ainda est� na pista!");
		 }else {
			 System.out.println("O aviao j� decolou!");
		 }
		
	}
	
}
