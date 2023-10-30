public class Main {

  public static void main(String[] args) {
    Cliente clientes[] = {
            new Cliente("Fábio"),
            new Cliente("Felipe"),
            new Cliente("Marcos")
    };

    Produto produtos[] = {
            new Produto(29),
            new Produto(28),
            new Produto(31)
    };

    Servico servicos[] = {
            new Servico(22.5f),
            new Servico(23.5f),
            new Servico(20.5f)
    };

    Produto.ordenarProdutos(produtos);
    System.out.println(produtos[0].eMenorQue(produtos[1]));
    Produto.mostrarProdutos(produtos);
    Cliente.ordenarClientes(clientes);
    Cliente.mostrarClientes(clientes);
    Servico.ordenarServicos(servicos);
    Servico.mostrarServicos(servicos);
  }
}
