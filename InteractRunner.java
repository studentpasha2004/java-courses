import java.util.Scanner;

/* класс для запуска калькулятора поддерживает ввод пользователя*/
public class InteractRunner {
	
public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
	try{
		Calculator calc = new Calculator();
		String exit = "no";
		while(!exit.equals("yes")){
			System.out.println("Enter first argument: ");
			String first = reader.next();
			System.out.println("Enter second argument: ");
			String second = reader.next();
			do{
				System.out.println("Choose one operation: plus/minus/multiply/divide");
				String operation = reader.next();			
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
								  System.out.println("Please choose one of proposed operations.");
								  break;
								           }
			}
			while(!exit.equals("yes"));
				
			System.out.println("Result: " + calc.getResult());
			calc.cleanResult();
			System.out.println("Exit : yes/no");
			exit = reader.next();
		}
	}
	finally{
		reader.close();
		}
}
}