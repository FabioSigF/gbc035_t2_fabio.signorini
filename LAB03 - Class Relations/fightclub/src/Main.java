public class Main {
  public static void main(String[] args) {
    Lutador lut[] = new Lutador[2];

    lut[0] = new Lutador(
            "Charles do Bronx",
            "Brasileiro",
            33,
            1.78f,
            69.0f,
            1.88f,
            34,
            9,
            0);

    lut[1] = new Lutador(
            "Islam Makhachev",
            "Russo",
            31,
            1.78f,
            70f,
            1.79f,
            24,
            1,
            0);

    Luta CharlesXMakhachev = new Luta(lut[0], lut[1]);
    CharlesXMakhachev.marcarLuta();
    CharlesXMakhachev.lutar();
  }
}