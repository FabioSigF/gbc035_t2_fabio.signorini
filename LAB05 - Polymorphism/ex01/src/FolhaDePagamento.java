import java.util.ArrayList;

public class FolhaDePagamento {
  public static void calcularFolha(Funcionario[] funcionarios) {
    double totalSalarios = 0;

    for (Funcionario funcionario : funcionarios) {
      totalSalarios += funcionario.getSalario();
      System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.getSalario());
    }

    System.out.println("Total de salários a pagar: " + totalSalarios);
  }
}
