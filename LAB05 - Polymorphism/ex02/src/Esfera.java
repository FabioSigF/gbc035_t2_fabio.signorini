public class Esfera extends FormaTridimensional{
  private Double raio;

  public Esfera(){
    raio = 0d;
  }
  public Esfera(Double raio){
    this.raio = raio;
  }

  @Override
  public Double obterArea(){
    return 4 * Math.PI * (raio * raio);
  }
  @Override
  public Double obterVolume(){
    return (4.0/3.0)* Math.PI * (raio * raio * raio);
  }
  @Override
  public String descricao(){
    return "Esse é a Esfera. Ela é uma forma tridimensional";
  }
}
