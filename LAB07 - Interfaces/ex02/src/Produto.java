public class Produto implements Classificavel {
  private int codigo;

  public Produto(int codigo) {
    this.codigo = codigo;
  }

  public int eMenorQue(Classificavel o) {
    Produto compara = (Produto) o;
    if (this.codigo < compara.codigo) return 0;
    else return -1;
  }

  public int getCodigo(){
    return codigo;
  }

  public static void ordenarProdutos(Produto[] vetor) {
    for (int i = 0; i < vetor.length - 1; i++) {
      for (int j = 0; j < vetor.length - i - 1; j++) {
        if (vetor[j].codigo > vetor[j + 1].codigo) {
          Produto temp = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = temp;
        }
      }
    }
  }

  public static void mostrarProdutos(Produto[] vetor) {
    for (Produto produto: vetor) {
      System.out.println( "Código: " + produto.codigo);
    }
  }
}
