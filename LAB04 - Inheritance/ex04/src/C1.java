public class C1 {
  public String nome;
  protected int idade;
  private String matricula;

  public C1() {
    nome = "";
    idade = 0;
    matricula = "";
    System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
  }

  public C1(String nome, int idade, String matricula) {
    this.nome = nome;
    this.idade = idade;
    this.matricula = matricula;
    System.out.println("Classe C1: chamada do construtor padrao, com parâmetros parametros");
  }

  public void mostrar_atributos(){
    System.out.printf("\nNome: %s\nIdade: %d\nMatrícula: %s", nome, idade, matricula);
  }
  public void mostrar_atributos_super() {
    mostrar_atributos();
  }
}
