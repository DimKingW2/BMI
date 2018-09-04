import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        float inch;
        float m;
        float pounds;
        float kg;
        float bmi;
        Scanner keyboard;



        keyboard = new Scanner(System.in);
        System.out.println("What is your height in inches?");
        inch = keyboard.nextFloat();
        m = (float) (inch * (0.0254));
        System.out.println("Great, now what is your weight in pounds.");
        pounds = keyboard.nextFloat();
        kg = (float) (pounds / (2.20462/1));


        bmi = (kg/(m*m));

        System.out.println("Your bmi is, " + bmi + ".");





















    }
      }



