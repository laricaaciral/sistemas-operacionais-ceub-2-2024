package br.com.ceub;

public class BuscaAluno {

	public static void main(String[] args) {
		
		String nome = "Oliveira";
		
		Thread threadAlunos1 = new Thread(new TarefaBuscaNome("/conhecendo-threads/src/br/com/ceub/turma1.txt", nome));
		Thread threadAlunos2 = new Thread(new TarefaBuscaNome("/conhecendo-threads/src/br/com/ceub/turma2.txt", nome));
		Thread threadCientistas = new Thread(new TarefaBuscaNome("/conhecendo-threads/src/br/com/ceub/cientistas.txt", nome));
		
		threadAlunos1.start();
		threadAlunos2.start();
		threadCientistas.start();

	}

}
