public class Figurinha {
    public String nome, posicao, pais, data_nascimento;
    public float peso, altura;

    public Figurinha(){
        nome = "";
        data_nascimento = "0000-00-00";
        posicao = "";
        pais = "";
        peso = 0.0f;
        altura = 0.0f;
    }

    public Figurinha(String nome, String data_nascimento, String posicao, String pais, Float peso, Float altura) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.posicao = posicao;
        this.pais = pais;
        this.peso = peso;
        this.altura = altura;
    }
}
