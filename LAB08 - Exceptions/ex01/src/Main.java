public class Main {
  public static void main(String[] args) {

    Funcionario f = new Funcionario("Fábio", "25836900000", 20000d);
    f.aumentarSalario(200);
  }
}


//EX2
// A) Qual a diferença entre o throw e throws ? Justifique explicado o que cada comando faz.
// O throws deve ser inserido na assinatura de todos os métodos que podem retornar uma exception
// validada. No caso do aumentarSalario, é verificado a questão do salário que, caso seja
// incorreto, retorna uma IllegalArgumentException. Assim, que chama o método é notificado que
// essa função pode retornar uma exception.
// O throw é o lançamento da exception na prática.

// B) Indique a diferença entre checked e uncheked exceptions.
// As checked exceptions são aquelas que você é obrigado a tratar. As unchecked
// exceptions não exigem tratamento obrigatório. Portanto, quando sabemos que um erro no
// programa pode ser tratado, devemos usar Checked Exceptions.