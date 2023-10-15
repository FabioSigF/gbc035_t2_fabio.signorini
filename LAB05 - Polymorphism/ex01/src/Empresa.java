public class Empresa {
  public static void main(String[] args) {
    Funcionario[] funcionarios = {
            new Chefe("Fábio", "27/06/2001", 50000.0),
            new Vendedor("Henrique", "10/11/2000", 1500.0, 157),
            new Operario("Jose", "21/01/1991", 2000),
            new Horista("Pedro", "12/09/1999", 200)
    };

    FolhaDePagamento.calcularFolha(funcionarios);
  }
}