public class C3 extends C2{
  public String data_nascimento;
  protected String nome_mae;
  private String nome_pai;

  public C3(){
    super();
    data_nascimento = "";
    nome_mae = "";
    nome_pai = "";
    System.out.println("Classe C3: chamada do construtor padrao, sem parâmetros parametros");
  }

  public C3(String nome, int idade, String matricula, String cidade, String estado, String pais,
            String data_nascimento, String nome_mae, String nome_pai) {
    super(nome, idade, matricula, cidade, estado, pais);
    this.data_nascimento = data_nascimento;
    this.nome_mae = nome_mae;
    this.nome_pai = nome_pai;
    System.out.println("Classe C3: chamada do construtor padrao, com parâmetros parametros");
  }

  public void mostrar_atributos() {
    System.out.printf("\nData Nascimento: %s\nNome Mae: %s\nNome Pai: %s", data_nascimento,
            nome_mae, nome_pai);
  }

  public void mostrar_atributos_super() {
    super.mostrar_atributos_super();
    super.mostrar_atributos();
  }
}
