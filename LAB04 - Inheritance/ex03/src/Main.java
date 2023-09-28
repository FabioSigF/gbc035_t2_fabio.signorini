public class Main {
  public static void main(String[] args) {
    Figurinha jogadorUm = new Figurinha(
            "Vinícius Júnior",
            "1992-02-05",
            "Atacante",
            "Brasil",
            68.0f,
            1.75f);
    FigurinhaExtra jogadorDois = new FigurinhaExtra(
            "Vinícius Júnior",
            "1992-02-05",
            "Atacante",
            "Brasil",
            68.0f,
            1.75f,
            "Legend",
            "Ouro");

    jogadorUm.mostrarFigurinha();
    jogadorDois.mostrarFigurinha();
  }
}