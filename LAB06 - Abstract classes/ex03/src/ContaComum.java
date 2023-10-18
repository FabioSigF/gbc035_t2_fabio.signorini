public class ContaComum extends ContaCorrente{

  private float limite;
  public ContaComum(float val, int num, int pwd){
    super(val, num, pwd);
    limite = 0;
  }

  public ContaComum transformaParaContaComum(ContaEspecial contaEspecial){
    return new ContaComum(contaEspecial.saldo, contaEspecial.numConta, contaEspecial.senha);
  }
}
