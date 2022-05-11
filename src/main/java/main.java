import UserInfo.CostumerInfo;
import java.util.Scanner;
public class main {
    private static void costumerConstructor(){
        CostumerInfo costumer = new CostumerInfo();
        costumerFill(costumer);
    }
    private static void costumerFill(CostumerInfo costumer){
        try (Scanner reader = new Scanner(System.in)){
            System.out.println("Enter the costumer's full name: ");
            costumer.setcostumerName(reader.nextLine());

            System.out.println("Enter the costumer's age: ");
            costumer.setAge(reader.nextInt());

            System.out.println("Enter the costumer's gender: ");
            costumer.setGender(reader.next().charAt(0));
        }
        costumerPrint(costumer);
    }
    private static void costumerPrint(CostumerInfo costumer){
        System.out.println("Costumer name: " + costumer.getcostumerName());
        System.out.println("Gender: " + costumer.getGender());
        System.out.println("Age: " + costumer.getAge());
    }

    public static void main(String[] args) {
        costumerConstructor();
        }
    }