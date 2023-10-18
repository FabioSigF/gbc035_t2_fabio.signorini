public class Familia extends Contato{
  private String parentesco;

  public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
    super(apelido, nome, email, aniversario);
    this.parentesco = parentesco;
  }
  @Override
  public void imprimirContato() {
    System.out.println(super.imprimirBasico() + "Parentesco: " + parentesco);
  }

  public String getParentesco(){
    return parentesco;
  }

  public void setParentesco(String parentesco){
    this.parentesco = parentesco;
  }
}
