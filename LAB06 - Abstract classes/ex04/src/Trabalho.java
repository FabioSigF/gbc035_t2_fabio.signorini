public class Trabalho extends Contato{
  protected String tipo;

  public Trabalho(String apelido, String nome, String email, String aniversario, String tipo){
    super(apelido, nome, email, aniversario);
    this.tipo = tipo;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTipo(){
    return tipo;
  }
  @Override
  public void imprimirContato() {
    System.out.println(super.imprimirBasico() + "Tipo: " + tipo);
  }
}
