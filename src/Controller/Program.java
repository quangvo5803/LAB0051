package Controller;

import Common.Algorithm;
import Common.Validation;
import Model.Operater;
import Model.Person;
import View.Menu;

public class Program extends Menu<String> {
    static String[] menuChoice = { "Normal Calculator", "BMI Calculator", "Exit" };
    Algorithm a;

    public Program() {
        super("========== Calculator Program ==========", menuChoice);
        a = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                Operater operater = new Operater();
                operater.setNum1(Validation.getDouble("Enter number: "));
                operater.setOperator(Validation.getOperator());
                double result = operater.getNum1();
                while(!operater.getOperator().equalsIgnoreCase("=")){
                    operater.setNum2(Validation.getDouble("Enter number: "));
                    result = a.normalCalculator(result, operater.getNum2(), operater.getOperator());
                    System.out.printf("Memory: %.2f \n", result);
                    operater.setOperator(Validation.getOperator());
                }
                System.out.printf("Result: %.2f \n", result);
                System.out.println();
                break;
            }
            case 2:{
                Person p = new Person();
                p.setWeight(Validation.getDouble("Enter Weight(kg): "));
                p.setHeight(Validation.getDouble("Enter Height(cm): "));
                a.bmiCalculator(p.getWeight(), p.getHeight());
                break;
            }
            case 3:{
                System.exit(0);;
            }
        }
    }
}
