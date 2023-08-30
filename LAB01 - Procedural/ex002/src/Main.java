import java.util.Scanner;

public class Main {

    public static float altera_preco(Float preco, Float porcentagem){
        float temp;
        float res;
        if (porcentagem > -100) {
            temp = 1 + porcentagem/100;
            res = preco*temp;
            return res;
        } else {
            return preco;
        }
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome[] = new String[4];
        float preco[] = new float[4];
        int qtd_estoque[] = new int[4];

        for (int i = 0; i < 4; i++)
        {
            System.out.printf("========= PRODUTO %d =========\n", (i+1));
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Preço: ");
            preco[i] = sc.nextFloat();
            System.out.print("Quantidade: ");
            qtd_estoque[i] = sc.nextInt();
            clearBuffer(sc);
        }

        System.out.println("\nAumentando o preco em 10%% do produto 1 e 3...");
        preco[0] = altera_preco(preco[0], -110f);
        preco[2] = altera_preco(preco[2],10f);

        System.out.println("Reduzindo o preco em 5%% do produto 2...");
        if (preco[1] == altera_preco(preco[1],-5f))
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");
        else {
            preco[1] = altera_preco(preco[1],-5f);
            System.out.println("Preco alterado com sucesso");
        }

        System.out.println("\nAlterando o preço do produto 3...");
        if (preco[3] == altera_preco(preco[3], -110f))
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");
        else {
            preco[3] = altera_preco(preco[3],-110f);
            System.out.println("Preco alterado com sucesso");
        }

        System.out.println("========= Produtos Cadastrados =========");
        for (int i = 0; i < 4; i++){
            System.out.printf("\nProduto: %s\nPreco: %.2f\nEstoque: %d\n", nome[i],preco[i],qtd_estoque[i]);
        }
    }
}