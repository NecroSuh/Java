package array;

public class Ex05_02 {

	public static void main(String[] args) {
		int sum=0;			// ������ �����ϱ� ���� ����
		float avarage=0f;	// ����� �����ϱ� ���� ����
		
		int[] score= {100,88,100,100,90};
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		avarage=sum/(float)score.length;	// ������� floatŸ������ ������ ����ȯ
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avarage);
	}

}
