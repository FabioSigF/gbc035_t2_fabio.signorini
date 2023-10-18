public class Amigo extends Contato{

  private int grauDeAmizade; //1 = melhor amigo, 2 = amigo, 3 = conhecido

  public Amigo(String apelido, String nome, String email, String aniversario, int grauDeAmizade) {
    super(apelido, nome, email, aniversario);
    this.grauDeAmizade = grauDeAmizade;
  }

  public boolean setGrauDeAmizade(int grauDeAmizade){
    if(grauDeAmizade > 0 && grauDeAmizade < 4){
      this.grauDeAmizade = grauDeAmizade;
      return true;
    }
    return false;
  }

  public int getGrauDeAmizade(){
    return grauDeAmizade;
  }

  @Override
  public void imprimirContato() {
    System.out.println(super.imprimirBasico() + "Grau de amizade: " + grauDeAmizade);
  }
}
