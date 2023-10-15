public class Triangulo extends FormaBidimensional{
  private Double base, altura;

  public Triangulo(){
    base = 0d;
    altura = 0d;
  }
  public Triangulo(Double base, Double altura){
    this.base = base;
    this.altura = altura;
  }

  @Override
  public Double obterArea(){
    return (base*altura)/2;
  }
  @Override
  public String descricao(){
    return "Esse é o Triângulo. Ele é uma forma bidimensional.";
  }
}
