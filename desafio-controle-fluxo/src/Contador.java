import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o parametro um: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o parametro dois: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("O parametro um é maior que o parametro dois.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int saida = 1;
        for(int i = parametroUm; i <= parametroDois; i++){
            System.out.println(saida++);
        }
    }
}
