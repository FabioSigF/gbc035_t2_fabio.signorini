public class Vendedor extends Funcionario{
  private int vendas;
  private Double comissaoPorVenda = 1.50;
  public Vendedor(){
    super();
    vendas = 0;
  }

  public Vendedor(String nome, String dataNascimento, Double salario, int vendas) {
    super(nome, dataNascimento, salario);
    this.salario = salario + (vendas * comissaoPorVenda);
  }

  public void mostrarFuncionario() {
    System.out.println("Cargo: Vendedor");
    super.mostrarFuncionario();
  }
}
