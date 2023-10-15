public class Quadrado extends FormaBidimensional{
  private Double lado;

  public Quadrado(){
    lado = 0d;
  }
  public Quadrado(Double lado){
    this.lado = lado;
  }

  @Override
  public Double obterArea(){
    return lado*lado;
  }
  @Override
  public String descricao() {
    return "Esse é o Quadrado, uma forma bidimensional.";
  }
}
