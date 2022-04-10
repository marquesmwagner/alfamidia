import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String telefone;
    private String dataNascimento;
    private LocalDate dataCadastro;
    private LocalDate dataAlteracao;

    public Pessoa(String nome, String telefone, String dataNascimento, LocalDate dataCadastro,
            LocalDate dataAlteracao) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.dataAlteracao = dataAlteracao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAlteracao() {
        return this.dataAlteracao;
    }

    public void setDataAlteracao(LocalDate dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    @Override
    public String toString() {
        return 
                "Nome: " + getNome() + 
                ", Telefone: " + getTelefone() +  
                ", Data de Nascimento: " + getDataNascimento() +
                ", Data de Cadastro: " + getDataCadastro() +
                ", Data de Alteração: " + getDataAlteracao();
    }

}
