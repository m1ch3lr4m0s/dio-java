import java.util.Scanner;

interface calculadora{
    public int somar(int a, int b);
    public int subtrair(int a, int b);
    public int multiplicar(int a, int b);
    public int dividir(int a, int b);
}
public class App {
    public static void main(String[] args) throws Exception {
        boolean end = false;
        Scanner scanner = new Scanner(System.in);

        // Calculadora
        calculadora calc = new calculadora(){
            @Override
            public int somar(int a, int b){
                return a + b;
            }
            @Override
            public int subtrair(int a, int b){
                return a - b;
            }
            @Override
            public int multiplicar(int a, int b){
                return a * b;
            }
            @Override
            public int dividir(int a, int b){
                return a / b;
            }
        };

        do{
            int operacao = 0;
            System.out.println("Informe a operação desejada: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            operacao = scanner.nextInt();
            System.out.println("Informe o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.println("Informe o segundo número: ");
            int num2 = scanner.nextInt();
            switch(operacao){
                case 1:
                    System.out.println("O resultado da soma é: " + calc.somar(num1, num2));
                    break;
                case 2:
                    System.out.println("O resultado da subtração é: " + calc.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("O resultado da multiplicação é: " + calc.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("O resultado da divisão é: " + calc.dividir(num1, num2));
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }
            System.out.println("Deseja continuar? (Y/N)");
            String response = scanner.next();
            if(response.equalsIgnoreCase("N")){
                end = true;
            }
            else if(response.equalsIgnoreCase("Y")){
                end = false;
            }
            else{
                System.out.println("Invalid response. Please enter Y or N.");
            }
        }while(!end);
        scanner.close();
    }
}
