package app10;

public class Master {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		Tecnico t1 = new Tecnico();
		Professor p1 = new Professor();
		Visitante v1 = new Visitante();
		
		
		a1.detalhar();
		b1.detalhar();
		t1.detalhar();
		p1.detalhar();
		v1.detalhar();
	}
}

/*
# Super-classe: Classe mãe;
# Sub-classe: Classe filha;
# Ancestral: Classes superiores;
# Descendente: Classes inferiores;
# Classe Raiz: Classe mais superior;
# Classe Folha: Classe sem filhos;
# Generalização: Subir os níveis em que estão as classes;
# Especialização: Descer os níveis em que estão as classes;
# Tipos de Herança:
	% Herança de Implementação: Não possui linha;
	% Herança para Diferença: Possui linha;
# Classe Abstrata: Não é possível instanciar (inicializar) no Master;
# Classe Final: Não pode herdar filhos;
# Método Abstrato: Declarado, mas não implementado (interface);
# Método Final: Método que não pode ser sobreposto (Override);
*/