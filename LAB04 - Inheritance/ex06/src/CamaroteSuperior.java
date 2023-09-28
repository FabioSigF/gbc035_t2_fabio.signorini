public class CamaroteSuperior extends VIP {
  private String localizacao;
  private Double valorAdicional = 5.5;
  public CamaroteSuperior(){
    super();
    localizacao = "";
  }

  public CamaroteSuperior(Double valor, String localizacao) {
    super(valor);
    this.valor = valor + valorAdicional;
    this.localizacao = localizacao;
  }

  public Double getValor(){
    return valor;
  }
}
