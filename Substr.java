package programmer.demo;
/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��20�� ����12:04:49 * @version 1.0 * @parameter  * @since  * @return  */
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
