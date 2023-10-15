public class Circulo extends FormaBidimensional{
  private Double raio;
  public Circulo(){
    raio = 0d;
  }
  public Circulo(Double raio){
    this.raio = raio;
  }
  @Override
  public Double obterArea(){
    return Math.PI * (raio * raio);
  }
  @Override
  public String descricao(){
    return "Esse é o Círculo, uma forma bidimensional.";
  }
}
