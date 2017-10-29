/*  Класс реализует калькул€тор */

public class Calculator {
/* Результаты вычислений*/

public int result;

/* Сумируем аргументы 
	@param params Аргументы сумирования
*/
public void add(int ... params){
	for(Integer param : params){
		this.result += param;
	}
}

public void minus(int first, int second){
	this.result = first - second;
}

public void multiply(int first, int second){
	this.result = first * second;
}

public void divide(int first, int second){
	this.result = first / second;
}

/* Получить результат вычислений 
	@return результат ввычесления 
*/

public int getResult()
{
	return this.result;
}

/*Очистить результат ввычесления */
public void cleanResult()
{
	this.result = 0;
}

}