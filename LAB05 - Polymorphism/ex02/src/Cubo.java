public class Cubo extends FormaTridimensional{
  private Double lado;
  public Cubo(){
    lado = 0d;
  }
  public Cubo(Double lado){
    this.lado = lado;
  }

  @Override
  public Double obterArea() {
    return 6 * (lado*lado);
  }
  @Override
  public Double obterVolume(){
    return (lado*lado*lado);
  }
  @Override
  public String descricao(){
    return "Esse é o Cubo. Ele é uma forma tridimensional.";
  }
}
