public class Funcionario {
  protected String nome, dataNascimento;
  protected Double salario;

  public Funcionario(){
    nome = "";
    dataNascimento = "";
    salario = 0.0;
  }

  public Funcionario(String nome, String dataNascimento, Double salario) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.salario = salario;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public Double getSalario() {
    return salario;
  }
  public void setSalario(Double salario) {
    this.salario = salario;
  }

  public void mostrarFuncionario() {
    System.out.printf("Nome: %s\nData nascimento: %s\nSalario: %f\n\n", nome, dataNascimento,
            salario);
  }
}
