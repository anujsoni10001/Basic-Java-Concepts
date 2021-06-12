

public abstract class Shape {
	private int bWidth;
	private String color="red";
	public static final  float PI=3.141f;
	abstract public double area();
	
	public int getbWidth() {
		//System.out.println(bWidth);
		return bWidth;
	}
	public void setbWidth(int bW) {
		bWidth = bW;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String col) {
		color = col;
	}
}
