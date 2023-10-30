public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    public boolean eMenorQue(Classificavel obj){
        Cliente cliente = (Cliente) obj;
        if(this.nome.length() < cliente.nome.length()) return true;
        else return false;
    }

    public static void ordenarClientes(Cliente[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j].nome.length() > vetor[j + 1].nome.length()) {
                    Cliente temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void mostrarClientes(Cliente[] vetor) {
        for (Cliente cliente: vetor) {
            System.out.println( "Nome do Cliente: " + cliente.nome);
        }
    }
}
