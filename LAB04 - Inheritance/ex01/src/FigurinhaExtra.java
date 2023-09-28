public class FigurinhaExtra {
  private String nome, posicao, pais, data_nascimento, categoria, cor;
  private float peso, altura;

  public FigurinhaExtra(){
    nome = "";
    data_nascimento = "0000-00-00";
    posicao = "";
    pais = "";
    peso = 0.0f;
    altura = 0.0f;
    categoria = "";
    cor = "";
  }

  public FigurinhaExtra(String nome, String data_nascimento, String posicao, String pais,
                        Float peso, Float altura, String categoria, String cor) {
    this.nome = nome;
    this.data_nascimento = data_nascimento;
    this.posicao = posicao;
    this.pais = pais;
    this.peso = peso;
    this.altura = altura;
    this.categoria = categoria;
    this.cor = cor;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public String getPosicao(){
    return posicao;
  }
  public void setPosicao(String posicao){
    this.posicao = posicao;
  }

  public String getDataNascimento(){
    return data_nascimento;
  }
  public void setDataNascimento(String data_nascimento){
    this.data_nascimento = data_nascimento;

  }

  public String getPais(){
    return pais;
  }
  public void setPais(String pais){
    this.pais = pais;
  }

  public Float getPeso(){
    return  peso;
  }
  public void setPeso(Float peso){
    this.peso = peso;
  }

  public Float getAltura(){
    return altura;
  }
  public void setAltura(Float altura){
    this.altura = altura;
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
