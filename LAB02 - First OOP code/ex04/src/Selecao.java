public class Selecao {
  private Figurinha[] jogadores = new Figurinha[11];
  private String tecnico, nome;

  public Selecao(){
    jogadores = null;
    nome = "";
    tecnico = "";
  }
  public Selecao(String nome, String tecnico, Figurinha[] jogadores){
    this.jogadores = jogadores;
    this.nome = nome;
    this.tecnico = tecnico;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setTecnico(String tecnico) {
    this.tecnico = tecnico;
  }

  public void setJogadores(Figurinha[] jogadores) {
    this.jogadores = jogadores;
  }
  public void mostrarSelecao() {
    System.out.println("======== SELEÇÃO " + nome + " ========");
    System.out.println("Técnico: " + tecnico);
    System.out.println("======== JOGADORES ========");
    for (Figurinha jogador :
            jogadores) {
      jogador.mostrarFigurinha();
    }
  }

}
