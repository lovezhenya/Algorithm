package programmer.demo;

import java.util.Arrays;
import java.util.HashSet;

/* @author  作者 E-mail: * @date 创建时间：2017年7月19日 下午6:28:36 * @version 1.0 * @parameter  * @since  * @return  */
public class FindPair {

	public static int countPairs(int[] A, int n, int sum) {
        // write code hereint
		int count = 0;
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(A[i] + A[j] == sum)
					count++;
			}
		}
        return count;
    }
	public static void expectSum_bySort(int[] arr, int expectSum)
    {
        if(arr == null || arr.length == 0)
            return;
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        
        while(left < right)
        {
            if(arr[left] + arr[right] > expectSum)
                right--;
            else if(arr[left] + arr[right] < expectSum)
                left++;
            else//equal
            {
                System.out.println(arr[left] + " + " + arr[right] + " = " + expectSum); 
                left++;
                right--;
            }
        }
    }
    
    
    public static int expectSum_bySet(int[] A, int n, int sum)
    {
    	int count = 0;
        if(A == null || A.length == 0)
            return 0;
        HashSet<Integer> intSets = new HashSet<Integer>(A.length);
        
        int suplement;
        for (int i : A)
        {
            suplement = sum - i;
            if(!intSets.contains(suplement)){
                intSets.add(i);
            }else{
                count++;
            }
        }
        return count;
    }
    
    //hapjin test
    public static void main(String[] args) {
//        int[] arr = {2,7,4,9,3};
//        int expectSum = 11;
//        expectSum_bySet(arr, expectSum);
//        System.out.println("************");
        //expectSum_bySort(arr, expectSum);
        System.out.println("----------------");
        int[] arr2 = {1,1,2,3,4,5,5};
        int expectSum2 = 6;
        System.out.println(countPairs(arr2, arr2.length, 6));
        //expectSum_bySet(arr2, expectSum2);
        //System.out.println("**********");
        //expectSum_bySort(arr2, expectSum2);
    }
}
