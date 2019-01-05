package Exercise1;

public class TesteException {

    public static void main(String[] args) {
        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
    }

    static void metodo1() {
        System.out.println("Início do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    static void metodo2() {
        System.out.println("Início método 2");

        int[] vetor = new int[10];
        try {
            for (int i = 1; i <= 15; i++) {
                vetor[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("O Array atingiu sua capacidade máxima");

        }

        System.out.println("Fim do método 2");
    }
}
