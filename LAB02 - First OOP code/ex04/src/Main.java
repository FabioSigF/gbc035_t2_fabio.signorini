public class Main {
  public static void main(String[] args) {
    Figurinha jogadoresBrasil[] = new Figurinha[11];

    jogadoresBrasil[0] = new Figurinha(
            "Ederson",
            "1992-02-05",
            "Goleiro",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[1] = new Figurinha(
            "Danilo",
            "1992-02-05",
            "Lateral",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[2] = new Figurinha(
            "Éder Militão",
            "1992-02-05",
            "Zagueiro",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[3] = new Figurinha(
            "Marquinhos",
            "1992-02-05",
            "Zagueiro",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[4] = new Figurinha(
            "Ayrton",
            "1992-02-05",
            "Lateral",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[5] = new Figurinha(
            "Joelinton",
            "1992-02-05",
            "Meio-campo",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[6] = new Figurinha(
            "Bruno Guimarães",
            "1992-02-05",
            "Meio-campo",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[7] = new Figurinha(
            "Lucas Paquetá",
            "1992-02-05",
            "Meio-campo",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[8] = new Figurinha(
            "Neymar Jr.",
            "1992-02-05",
            "Atacante",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[9] = new Figurinha(
            "Richarlison",
            "1992-02-05",
            "Atacante",
            "Brasil",
            68.0f,
            1.75f);
    jogadoresBrasil[10] = new Figurinha(
            "Vinícius Júnior",
            "1992-02-05",
            "Atacante",
            "Brasil",
            68.0f,
            1.75f);

    Selecao brasil = new Selecao("Brasil", "Fernando Diniz", jogadoresBrasil);

    //Instância França
    Figurinha jogadoresFranca[] = new Figurinha[11];

    jogadoresFranca[0] = new Figurinha(
            "Maignan",
            "1992-02-05",
            "Goleiro",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[1] = new Figurinha(
            "Koundé",
            "1992-02-05",
            "Lateral",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[2] = new Figurinha(
            "Konaté",
            "1992-02-05",
            "Zagueiro",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[3] = new Figurinha(
            "Upamecano",
            "1992-02-05",
            "Zagueiro",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[4] = new Figurinha(
            "Hernandéz",
            "1992-02-05",
            "Lateral",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[5] = new Figurinha(
            "Tchouaméni",
            "1992-02-05",
            "Meio-campo",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[6] = new Figurinha(
            "Camavinga",
            "1992-02-05",
            "Meio-campo",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[7] = new Figurinha(
            "Coman",
            "1992-02-05",
            "Atacante",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[8] = new Figurinha(
            "Griezman",
            "1992-02-05",
            "Atacante",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[9] = new Figurinha(
            "Mbappé",
            "1992-02-05",
            "Atacante",
            "França",
            68.0f,
            1.75f);
    jogadoresFranca[10] = new Figurinha(
            "Kolo",
            "1992-02-05",
            "Atacante",
            "França",
            68.0f,
            1.75f);

    Selecao franca = new Selecao("França", "Didier Deschamps", jogadoresFranca);

    brasil.mostrarSelecao();
    franca.mostrarSelecao();
  }
}