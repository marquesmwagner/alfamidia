import java.time.LocalDate;

public class Aluno extends Pessoa {

    private double notaFinal;

    public Aluno(String nome, String telefone, String dataNascimento, LocalDate dataCadastro, LocalDate dataAlteracao,
            double notaFinal) {
        super(nome, telefone, dataNascimento, dataCadastro, dataAlteracao);
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return
                "Nome: " + getNome() +
                ", Telefone: " + getTelefone() +
                ", Data de Nascimento: " + getDataNascimento() +
                ", Data de Cadastro: " + getDataCadastro() +
                ", Data de Alteração: " + getDataAlteracao() +
                ", Notal Final: " + getNotaFinal();
    }

}
