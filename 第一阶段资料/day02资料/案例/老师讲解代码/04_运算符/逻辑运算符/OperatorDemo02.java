/*
	��·�߼������
*/
public class OperatorDemo02 {
	public static void main(String[] args) {
		//�������
		int i = 10;
		int j = 20;
		int k = 30;
		
		//&& ��false��false
		System.out.println((i > j) && (i > k)); //false && false
		System.out.println((i < j) && (i > k)); //true && false
		System.out.println((i > j) && (i < k)); //false && true
		System.out.println((i < j) && (i < k)); //true && true
		System.out.println("--------");
		
		//|| ��true��true
		System.out.println((i > j) || (i > k)); //false || false
		System.out.println((i < j) || (i > k)); //true || false
		System.out.println((i > j) || (i < k)); //false || true
		System.out.println((i < j) || (i < k)); //true || true
		System.out.println("--------");
		
		//&&��&
		//System.out.println((i++ > 100) & (j++ > 100)); //false & false
		System.out.println((i++ > 100) && (j++ > 100)); //false && false
		System.out.println("i:" + i);
		System.out.println("j:" + j);	
	}
}