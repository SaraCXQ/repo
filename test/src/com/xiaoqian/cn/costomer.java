package com.xiaoqian.cn;

public class costomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Custome custome1 = new Custome();
		Thread thread1 = new Thread(custome1,"�߳�1");
		Thread thread2 = new Thread(custome1,"�߳�2");
		thread1.start();
		thread2.start();
		

	}

}

class Custome implements Runnable{
	public static int number_goods = 10;
	
	public void put()
	{
		number_goods++;
	}
	public void get()
	{
		 number_goods--;   
	}
	public void run()
	{
		synchronized(this)
		{
			while(true)
			{
				if(number_goods > 0)
				{
					get();
					System.out.printf("%s�߳���get��Ʒ%d\n", Thread.currentThread().getName(),number_goods);
				}else{					
					put();
					System.out.printf("%s�߳���put��Ʒ%d\n", Thread.currentThread().getName(),number_goods);
				}
			}
		}
	}
}