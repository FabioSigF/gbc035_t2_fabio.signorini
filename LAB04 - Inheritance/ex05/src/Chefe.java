public class Chefe extends Funcionario{

  public Chefe(){
    super();
  }

  public Chefe(String nome, String dataNascimento, Double salario) {
    super(nome, dataNascimento, salario);
  }

  public void mostrarFuncionario() {
    System.out.println("Cargo: Chefe");
    super.mostrarFuncionario();
  }
}
