package Common;

public class Algorithm {
    public double normalCalculator(double number1,double number2,String operator){
        double result =number1;
        switch(operator){
            case "+":{
                result = result + number2;
                break;
            }
            case "-":{
                 result = result - number2;
                 break;
            }
            case "*":{
                result = result * number2;
                break;
            }
            case "/":{
                result = result/number2;
                break;
            }
            case "^":{
                result = Math.pow(result, number2);
                break;
            }
        }
        return result;
    }

    public void bmiCalculator(double weight,double height){
        double bmi = (weight)/((height/100)*(height/100));
        if (bmi > 40){
            System.out.printf("BMI number: %.2f \n",bmi);
            System.out.println("BMI Status: Very fat");
        }
        else if(bmi>30 && bmi<=40){
            System.out.printf("BMI number: %.2f \n",bmi);
            System.out.println("BMI Status: Fat - Should lose weight");
        } 
        else if(bmi>25 && bmi<=30){
            System.out.printf("BMI number: %.2f \n",bmi);
            System.out.println("BMI Status: Overweight");
        }else if(bmi>19 && bmi<=25){
            System.out.printf("BMI number: %.2f \n",bmi);
            System.out.println("BMI Status: Stardard");
        }else if(bmi<=19){
            System.out.printf("BMI number: %.2f \n",bmi);
            System.out.println("BMI Status: Under-stardard");
        }
        System.out.println();
    }
}
