package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年7月19日 上午9:50:13 * @version 1.0 * @parameter  * @since  * @return  */
public class Ants {

	public Ants() {
		// TODO Auto-generated constructor stub
	}
	public static double antsCollision(int n) {
        // write code here
		//先求不碰撞的概率
		if(n < 3 || n > 10000)
			return 0;
		double probability = 2.0 / Math.pow(2, n);
		double noCollision = 1 - probability;
		return noCollision;
    }
	public static void main(String[] args)
	{
		double nocoll = antsCollision(4);
		System.out.println(nocoll);
	}
}
