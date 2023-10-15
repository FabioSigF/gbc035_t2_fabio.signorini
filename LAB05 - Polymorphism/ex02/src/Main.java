public class Main {
  public static void main(String[] args) {
    Forma[] formas = {
            new Circulo(4d),
            new Quadrado(4.5),
            new Triangulo(4d, 8d),
            new Esfera(2.8),
            new Cubo(6.5),
            new Tetraedro(4d)
    };

    for (Forma forma : formas) {
      System.out.println("==================================");
      System.out.println(forma.descricao());
      if (forma instanceof FormaBidimensional) {
        System.out.println("Área: " + ((FormaBidimensional) forma).obterArea());
      } else if (forma instanceof FormaTridimensional) {
        System.out.println("Área: " + ((FormaTridimensional) forma).obterArea());
        System.out.println("Volume: " + ((FormaTridimensional) forma).obterVolume());
      }
    }
  }
}