public class CamaroteInferior extends VIP{
  private String localizacao;

  public CamaroteInferior(){
    super();
    localizacao = "";
  }

  public CamaroteInferior(Double valor, String localizacao) {
    super(valor);
    this.localizacao = localizacao;
  }
}
