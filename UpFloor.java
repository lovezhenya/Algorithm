package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月1日 下午10:14:36 * @version 1.0 * @parameter  * @since  * @return  */
public class UpFloor {

	public int countWays(int n) {
        // write code here
		int val = JumpFloorII(n);
		return val;
    }
public static int JumpFloorII(int target) {
      int[] a = new int[4];
      if(target < 0)
    	  return -1;
      if(target == 0)
    	  return 0;
      if(target == 1)
    	  return 1;
      if(target == 2)
    	  return 2;
      if(target == 3)
    	  return 4;
      a[0] = 0;
      a[1] = 1;
      a[2] = 2;
      a[3] = 4;
      for(int i = 4; i <= target; i++)
      {
    	  int sum = 0;
    	  sum = a[3] + a[2] + a[1];
    	  a[1] = a[2];
    	  a[2] = a[3];
    	  a[3] = sum;
    	  
      }
      for(int i = 0; i < a.length; i++)
      {
    	  System.out.print(a[i] + " ");
      }
      System.out.println();
      return a[3];
    }
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int target = sc.nextInt();
	int sum = JumpFloorII(target);
	System.out.println(sum);
}
}
