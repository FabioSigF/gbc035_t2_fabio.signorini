public class Universidade {
  private String nome, dataDeFundacao;
  private Estudante estudantes[];
  private int numEstTotal, numEstGraduacao, numEstMestrado, numEstDoutorado;

  public Universidade(){
    nome = "";
    dataDeFundacao = "";
    estudantes = new Estudante[100];
    numEstTotal = 0;
    numEstGraduacao = 0;
    numEstMestrado = 0;
    numEstDoutorado = 0;
  }

  public Universidade(String nome, String dataDeFundacao) {
    this.nome = nome;
    this.dataDeFundacao = dataDeFundacao;
    estudantes = new Estudante[100];
    numEstTotal = 0;
    numEstGraduacao = 0;
    numEstMestrado = 0;
    numEstDoutorado = 0;
  }

  public void matricularEstudante(Estudante estudante) {
    if(numEstTotal < 100) {
      estudantes[numEstTotal] = estudante;
      numEstTotal++;

      if(estudante instanceof EstudanteGraduacao) {
        numEstGraduacao++;
      } else if (estudante instanceof EstudanteMestrado) {
        numEstMestrado++;
      } else if (estudante instanceof EstudanteDoutorado) {
        numEstDoutorado++;
      }
    }
  }

  public void getNumEstudantes() {
    System.out.printf("=========================\nContagem de " +
            "estudantes\n=========================\nEstudantes de Graduação: %d\nEstudantes de " +
            "Mestrado: %d\nEstudantes de Doutorado: %d\n=========================",
            numEstGraduacao, numEstMestrado, numEstDoutorado);
  }

  public String getNome() {
    return nome;
  }

  public String getDataDeFundacao(){
    return dataDeFundacao;
  }

  public void getEstudantes(){
    for (int i = 0; i < numEstTotal; i++) {
      estudantes[i].print();
    }
  }

}
