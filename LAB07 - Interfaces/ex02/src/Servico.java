public class Servico implements Classificavel{
    private float preco;

    public Servico(float preco) {
        this.preco = preco;
    }
    public int eMenorQue(Classificavel obj){
        Servico servico = (Servico) obj;
        if(this.preco < servico.preco) return 0;
        else return -1;
    }

    public static void ordenarServicos(Servico[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j].preco > vetor[j + 1].preco) {
                    Servico temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void mostrarServicos(Servico[] vetor) {
        for (Servico servico: vetor) {
            System.out.println( "Preço do Serviço: " + servico.preco);
        }
    }
}
