package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年7月19日 下午6:21:12 * @version 1.0 * @parameter  * @since  * @return  */
public class Frequency {

	public Frequency() {
		// TODO Auto-generated constructor stub
	}
	public int getFrequency(String[] article, int n, String word) {
        // write code hereint
		if(article == null || n == 0 || word == null)
			return 0;
		int count = 0;
		for(int i = 0; i < n; i++)
		{
			if(article[i].equals(word))
				count++;
		}
		return count;
    }
}
