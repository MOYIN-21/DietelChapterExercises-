public class PolyStyrene {
	private String color;
	private double thickness;
	private double length;
	private String material;
	private int durability;
	
	
	public PolyStyrene(String color, double thickness, double length, String material, int durability){
		this.color = color;
		this.thickness = thickness;
		this.length = length;
		this.material = material;
		this.durability = durability;
               }
		
	public void setColor(String color){
		this.color = color;
	}
	public void setThickness(double thickness){
		this.thickness = thickness;
	}
	public void setLength(double thickness){
		this.thickness = thickness;
	}
	public void setMaterial(String material){
		this.material = material;
	}
	public void setDurability(int durability){
		this.durability = durability;
	}
	
	public String getColor(){
		return color;
	} 
	public double getThickness(){
		return thickness;
	}
	public double getLength(){
		return length;
	}
	public String getMaterial(){
		return material;
	}
	public int getDurability(){
		return durability;
	}
}