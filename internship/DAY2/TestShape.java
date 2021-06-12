

public class TestShape {

	public static void main(String[] args) {
		/*Shape s=new Shape();
		s.setbWidth(10);
		s.setColor("green");
		////System.out.println(s.getbWidth());
		//System.out.println(s.getColor());
		Circle c=new Circle();
		c.setRadius(10);
		c.setbWidth(120);
		c.setColor("green");
		System.out.println(c.getbWidth());
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		System.out.println();
		
		Rectangle r=new Rectangle();
		r.setbWidth(23);;
		r.setColor("yello");
		r.setLength(1000);
		r.setWidth(29);
		System.out.println(r.getbWidth());
		System.out.println(r.getColor());
		System.out.println(r.getWidth());
		System.out.println(r.getLength());
		System.out.println();
		
		Shape s=new Circle();
	*/
		
		Shape s[]=new Shape[3];
		s[0]=new Circle(); 
		s[1]=new Triangle();
		s[2]=new Rectangle();
		
		double a=calArea(s);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
	}
	
	public static double calArea(Shape []s)
	{
		double total=0;
		for(int i=0;i<s.length;i++)
		{
			total=total+s[i].area();
		}
		return total;
	}

}
