public class VIP extends Ingresso{

  private Double adicional = 5.5;
  public VIP(){
    super();
  }

  public VIP(Double valor){
    super(valor);
    this.valor = valor + adicional;
  }

  public Double getValor(){
    return valor;
  }
}
