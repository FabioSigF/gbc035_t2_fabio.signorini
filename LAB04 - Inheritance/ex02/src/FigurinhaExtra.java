public class FigurinhaExtra extends Figurinha{
  private String categoria, cor;

  public FigurinhaExtra(){
    super.nome = "";
    super.data_nascimento = "0000-00-00";
    super.posicao = "";
    super.pais = "";
    super.peso = 0.0f;
    super.altura = 0.0f;
    categoria = "";
    cor = "";
  }

  public FigurinhaExtra(String nome, String data_nascimento, String posicao, String pais,
                        Float peso, Float altura, String categoria, String cor) {
    super.nome = nome;
    super.data_nascimento = data_nascimento;
    super.posicao = posicao;
    super.pais = pais;
    super.peso = peso;
    super.altura = altura;
    this.categoria = categoria;
    this.cor = cor;
  }


  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria){
    switch (categoria.trim().toLowerCase()) {
      case "legend":
        this.categoria = "Legend";
        break;
      case "rookie":
        this.categoria = "Rookie";
        break;
      default:
        System.out.println("Categoria inválida. As categorias válidas são: Legend " +
                "ou Rookie");
        break;
    }
  }
  public String getCor() {
    return cor;
  }
  public void setCor(String cor){
    switch (cor.trim().toLowerCase()) {
      case "bordô":
        this.cor = "Bordô";
        break;
      case "bronze":
        this.cor = "Bronze";
        break;
      case "prata":
        this.cor = "Prata";
        break;
      case "ouro":
        this.cor = "Ouro";
        break;
      default:
        System.out.println("Cor inválida. As cores válidas são: Bordô, Bronze, Prata, Ouro");
        break;
    }
  }
  public void mostrarFigurinha(){
    System.out.println("===== JODAGOR =====\nNome: " + nome + "\nData de nascimento: " + data_nascimento + "\nPosição: " + posicao + "\nPais: " + pais + "\nAltura: " + peso + "\nAltura: " + altura + "\nCategoria: " + categoria + "\nCor: " + cor
    );
  }
}
