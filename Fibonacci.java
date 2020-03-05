import java.math.BigDecimal;


public class Fibonacci {
	//��Ϊint�����������BigDecimal���ͣ�����ĿҪ������г���
	public static BigDecimal of(int n)
	{
		//����Fibonacci���е�n���ֵ
		BigDecimal a = BigDecimal.valueOf(1);
		BigDecimal b = BigDecimal.valueOf(1);
		if(n<=2)
			return b;
		else
		{
			for(int m=3;m<=n;m++)
			{
				BigDecimal temp = b;
				b = a.add(b);
				a = temp;				
			}
			return b;
		}
	}
	public static void main(String[] args) 
	{
		//���Fibonacci���е�ǰ1-200���
		for(int i=1;i<=200;i++)
			System.out.println(Fibonacci.of(i));

	}

}
