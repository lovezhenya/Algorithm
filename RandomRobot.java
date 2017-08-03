package programmer.demo;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 有一条无限长的纸带,分割成一系列的格子,最开始所有格子初始是白色。现在在一个格子上放上一个萌萌的机器人(放上的这个格子也会被染红),
 * 机器人一旦走到某个格子上,就会把这个格子涂成红色。现在给出一个整数n,机器人现在会在纸带上走n步。每一步,机器人都会向左或者向右走一个格子,
 * 两种情况概率相等。机器人做出的所有随机选择都是独立的。现在需要计算出最后纸带上红色格子的期望值。 
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