import java.util.Scanner;

/* класс для запуска калькулятора с входными параметрами*/

public class ArgRunner {
	
public static void main(String[] args){
	int first = Integer.valueOf(args[0]);
	int second = Integer.valueOf(args[1]);
	String operation = args[2];
	String exit = "no";
	Calculator calc = new Calculator();
	switch (operation) {
		case "plus"     : calc.add(Integer.valueOf(first), Integer.valueOf(second));
		System.out.println("Plus operation choosen.");
		exit = "yes";
		break;	
		case "minus"    : calc.minus(Integer.valueOf(first), Integer.valueOf(second));
		System.out.println("Minus operation choosen.");
		exit = "yes";
		break;
		case "multiply" : calc.multiply(Integer.valueOf(first), Integer.valueOf(second));
		System.out.println("Multiply operation choosen.");
		exit = "yes";
		break;
		case "divide"   : calc.divide(Integer.valueOf(first), Integer.valueOf(second));
		System.out.println("Divide operation choosen.");
		exit = "yes";
		break;
		default:  System.out.println("Invalid operation name.");
				  System.out.println("Program closed due to invalid operation.");
				  break;
						}
	   while(!exit.equals("yes"));
				
		System.out.println("Result: " + calc.getResult());
		calc.cleanResult();
		}
	}


