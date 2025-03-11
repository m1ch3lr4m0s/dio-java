import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        boolean end = false;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("The number is: " + number);
            System.out.println("Do you want to continue? (Y/N)");
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
