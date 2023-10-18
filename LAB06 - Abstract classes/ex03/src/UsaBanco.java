public class UsaBanco {

  public static void main(String[] args) {
    ContaEspecial ce = new ContaEspecial(0, 123, 1234, 70000);
    ce.debitaValor(800);
    System.out.println(ce.getSaldo(1234));

    ContaComum cc = new ContaComum(500, 124, 123);
    cc.creditaValor(123,500);
    System.out.println(cc.getSaldo(123));
  }

}
