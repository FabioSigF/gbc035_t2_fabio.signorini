public class Horista extends Funcionario{
  private int totalDeHoras;
  private Double valorPorHora = 20.50;
  public Horista(){
    super();
    totalDeHoras = 0;
  }

  public Horista(String nome, String dataNascimento, int totalDeHoras) {
    super(nome, dataNascimento, 0.0);
    this.totalDeHoras = totalDeHoras;
  }

  @Override
  public Double getSalario() {
    return totalDeHoras * valorPorHora;
  }

  public void mostrarFuncionario() {
    System.out.println("Cargo: Horista");
    super.mostrarFuncionario();
  }
}