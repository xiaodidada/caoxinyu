import java.math.BigDecimal;


public class Fibonacci {
	//因为int会溢出，用了BigDecimal类型，与题目要求可能有出入
	public static BigDecimal of(int n)
	{
		//返回Fibonacci数列第n项的值
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
		//输出Fibonacci数列的前1-200项的
		for(int i=1;i<=200;i++)
			System.out.println(Fibonacci.of(i));

	}

}
