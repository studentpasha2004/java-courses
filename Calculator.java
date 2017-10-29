/* ʊ���� ��������� ����������� */

public class Calculator {
/* ���������� ����������*/

public int result;

/* �������� ��������� 
	@param params ��������� �����������
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

/* �������� ��������� ���������� 
	@return ��������� ����������� 
*/

public int getResult()
{
	return this.result;
}

/*�������� ��������� ����������� */
public void cleanResult()
{
	this.result = 0;
}

}