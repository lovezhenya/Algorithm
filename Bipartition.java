package programmer.demo;

/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��19�� ����10:13:17 * @version 1.0 * @parameter  * @since  * @return  */
class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = 0;
		this.y = 0;
	}
}

public class Bipartition {

	public Bipartition() {
		// TODO Auto-generated constructor stub
	}

	public double[] getBipartition(Point[] A, Point[] B) {
		// write code here
		double x1 = (A[0].x + A[2].x) / 2; // ��һ�����ĵ������
		double x2 = (B[0].x + B[2].x) / 2;
		double y1 = (A[0].y + A[2].y) / 2; // ��һ�����ĵ�������
		double y2 = (B[0].y + B[2].y) / 2;
		double s = (y1 - y2) / (x1 - x2); // б��
		double y = y1 - s * x1; // �ؾ࣬Ҳ���Դ���ڶ������ĵ����
		double[] ans = new double[2];
		ans[0] = s;
		ans[1] = y;
		return ans;// ���ؽ��
	}
}
