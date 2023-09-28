public class C2 extends C1{
  public String cidade;
  protected String estado;
  private String pais;

  public C2(){
    super();
    cidade = "";
    estado = "";
    pais = "";
    System.out.println("Classe C2: chamada do construtor padrao, sem parâmetros parametros");
  }

  public C2(String nome, int idade, String matricula, String cidade, String estado, String pais) {
    super(nome, idade, matricula);
    this.cidade = cidade;
    this.estado = estado;
    this.pais = pais;
    System.out.println("Classe C2: chamada do construtor padrao, com parâmetros parametros");
  }

  public void mostrar_atributos() {
    System.out.printf("\nCidade: %s\nEstado: %s\nPais: %s", cidade, estado, pais);
  }

  public void mostrar_atributos_super() {
    super.mostrar_atributos();
    mostrar_atributos();
  }
}
