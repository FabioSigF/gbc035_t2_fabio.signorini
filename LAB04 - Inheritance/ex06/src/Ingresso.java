public class Ingresso {
  protected Double valor;

  public Ingresso(){
    valor = 0.0;
  }
  public Ingresso(Double valor) {
    this.valor = valor;
  }
  public void escreveValor(){
    System.out.println(valor);
  }
}
