//package com.xiaoqian.cn;
//
// class A{
//	
//}
//
//public class test {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Integer  number1 = new Integer(33);
//		int number2 = 33;
//		int number4 = 33;
//		Integer number3 = new Integer(33);
//		String string1 = "123";
//		String string2 = new String("asd");
//		String string22 = new String("asd");
//		String string3 = "asd";
//		String string33 = "asd";
//		System.out.println((number1 == number2));  //true
//		System.out.println((number1 == number3));   //false   类类型，比较地址
//		
//		System.out.println((string2 == string22));   //false    //判断所指对象
//		System.out.println(string2.equals(string22));  //true   //在栈中分配空间，分配两份   判断内容
//		
//		System.out.println(string3 == string33);   //true
//		System.out.println(string3.equals(string33));  //true   是在数据区分配空间，只分配一个空间
//
//	}
//
//}

package com.xiaoqian.cn;
class A implements Runnable{
	public int tickets = 10;
	public void run()
	{
		while(true)
		{
			synchronized(this){
				if(tickets > 0 )
				{
					System.out.printf("%s 线程正在卖%d张票\n",Thread.currentThread().getName(),tickets);
					--tickets;
				}else{
					break;
				}
				
			}
			
		}
				
	}
	
}

public class test{
	
	public static void main(String[] args)
	{
		A aa = new A();
		Thread thread1 = new Thread(aa,"first");
		Thread thread2 = new Thread(aa,"second");
		thread1.start();
		thread2.start();
		//System.out.println(Thread.currentThread().getName());	
		
		//System.out.println("BBBB");
		
	}
}