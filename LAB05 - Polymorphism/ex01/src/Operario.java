public class Operario extends Funcionario{
  private int quantidadeProduzida;
  private Double valorPorProducao = 1.50;
  public Operario(){
    super();
    quantidadeProduzida = 0;
  }

  public Operario(String nome, String dataNascimento, int quantidadeProduzida) {
    super(nome, dataNascimento, 0.0);
    this.quantidadeProduzida = quantidadeProduzida;
  }
  @Override
  public Double getSalario() {
    return quantidadeProduzida * valorPorProducao;
  }
  public void mostrarFuncionario() {
    System.out.println("Cargo: Operário");
    super.mostrarFuncionario();
  }
}