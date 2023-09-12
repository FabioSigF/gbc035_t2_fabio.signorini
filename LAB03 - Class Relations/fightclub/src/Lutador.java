public class Lutador {
  private Float altura, peso, alcance;
  private int idade, vitorias, derrotas, empates;
  private String nome, nacionalidade, categoria;

  public Lutador(String nome, String nacionalidade, int idade, Float altura, Float peso,
                 Float alcance, int vitorias, int derrotas, int empates) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    this.alcance = alcance;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
    categoria = setCategoria();
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }
  public int getIdade(){
    return idade;
  }
  public void setIdade(int idade){
    this.idade = idade;
  }
  public Float getAltura() {
    return altura;
  }
  public Float getPeso() {
    return peso;
  }
  public void setPeso(Float peso){
    this.peso = peso;
  }
  public String getCategoria() {
    return categoria;
  }
  public int getVitorias(){
    return vitorias;
  }
  public void setVitorias(int vitorias){
    this.vitorias = vitorias;
  }
  public int getEmpates(){
    return empates;
  }
  public void setEmpates(int empates){
    this.empates = empates;
  }
  public int getDerrotas(){
    return derrotas;
  }
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }
  public Float getAlcance(){
    return alcance;
  }
  private String setCategoria() {
    if(peso < 52.1) {
      return "Sem Categoria";
    } else if (peso <= 70.3) {
      return "Pesos Leves";
    } else if (peso <= 83.9) {
      return "Pesos Médios";
    } else if (peso <= 120.2 ) {
      return "Pesos Pesados";
    } else {
      return "Sem Categoria";
    }
  }

  public void perfil(){
    System.out.printf(
                    "===========================\n"+
                    "Nome: %s\nIdade: %d\nNacionalidade: %s\nCategoria: " +
                    "%s\nAltura: %.2fm\nPeso: " +
                    "%.1fkg\nAlcance: %.2fm\nVitorias: %d\nEmpates: %d\nDerrotas: %d\n" +
                    "===========================\n", nome,
            idade,
            nacionalidade,
            categoria,
            altura,
            peso,
            alcance,
            vitorias, empates, derrotas);
  }
}
