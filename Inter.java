interface Rbi{
	void loan();
}
class Sbi implements Rbi
	{
	public void loan()
		{
		System.out.println("it's sbi");
		}	

	}

class Inter
	{
public static void main(String args[]){
	Rbi i=new Sbi();
	i.loan();
	Sbi p =new Sbi();
	p.loan();


}
	}