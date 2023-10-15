public class Tetraedro extends FormaTridimensional{
  private Double aresta;

  public Tetraedro(){
    aresta = 0d;
  }
  public Tetraedro(Double aresta){
    this.aresta = aresta;
  }

  @Override
  public Double obterArea(){
    return Math.sqrt(3) * (aresta * aresta);
  }
  @Override
  public Double obterVolume(){
    return ((aresta * aresta * aresta) * Math.sqrt(2)) / 12;
  }
  @Override
  public String descricao(){
    return "Esse é o Tetraedro. Ele é uma forma tridimensional";
  }
}
