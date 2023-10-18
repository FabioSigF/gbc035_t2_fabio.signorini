abstract class Contato {
  protected String apelido, nome, email, aniversario;

  public Contato(String apelido, String nome, String email, String aniversario) {
    this.apelido = apelido;
    this.nome = nome;
    this.email = email;
    this.aniversario = aniversario;
  }
  public String imprimirBasico(){
    return ("Nome: " + nome + "\nApelido: " + apelido + "\nEmail: " + email + "\nAniversário: " + aniversario + "\n");
  }
  public abstract void imprimirContato();
}
