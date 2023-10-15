public class Vendedor extends Funcionario{
  private int vendas;
  private Double comissaoPorVenda = 1.50;
  public Vendedor(){
    super();
    vendas = 0;
  }

  public Vendedor(String nome, String dataNascimento, Double salario, int vendas) {
    super(nome, dataNascimento, salario);
    this.vendas = vendas;
  }

  @Override
  public Double getSalario() {
    return super.getSalario() + comissaoPorVenda * vendas;
  }

  public void mostrarFuncionario() {
    System.out.println("Cargo: Vendedor");
    super.mostrarFuncionario();
  }
}