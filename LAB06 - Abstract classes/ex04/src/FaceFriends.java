import java.util.Scanner;

public class FaceFriends {
  Contato contatos[] = new Contato[100];
  int contatosContador = 0;

  private void inserirFamilia(Familia contato) {

    contatos[contatosContador] = new Familia(contato.apelido, contato.nome, contato.email,
            contato.aniversario, contato.getParentesco());
  }

  private void inserirAmigo(Amigo contato) {

    contatos[contatosContador] = new Amigo(contato.apelido, contato.nome, contato.email,
            contato.aniversario, contato.getGrauDeAmizade());
  }

  private void inserirTrabalho(Trabalho contato) {

    contatos[contatosContador] = new Trabalho(contato.apelido, contato.nome, contato.email,
            contato.aniversario, contato.getTipo());
  }

  public void inserirContato(Contato contato, int tipo) {
    //TIPO: 1 = FAMILIA, 2 = AMIGO, 3 = TRABALHO
    switch (tipo) {
      case 1:
        inserirFamilia((Familia) contato);
        contatosContador++;
        break;
      case 2:
        inserirAmigo((Amigo) contato);
        contatosContador++;
        break;
      case 3:
        inserirTrabalho((Trabalho) contato);
        contatosContador++;
        break;
      default:
        System.out.println("Opção inválida. Encerrando...");
        break;
    }
  }

  public void mostrarContatos() {
    for (int i = 0; i < contatosContador; i++) {
      contatos[i].imprimirContato();
    }
  }

  public static void main(String[] args) {
    FaceFriends aplicativo = new FaceFriends();

    Familia irmaoFelipe = new Familia("Lipe", "Felipe", "felipe@gmail", "27/06/2001", "Irmão");
    Familia irmaIsabella = new Familia("Belinha", "Isabella", "isa@gmail", "23/04/2010", "Irmã");
    Amigo amigoHenrique = new Amigo("Henro", "Henrique", "h@gmail", "13/11/2000", 1);
    Trabalho colegaVagner = new Trabalho("Vaguin", "Vagner", "v@gmail", "10/10/1999", "Colega");

    aplicativo.inserirContato(irmaIsabella, 1);
    aplicativo.inserirContato(irmaoFelipe, 1);
    aplicativo.inserirContato(amigoHenrique, 2);
    aplicativo.inserirContato(colegaVagner, 3);
    aplicativo.mostrarContatos();

  }
}
