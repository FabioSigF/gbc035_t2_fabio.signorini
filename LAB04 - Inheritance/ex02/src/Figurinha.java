public class Figurinha {
  protected String nome, posicao, pais, data_nascimento;
  protected float peso, altura;

  public Figurinha(){
    nome = "";
    data_nascimento = "0000-00-00";
    posicao = "";
    pais = "";
    peso = 0.0f;
    altura = 0.0f;
  }

  public Figurinha(String nome, String data_nascimento, String posicao, String pais, Float peso, Float altura) {
    this.nome = nome;
    this.data_nascimento = data_nascimento;
    this.posicao = posicao;
    this.pais = pais;
    this.peso = peso;
    this.altura = altura;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setPosicao(String posicao){
    this.posicao = posicao;
  }

  public void setDataNascimento(String data_nascimento){
    this.data_nascimento = data_nascimento;

  }

  public void setPais(String pais){
    this.pais = pais;
  }

  public void setPeso(Float peso){
    this.peso = peso;
  }

  public void setAltura(Float altura){
    this.altura = altura;
  }

  public void mostrarFigurinha(){
    System.out.println("===== JODAGOR =====\nNome: " + nome + "\nData de nascimento: " + data_nascimento + "\nPosição: " + posicao + "\nPais: " + pais + "\nAltura: " + peso + "\nAltura: " + altura);
  }
}