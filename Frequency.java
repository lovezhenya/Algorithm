package programmer.demo;
/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��19�� ����6:21:12 * @version 1.0 * @parameter  * @since  * @return  */
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
