import java.util.Scanner;

public class Main {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);

        int vet[] = new int[6];

        for (int i = 0; i < 6; i++){
            System.out.print("Digite o " + i +"º número: ");
            vet[i] = sc.nextInt();
        }

        System.out.print("Vetor: [");

        for (int j = 5; j >= 0; j--){
            System.out.print(" " + vet[j]);
        }

        System.out.println(" ]");
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[6];
        int i = 0;

        do {
            System.out.print("Digite o " + (i+1) +"º número par: ");
            vet[i] = sc.nextInt();

            if(vet[i] % 2 == 0) {
                i++;
            } else {
                System.out.println("Número invalido. Tente novamente.");
            }
        } while(i < 6);

        System.out.println("Os valores lidos são: ");
        for (int j = 0; j < 6; j++){
            System.out.printf("%d ",vet[j]);
        }
    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[5];
        int maior = 0, menor = 0, media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "ª número:");
            vet[i] = sc.nextInt();

            if(i == 0) {
                maior = vet[i];
                menor = vet[i];
            }
        }

        System.out.print("Os números digitados foram: ");
        for(Integer num: vet) {
            System.out.print(num + " ");
            media += num;
            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
        }
        media /= 5;
        System.out.println("\nO maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
        System.out.print("A média foi: " + media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[5], maior[] = new int[2], menor[] = new int[2];
        int media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor da posição" + (i) + ": ");
            vet[i] = sc.nextInt();

            if(i == 0) {
                maior[0] = vet[i];
                maior[1] = i;
                menor[0] = vet[i];
                menor[1] = i;
            }
        }

        System.out.print("Os números digitados foram: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(vet[i] + " ");
            media += vet[i];
            if(vet[i] > maior[0]){
                maior[0] = vet[i];
                maior[1] = i;
            }
            if(vet[i] < menor[0]){
                menor[0] = vet[i];
                menor[1] = i;
            }
        }
        media /= 5;
        System.out.println("\nO maior número digitado foi: " + maior[0] + ", localizado na posição " + maior[1]);
        System.out.println("O menor número digitado foi: " + menor[0] + ", localizado na posição " + menor[1]);
        System.out.print("A média foi: " + media);
    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        float vet[] = new float[5];
        float proporcao = 0, maior = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "ª número:");
            vet[i] = sc.nextFloat();

            if(i == 0 || vet[i] > maior) {
                maior = vet[i];
            }
        }
        //Normalização
        proporcao = 100/maior;

        System.out.println("Notas normalizadas: ");
        for(int i = 0; i < 5; i++){
            vet[i] *= proporcao;
            System.out.println("Nota do aluno " + (i+1) + ": " + vet[i]);
        }
    }

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        float vet[] = new float[5], media = 0;
        double desvio = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "ª número:");
            vet[i] = sc.nextFloat();
            media += vet[i];
        }
        media /= 5;

        for (Float num :
                vet) {
            desvio += Math.pow(num-media, 2);
        }
        desvio /= 4;
        desvio = Math.sqrt(desvio);

        System.out.print("A média é " + media + " e o desvio-padrão é " + desvio);
    }

    public static void ex09(){
        
    }
    public static void main(String[] args) {
        // ex01();
        // ex02();
        // ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        ex08();
    }


}