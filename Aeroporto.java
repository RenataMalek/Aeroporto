
public class Aeroporto {

	int ID;
	String nome;
	String endeco;
	String tamanho;
	int qtdeVagasEstacionamento;

	void atualizarQuadro(String destino) {
		System.out.println("Proximo destino: " + destino);
	}

	public static void main(String[] args) {

		boolean trabalhando;
		boolean voar;
		boolean subir;

		Aeroporto porto1 = new Aeroporto();
		Aeronave nave1 = new Aeronave();
		Piloto piloto1 = new Piloto();
		Passageiro passag1 = new Passageiro();

		passag1.ID = 1;
		passag1.nome = "Maria";
		passag1.idade = 40;
		passag1.CPF = "111.111.111-11";
		passag1.destino = "Roraima";

		piloto1.ID = 1;
		piloto1.nome = "José";
		piloto1.CHT = "12345";
		piloto1.dataVoo = "10/06/2020";
		piloto1.horaVoo = "10h15";

		nave1.ID = 1;
		nave1.ano = 2010;
		nave1.modelo = "1I25L";
		nave1.capacidade = 100;
		nave1.destino = "Roraima";

		porto1.ID = 1;
		porto1.nome = "EuroPorto";
		porto1.endeco = "Rua Djalma, nº 123";
		porto1.tamanho = "355.0 m²";
		porto1.qtdeVagasEstacionamento = 1500;

		trabalhando = true;
		voar = true;
		subir = true;

		porto1.atualizarQuadro(nave1.destino);
		nave1.voar(voar);
		piloto1.pilotar(trabalhando);
		passag1.embarcar(subir);

		System.out.println();

		Aeroporto porto2 = new Aeroporto();
		Aeronave nave2 = new Aeronave();
		Piloto piloto2 = new Piloto();
		Passageiro passag2 = new Passageiro();

		passag2.ID = 2;
		passag2.nome = "Julia";
		passag2.idade = 18;
		passag2.CPF = "222.222.222-22";
		passag2.destino = "Rio Grande do Sul";

		piloto2.ID = 2;
		piloto2.nome = "Paulo";
		piloto2.CHT = "67890";
		piloto2.dataVoo = "15/03/2021";
		piloto2.horaVoo = "14:55";

		nave2.ID = 2;
		nave2.ano = 2002;
		nave2.modelo = "2I36L";
		nave2.capacidade = 150;
		nave2.destino = "Rio Grande do Sul";

		porto2.ID = 2;
		porto2.nome = "RGSPorto";
		porto2.endeco = "Rua Luizinha, nº 456";
		porto2.tamanho = "110.0 m²";
		porto2.qtdeVagasEstacionamento = 600;

		trabalhando = false;
		voar = false;
		subir = false;

		porto2.atualizarQuadro(nave2.destino);
		nave2.voar(voar);
		piloto2.pilotar(trabalhando);
		passag2.embarcar(subir);

	}
}
