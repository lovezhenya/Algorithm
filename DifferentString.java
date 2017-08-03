package programmer.demo;

import java.util.Scanner;

public class DifferentString {

	public DifferentString() {
		// TODO Auto-generated constructor stub
	}
	public static boolean checkDifferent(String iniString) {
        // write code here
//		for(int i = 0; i < iniString.length(); i++)
//		{
//			for(int j = i + 1; j < iniString.length(); j++)
//			{
//				if((iniString.charAt(i)) != iniString.charAt(j))
//					continue;
//				else
//					return false;
//			}
//		}
//		return true;
		char st = iniString.charAt(0);
        for(int i=1;i<iniString.length();i++){
            if(st == iniString.charAt(i)){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		boolean val = checkDifferent(s);
		System.out.println(val);
	}

}
