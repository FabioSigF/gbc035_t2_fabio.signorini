public class FigurinhaExtra extends Figurinha{
  private String categoria, cor;
  private Figurinha figurinha;

  public FigurinhaExtra(String nome, String data_nascimento, String posicao, String pais, Float peso, Float altura, String categoria, String cor) {
    super(nome, data_nascimento, posicao, pais, peso, altura);
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
    super.mostrarFigurinha();
    System.out.println("Categoria: " + categoria + "\nCor: " + cor);
  }
}
