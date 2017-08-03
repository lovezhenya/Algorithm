package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年7月20日 下午12:04:49 * @version 1.0 * @parameter  * @since  * @return  */
public class Substr {

	public Substr() {
		// TODO Auto-generated constructor stub
	}
	public static boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
		boolean[] bol = new boolean[p.length];
		for(int i = 0; i < n; i++)
		{
			if(s.contains(p[i].toString()))
				bol[i] = true;
		}
		return bol;
    }
}
