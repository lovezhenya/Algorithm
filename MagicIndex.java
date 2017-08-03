package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年7月21日 上午9:43:42 * @version 1.0 * @parameter  * @since  * @return  */
public class MagicIndex {

	public MagicIndex() {
		// TODO Auto-generated constructor stub
	}
	public boolean findMagicIndex(int[] A, int n) {
        // write code here
		return ExitMagic(A, 0, n - 1);
    }
	public static boolean ExitMagic(int[] A, int l, int r)
	{
		if(l > r)
			return false;
		int mid = (l + r) / 2;
		if(mid == A[mid])
			return true;
		if(l == r)
			return false;
		boolean low = ExitMagic(A, l, mid - 1);
		boolean high = ExitMagic(A, mid + 1, r);
		if(low == true || high == true)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		int[] A = {0,1,4,4,5};
		System.out.println(ExitMagic(A, 0, A.length - 1));
	}
}
