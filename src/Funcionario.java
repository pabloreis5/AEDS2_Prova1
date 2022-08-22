
public class Funcionario implements java.io.Serializable{
    private int cod;
    private String nome, cpf, data_nasc;
    private double salario;

    public Funcionario(int cod, String nome, String cpf, String data_nasc, double salario) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.salario = salario;
    }

    @Override
    public String toString() {

        return 
        "Codigo: " + this.cod + "\n" +
        "Nome: " + this.nome + "\n" +
        "CPF: " + this.cpf + "\n" +
        "Data Nascimento: " + this.data_nasc + "\n" +
        "Salario: " + this.salario + "\n";
    }

    

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



    

    
    
    
    
}
