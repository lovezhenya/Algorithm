package programmer.demo;

import java.util.Scanner;

public class JOKER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] strings = s.split("-");
		String[] s1 = strings[0].split(" ");
		String[] s2 = strings[1].split(" ");
		String[] ss = new String[] { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" ,"joker", "JOKER" };
		
		if(s1.length == 1)
		{
			if (s2.length == 2)
				if (s2[0].equals("joker") || s2[1].equals("joker"))
					System.out.println(strings[1]);
				else {
					System.out.println("ERROR");
				}
			if (s2.length == 4)
				System.out.println(strings[1]);
			if(s2.length == 1)
			{
				if (xiabiao(s1[0], ss) > xiabiao(s2[0], ss))
					System.out.println(strings[0]);
				else
					System.out.println(strings[1]);
			}
			if(s2.length == 3 || s2.length == 5)
				System.out.println("ERROR");
			
		}
		if (s1.length == 2) {
			if (s1[0].equals("joker") || s1[1].equals("joker"))
				System.out.println(strings[0]);
			else {
				if (s2.length != 2) {
					if (s2.length == 4)
						System.out.println(strings[1]);
					else
						System.out.println("ERROR");
				} else {
					if (xiabiao(s1[0], ss) > xiabiao(s2[0], ss))
						System.out.println(strings[0]);
					else {
						System.out.println(strings[1]);
					}
				}
			}
		}
		if (s1.length == 3) {
			if (s2.length != 3) {
				if (s2.length == 4)
					System.out.println(strings[1]);
				if (s2.length == 2)
					if (s2[0].equals("joker") || s2[1].equals("joker"))
						System.out.println(strings[1]);
					else {
						System.out.println("ERROR");
					}
				if (s2.length == 1 || s2.length == 5)
					System.out.println("ERROR");

			} else {
				if (xiabiao(s1[0], ss) > xiabiao(s2[0], ss))
					System.out.println(strings[0]);
				else
					System.out.println(strings[1]);
			}
		}
		if (s1.length == 4) {
			if (s2.length != 4) {
				if (s2.length == 2)
					if (s2[0].equals("joker") || s2[1].equals("joker"))
						System.out.println(strings[1]);
					else {
						System.out.println(strings[0]);
					}
				if (s2.length == 3 || s2.length == 1 ||s2.length == 5)
					System.out.println(strings[0]);
			} else {
				if (xiabiao(s1[0], ss) > xiabiao(s2[0], ss))
					System.out.println(strings[0]);
				else
					System.out.println(strings[1]);
			}
		}
		if(s1.length == 5)
		{
			if(s2.length != 5)
			{
				if (s2.length == 2)
					if (s2[0].equals("joker") || s2[1].equals("joker"))
						System.out.println(strings[1]);
					else {
						System.out.println("ERROR");
					}
				if(s2.length == 4)
					System.out.println(strings[1]);
				if(s2.length == 1 || s2.length == 3)
					System.out.println("ERROR");
			}
			else {
				if(xiabiao(s1[0], ss) > xiabiao(s2[0], ss))
					System.out.println(strings[0]);
				else {
					System.out.println(strings[1]);
				}
			}
		}

	}

	public static int xiabiao(String s, String[] ss) {
		int zuobiao = -1;
		for (int i = 0; i < ss.length; i++) {
			if (ss[i].equals(s)) {
				zuobiao = i;
				break;
			}
		}
		return zuobiao;
	}

}
