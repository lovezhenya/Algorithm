package programmer.demo;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * ��һ�����޳���ֽ��,�ָ��һϵ�еĸ���,�ʼ���и��ӳ�ʼ�ǰ�ɫ��������һ�������Ϸ���һ�����ȵĻ�����(���ϵ��������Ҳ�ᱻȾ��),
 * ������һ���ߵ�ĳ��������,�ͻ���������Ϳ�ɺ�ɫ�����ڸ���һ������n,���������ڻ���ֽ������n����ÿһ��,�����˶����������������һ������,
 * �������������ȡ��������������������ѡ���Ƕ����ġ�������Ҫ��������ֽ���Ϻ�ɫ���ӵ�����ֵ�� 
 * */
public class RandomRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n + 2];
		double species = Math.pow(2, n);
		for (int i = a.length - 1; i >= 0; i--) {
			if (i <= 1) {
				a[i] = 0;
			} else if (i == 2 || i == a.length - 1) {
				a[i] = 2 / species;
			} else
				a[i] = a[i + 1] * 2;
		}
		double expectation = 0;
		for (int i = 0; i < a.length; i++) {
			expectation += i * a[i];
			System.out.println(a[i]);
		}
		DecimalFormat df = new DecimalFormat(".#");
		System.out.println(df.format(expectation));
	}

}