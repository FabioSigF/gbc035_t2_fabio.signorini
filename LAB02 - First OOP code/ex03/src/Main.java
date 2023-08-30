public class Main {
  public static void main(String[] args) {
    Figurinha vet[]= new Figurinha[3];

    vet[0] = new Figurinha(
            "Cristiano Ronaldo",
            "1985-02-05",
            "Atacante",
            "Portugal",
            83.0f,
            1.87f);

    vet[1] = new Figurinha(
            "Neymar Jr.",
            "1992-02-05",
            "Atacante",
            "Brasil",
            68.0f,
            1.75f);

    vet[2] = new Figurinha(
            "Lionel Messi",
            "1987-06-24",
            "Atacante",
            "Argentina",
            72.0f,
            1.7f);


    for(int i = 0; i < 3; i++){
      vet[i].mostrarFigurinha();
    }
  }
}