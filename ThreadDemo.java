package programmer.demo;
/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��24�� ����4:10:09 * @version 1.0 * @parameter  * @since  * @return  */
public class ThreadDemo {

	public ThreadDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.print("foo");
			}
		};
		Thread t = new Thread();
		t.run();
		System.out.println("bar");
	}

}
