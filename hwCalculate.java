public class hwCalculate{
	public static void main(String[] arg){
		//Start program execution
		System.out.println("Calculaiting...");
		
		//Initialization of variables
		int firstInt = Integer.valueOf(arg[0]);
		int secondInt = Integer.valueOf(arg[1]);
		int firstByte = Byte.valueOf(arg[2]);
		int secondByte = Byte.valueOf(arg[3]);
		int firstShort = Short.valueOf(arg[4]);
		int secondShort = Short.valueOf(arg[5]);
		long firstLong = Long.valueOf(arg[6]);
		long secondLong = Long.valueOf(arg[7]);
		float firstFloat = Float.valueOf(arg[8]);
		float secondFloat = Float.valueOf(arg[9]);
		double firstDouble = Double.valueOf(arg[10]);
		double secondDouble = Double.valueOf(arg[11]);
		boolean firstBoolean = Boolean.valueOf(arg[12]);
		boolean secondBoolean = Boolean.valueOf(arg[13]);
		String f = arg[14];
		String s = arg[15];
		char firstChar = f.charAt(0);
		char secondChar = s.charAt(0);
		
		//Test parameters
		//5 6 50 60 10 50 250 150 2.5 1.5 15.54 8.28 true false "r" "g"
		
		//Calculations sums
		System.out.println("Calculaiting sum...");
		int sumInt = firstInt + secondInt;
		int sumByte = firstByte + secondByte;
		int sumShort = firstShort + secondShort;
		long sumLong = firstLong + secondLong;
		float sumFloat = firstFloat + secondFloat;
		double sumDouble = firstDouble + secondDouble;
		boolean sumBoolean = firstBoolean & secondBoolean;
		//String sumChar = firstChar + secondChar;
		
		//Calculations deduct
		System.out.println("Calculaiting deduct...");
		int deductInt = firstInt - secondInt;
		int deductByte = firstByte - secondByte;
		int deductShort = firstShort - secondShort;
		long deductLong = firstLong - secondLong;
		float deductFloat = firstFloat - secondFloat;
		double deductDouble = firstDouble - secondDouble;
		boolean deductBoolean = firstBoolean | secondBoolean;
		//String deductChar = firstChar - secondChar;
		
		//Calculations multiply
		System.out.println("Calculaiting multiply...");
		int multiplyInt = firstInt * secondInt;
		int multiplyByte = firstByte * secondByte;
		int multiplyShort = firstShort * secondShort;
		long multiplyLong = firstLong * secondLong;
		float multiplyFloat = firstFloat * secondFloat;
		double multiplyDouble = firstDouble * secondDouble;
		boolean multiplyBoolean = firstBoolean && secondBoolean;
		//String multiplyChar = firstChar * secondChar;
		
		//Calculations divide
		System.out.println("Calculaiting divide...");
		int divideInt = firstInt / secondInt;
		int divideByte = firstByte / secondByte;
		int divideShort = firstShort / secondShort;
		long divideLong = firstLong / secondLong;
		float divideFloat = firstFloat / secondFloat;
		double divideDouble = firstDouble / secondDouble;
		boolean divideBoolean = firstBoolean || secondBoolean;
		//String divideChar = firstChar / secondChar;
		 
		//Calculations elevate
		System.out.println("Calculaiting elevate...");
		int elevateInt = firstInt ^ secondInt;
		int elevateByte = firstByte ^ secondByte;
		int elevateShort = firstShort ^ secondShort;
		long elevateLong = firstLong ^ secondLong;
		//float elevateFloat = firstFloat ^ secondFloat;
		//double elevateDouble = firstDouble ^ secondDouble;
		boolean elevateBoolean = firstBoolean ^ secondBoolean;
		//String elevateChar = firstChar ^ secondChar;
		 		 
		//Showing results sum
		System.out.println("Pesenting results sum...");
		System.out.println("Sum of integers " + sumInt);
		System.out.println("Sum of bytes " + sumByte);
		System.out.println("Sum of shorts " + sumShort);
		System.out.println("Sum of longs " + sumLong);
		System.out.println("Sum of floats " + sumFloat);
		System.out.println("Sum of doubles " + sumDouble);
		System.out.println("Sum of booleans " + sumBoolean);
		//System.out.println("Sum of chars " + sumChar);
		
		//Showing results deduct
		System.out.println("Pesenting results deduct...");
		System.out.println("Deduct of integers " + deductInt);
		System.out.println("Deduct of bytes " + deductByte);
		System.out.println("Deduct of shorts " + deductShort);
		System.out.println("Deduct of longs " + deductLong);
		System.out.println("Deduct of floats " + deductFloat);
		System.out.println("Deduct of doubles " + deductDouble);
		System.out.println("Deduct of booleans " + deductBoolean);
		//System.out.println("Deduct of chars " + deductChar);
		
		//Showing results multiply
		System.out.println("Pesenting results multiply...");
		System.out.println("Multiply of integers " + multiplyInt);
		System.out.println("Multiply of bytes " + multiplyByte);
		System.out.println("Multiply of shorts " + multiplyShort);
		System.out.println("Multiply of longs " + multiplyLong);
		System.out.println("Multiply of floats " + multiplyFloat);
		System.out.println("Multiply of doubles " + multiplyDouble);
		System.out.println("Multiply of booleans " + multiplyBoolean);
		//System.out.println("Multiply of chars " + multiplyChar);
		
		//Showing results divide
		System.out.println("Pesenting results divide...");
		System.out.println("Divide of integers " + divideInt);
		System.out.println("Divide of bytes " + divideByte);
		System.out.println("Divide of shorts " + divideShort);
		System.out.println("Divide of longs " + divideLong);
		System.out.println("Divide of floats " + divideFloat);
		System.out.println("Divide of doubles " + divideDouble);
		System.out.println("Divide of booleans " + divideBoolean);
		//System.out.println("Divide of chars " + divideChar);
		
		//Showing results elevate
		System.out.println("Pesenting results elevate...");
		System.out.println("Elevate of integers " + elevateInt);
		System.out.println("Elevate of bytes " + elevateByte);
		System.out.println("Elevate of shorts " + elevateShort);
		System.out.println("Elevate of longs " + elevateLong);
		//System.out.println("Elevate of floats " + elevateFloat);
		//System.out.println("Elevate of doubles " + elevateDouble);
		System.out.println("Elevate of booleans " + elevateBoolean);
		//System.out.println("Elevate of chars " + elevateChar);
	}
	
}