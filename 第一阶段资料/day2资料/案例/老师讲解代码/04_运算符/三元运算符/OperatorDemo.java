/*
	��Ԫ�����
	
	��ʽ��
		��ϵ���ʽ ? ���ʽ1 : ���ʽ2;

	������
		a > b ? a : b;
	
	ִ�����̣�
		���ȼ����ϵ���ʽ��ֵ
		���ֵΪtrue�����ʽ1��ֵ����������
		���ֵΪfalse�����ʽ2��ֵ����������
*/
public class OperatorDemo {
	public static void main(String[] args) {
		//������������
		int a = 10;
		int b = 20;
		
		//��ȡ���������еĽϴ�ֵ
		int max = a > b ? a : b;
		
		//������
		System.out.println("max:" + max);
	}
}