import java.util.Random;

public class Luta {
  private Lutador lut[] = new Lutador[2];
  private int ganhador, perdedor, aprovada, decisaoDaLuta;
  public Luta (Lutador lutador1, Lutador lutador2) {
      lut[0] = lutador1;
      lut[1] = lutador2;
      aprovada = 1;
      resultado();
  }

  public void marcarLuta(){
    if((!lut[0].getNome().equals(lut[1].getNome())) && (lut[0].getCategoria().equals(lut[1].getCategoria()))) {
      aprovada = 0;
      System.out.println("A luta entre " + lut[0].getNome() + " e " + lut[1].getNome() + " está " +
              "marcada!");
    } else {
      System.out.println("Luta inválida!");
      aprovada = 1;
    }
  }

  public void lutar() {
    if(aprovada == 0) {
      apresentarLuta();
    } else {
      System.out.println("A luta ainda não foi marcada.");
    }
  }

  private void apresentarLuta(){
    System.out.println("Senhoras e senhores, sejam muito bem vindos à luta da noite!!!\nDe um " +
            "lado, temos... " + lut[0].getNome().toUpperCase() + "!\nDo outro lado, temos... " +
            lut[1].getNome().toUpperCase() + "!\nSem dúvidas, será um espetáculo que nos " +
            "lembraremos por anos, essa luta promete tudo!\n\nDetalhes de cada lutador: ");
    lut[0].perfil();
    lut[1].perfil();
    System.out.println("Os lutadores já estão no ringue e a luta vai começear!\n...3\n...2\n.." +
            ".1\nQUE COMEÇE A LUTA!\n\n");
    System.out.println(lut[0].getNome() + " começa com tudo e já acerta o adversário no rosto com" +
            " um cruzado de direita.\nPorém, " + lut[1].getNome() + " não deixa barato e revida " +
            "com um chute alto... UFA! Ainda bem que não pegou em cheio, se não era chão para " + lut[0].getNome());
    System.out.println("...\nA luta está alucinante, já estamos no último round e parece que os " +
            "dois lutadores estão muito cansados. A qualquer momento, a qualquer erro, o " +
            "resultado pode ser definido!");
    if(decisaoDaLuta != 2) {
      System.out.println("Minha nossa senhora, o " + lut[ganhador].getNome() + " levanta a perna e " +
            "acerta um chute reto no queixo do " + lut[perdedor].getNome() + ", que vai ao chão!!" +
            " Acabou!!!\n" + lut[ganhador].getNome().toUpperCase() + " é campeão da luta!"
      );
    } else {
      System.out.println("O sino toca e a luta está encerrada! Os dois lutadores foram " +
              "sensacionais!\nComo decisão dos juízes, a luta termina em EMPATE!");
    }
  }

  private void resultado() {
    Random gerador = new Random();
    int  num = gerador.nextInt(4);

    switch (num) {
      case 1:
        decisaoDaLuta = 0;
        ganhador = 0;
        perdedor = 1;
        break;
      case 2:
        decisaoDaLuta = 1;
        ganhador = 1;
        perdedor = 0;
        break;
      case 3:
        decisaoDaLuta = 2;
        ganhador = -1;
        perdedor = -1;
        break;
      default:
        break;
    }
  }
}
