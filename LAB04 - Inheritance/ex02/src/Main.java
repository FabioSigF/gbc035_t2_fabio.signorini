public class Main {
  public static void main(String[] args) {
    FigurinhaExtra jogadorUm = new FigurinhaExtra(
            "Neymar Jr.",
            "1992-02-05",
            "Atacante",
            "Brasil",
            68.0f,
            1.75f,
            "Legend",
            "Ouro");
    Figurinha jogadorDois = new Figurinha(
            "Vinícius Júnior",
            "1992-02-05",
            "Atacante",
            "Brasil",
            68.0f,
            1.75f);

    jogadorUm.mostrarFigurinha();
    jogadorDois.mostrarFigurinha();
  }
}