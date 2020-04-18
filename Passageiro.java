
public class Passageiro {

	int ID;
	String nome;
	int idade;
	String CPF;
	String destino;

	void embarcar(boolean subir) {

		if (subir == true) {
			System.out.println("O passageiro pegou o voo");
		} else {
			System.out.println("O passageiro perdeu o voo");
		}

	}
}
