public class Funcionario {
  private String cpf, nome;
  private double salario;
  private double tetoSalario = 40000d;

  public Funcionario(String nome, String cpf, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
  }


  public double getTetoSalario() {
    return tetoSalario;
  }

  public void setTetoSalario(double tetoSalario) {
    this.tetoSalario = tetoSalario;
  }

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getCpf() {
    return cpf;
  }

  public void aumentarSalario(float porcentagem) throws IllegalArgumentException {
    if (porcentagem < 0) {
      System.out.println("Valor inválido de salário.");
      throw new IllegalArgumentException();
    } else if ((salario + salario * porcentagem) > 40000d) {
      System.out.println("Valor ultrapassa o teto.");
      throw new IllegalArgumentException();
    } else {
      salario = salario + salario * porcentagem;
    }

    System.out.println("Salário: " + salario);
  }
}
