public class Main {

  public static void main(String[] args) {

    Estudante e = new Estudante("Carlos","Rua 1o de Abril");

    EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
    EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
            "Banco de Dados");
    EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
            "Vacinas de RNA", "academico","Anticorpos");
    EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
            "Tecnologia","Processamento de Imagens","Carros Inteligentes");


    Universidade ufu = new Universidade("Universidade Federal de Uberlândia","14/08/1969");
    ufu.matricularEstudante(e);
    ufu.matricularEstudante(eg);
    ufu.matricularEstudante(ep);
    ufu.matricularEstudante(epm);
    ufu.matricularEstudante(epd);

    ufu.getEstudantes();
    ufu.getNumEstudantes();
    /*(e) Referente ao exercício anterior, é possível utilizar o recém criado método print(boolean)
    em um polimorfismo tendo como base um vetor da classe Estudante? Justifique. Caso não seja
    possível, altere somente o código da classe Estudante para que passe a ser possível.
    O que ocorre neste caso com a classe Estudante de Pós-gradução?
    R= Não é possível, pois o método print(boolean) foi criado em uma classe filha de Estudante.
    Para que seja possível, a classe Estudante teria que ter um método print(boolean) e os outros
     métodos a sobrescrevessem.
     */
  }
}