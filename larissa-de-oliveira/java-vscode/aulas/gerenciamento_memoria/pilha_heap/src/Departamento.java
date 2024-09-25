import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private List<Disciplina> disciplinas;

    public Departamento(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    } 

    public void imprimirDetalhes() {

        System.out.println("Departamento: " + nome );
        for(Disciplina d : disciplinas) {
            d.imprimirDetalhes();
        }
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
}
