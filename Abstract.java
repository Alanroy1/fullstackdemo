abstract class Rbi{
	abstract void loan();	


	}
class Sbi extends Rbi
	{
	void loan()
		{
		System.out.println("it's sbi");
		}	

	}
class Sbt extends Rbi
	{
	void loan()
		{
		System.out.println("it's sbt");
		}	

	}
class Sbi extends Rbi
	{
	void loan()
		{
		System.out.println("it's sbi");
		}	

	}



class Abstractio
	{
public static void main(String args[])
	{
	Rbi i=new Sbi();
	i.loan();
	Sbi p =new Sbi();
	p.loan();
	Sbt q=new Sbt();
	q.loan();
	Sbi n=new Sbi();
	n.loan();
	}
	}