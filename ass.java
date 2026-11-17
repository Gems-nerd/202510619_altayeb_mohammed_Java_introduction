    import java.util.Scanner;

public class ass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String name;
        int age;
        double mealCost;
        double numberofdrinks;
        boolean areyoustudent;
        int rating;
        double discount = 0.0;
        double tip = 0.0;
       


        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter the cost of your meal: ");
        mealCost = input.nextDouble();
        System.out.println("Enter the number of drinks you ordered: ");
        numberofdrinks = input.nextDouble();
        System.out.println("`Are you a student? (true/false): ");
        areyoustudent = input.nextBoolean();
        System.out.println("Enter your rating (1-5): ");
        rating = input.nextInt();

        double totalCost = mealCost + (numberofdrinks * 15.50);
        if (areyoustudent) {
            discount = discount + 0.10;
        }
        if (age >= 60){
            discount = discount + 0.05;
        }
        if(rating >= 4){
            tip = totalCost * 0.10;
        }

        System.out.println("SMART RESTAURANT");
        System.out.println("Customer : " + name + "age :" + age);
        System.out.println("Meal Cost $ " + mealCost);
        System.out.println("Drinks Cost $ " + (numberofdrinks * 15.50));
        System.out.println("Discount %" + (discount * 100));
        System.out.println("Tip " + tip);
        System.out.println("Total Cost $ " + totalCost);
        System.out.println("Total Cost after discount $ " + (tip + totalCost - (totalCost * discount)));
    }
}
