package booknameprice;

	import java.util.Scanner;

	public class Book2 {
		public String title;
		public double price;
		public int setbookt(String i)
		{
			this.title=i;
			return 0;
			
		}
	public int getbookp()
	{
		System.out.println("book price:"+price);
		return 0;
	}
	public int setbookp(double d)
	{
		this.price=d;
		return 0;
		
	}
	public int getbookt()
	{
		System.out.println("book name:"+title);
		return 0;
	}
	public static void main(String[] args) {
		Book1 b1=new Book1();
		b1.createbook();
		b1.showbook();
	}
	}
	class Book1
	{

	Book2 b2 = new Book2();
	public void createbook()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the number of books:");
		int n = s1.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter book title:");
			String name=s1.next();
			System.out.println(name);
			System.out.println("enter the price");
			int pri=s1.nextInt();
			b2.setbookt(name);
			b2.setbookp(pri);
			
		}
	}
	public void showbook()
	{
		b2.getbookt();
		b2.getbookp();
	}

		
	}


		



