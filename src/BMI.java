import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
       // Defining stuff
        float inch;
        float m;
        float pounds;
        float kg;
        float bmi;
        Scanner keyboard;


        // Getting info on people
        keyboard = new Scanner(System.in);
        System.out.println("What is your height in inches?");
        inch = keyboard.nextFloat();
        m = (float) (inch * (0.0254));
        System.out.println("Great, now what is your weight in pounds.");
        pounds = keyboard.nextFloat();
        kg = (float) (pounds / (2.20462/1));

        // calculations
        bmi = (kg/(m*m));

        //gives you bmi
        System.out.println("Your bmi is, " + bmi + ".");
        //tells you if you are overweight, average, or underweight
        if (bmi > 25) {
            System.out.println("You are overweight.");
        }
       else if (bmi < 18.5) {
            System.out.println("You are underweight.");
        }
        else {
            System.out.println("You are average.");
        }






















    }
      }



