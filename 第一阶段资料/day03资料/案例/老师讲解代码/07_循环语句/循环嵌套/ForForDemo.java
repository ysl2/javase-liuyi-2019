/*
	ѭ��Ƕ�ף�
		ѭ������а���ѭ�����
	
	����
		�ڿ���̨���һ���Сʱ�ͷ���
		
		���Ӻ�Сʱ�ķ�Χ��
			���ӣ�0 <= minute < 60
			Сʱ��0 <= hour < 24
*/
public class ForForDemo {
	public static void main(String[] args) {
		/*
		System.out.println("0ʱ0��");
		System.out.println("0ʱ1��");
		System.out.println("0ʱ2��");
		System.out.println("0ʱ3��");
		System.out.println("--------");
		System.out.println("1ʱ0��");
		System.out.println("1ʱ1��");
		System.out.println("1ʱ2��");
		System.out.println("1ʱ3��");
		System.out.println("--------");
		System.out.println("2ʱ0��");
		System.out.println("2ʱ1��");
		System.out.println("2ʱ2��");
		System.out.println("2ʱ3��");
		*/
		
		//ѭ���Ľ�
		/*
		for(int minute=0; minute<4; minute++) {
			System.out.println("0ʱ" + minute + "��");
		}
		System.out.println("--------");
		
		for(int minute=0; minute<4; minute++) {
			System.out.println("1ʱ" + minute + "��");
		}
		System.out.println("--------");
		
		for(int minute=0; minute<4; minute++) {
			System.out.println("2ʱ" + minute + "��");
		}
		System.out.println("--------");
		*/
		
		//��ѭ������Сʱ�ķ�Χ����ѭ�����Ʒ��ӵķ�Χ
		/*
		for(int hour=0; hour<3; hour++) {
			for(int minute=0; minute<4; minute++) {
				System.out.println(hour + "ʱ" + minute + "��");
			}
			System.out.println("--------");
		}
		*/
		
		for(int hour=0; hour<24; hour++) {
			for(int minute=0; minute<60; minute++) {
				System.out.println(hour + "ʱ" + minute + "��");
			}
			System.out.println("--------");
		}
	}
}