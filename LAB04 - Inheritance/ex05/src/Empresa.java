public class Empresa {
  public static void main(String[] args) {
    Chefe chefe[] = new Chefe[2];
    chefe[0] = new Chefe("Fábio", "27/06/2001", 50000.0);
    chefe[1] = new Chefe("Felipe", "27/06/2001", 50000.0);
    Vendedor vendedor[] = new Vendedor[2];
    vendedor[0] = new Vendedor("Henrique", "10/11/2000", 1500.0, 157);
    vendedor[1] = new Vendedor("Gabriel", "10/11/2000", 1500.0, 201);
    Operario operario[] = new Operario[2];
    operario[0] = new Operario("Jose", "21/01/1991", 2000);
    operario[0] = new Operario("Joseph", "21/01/1991", 1900);
    Horista horista[] = new Horista[2];
    horista[0] = new Horista("Pedro", "12/09/1999", 200);
    horista[1] = new Horista("Peter", "12/09/1999", 190);

    chefe[0].mostrarFuncionario();
    vendedor[0].mostrarFuncionario();
    operario[0].mostrarFuncionario();
    horista[0].mostrarFuncionario();
  }
}
