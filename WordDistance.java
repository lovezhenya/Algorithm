package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年7月19日 下午8:12:27 * @version 1.0 * @parameter  * @since  * @return  */
public class WordDistance {

	public WordDistance() {
		// TODO Auto-generated constructor stub
	}
	public static int getDistance(String[] article, int n, String x, String y) {
        // write code here
		int xpoint = 0,ypoint = 0;
		int min = Integer.MAX_VALUE;
		while(xpoint < n && ypoint < n)
		{
			if(!article[xpoint].equals(x))
				xpoint++;
			if(!article[ypoint].equals(y))
				ypoint++;
			if(xpoint == n || ypoint == n)
				break;
			if(article[xpoint].equals(x) && article[ypoint].equals(y))
			{
				if(Math.abs(xpoint - ypoint) < min)
					min = Math.abs(xpoint - ypoint);
				if(xpoint < ypoint)
					xpoint++;
				else
					ypoint++;
					
			}
		}
		return min;
//		xpoint = getPoint(article, n, x);
//		ypoint = getPoint(article, n, y);
		
    }
	public static void main(String[] args)
	{
		String artice = "Money will never make you emotionally strong I have seen many girls "
				+ "fall into desperate and give up while trying to overcome fickle "
				+ "situations and I thought it would be a great idea to share some tips "
				+ "to help you make yourself emotionally and mentally strong lady So remember";
		String[] article = artice.split(" ");
		String x = "to";
		String y = "I";
		System.out.println(getDistance(article, article.length, x, y));
	}
	public static int getPoint(String[] article, int n, String val)
	{
		for(int i = 0; i < article.length; i++)
		{
			if(article[i].equals(val))
				return i;
		}
		return -1;
	}
}
