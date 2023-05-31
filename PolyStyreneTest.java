public class PolyStyreneTest {
	
	public static void main(String[] args){
	
	PolyStyrene slippers = new PolyStyrene("nigeriaGreen", 0.54, 27.8, "plastic", 3);
	PolyStyrene bag = new PolyStyrene("bloodRed", 0.41, 27.8, "rubber", 3);
	
	System.out.printf("The color of the slippers is %s.%nThe thickness of the slippers is %.2f.%nThe length of the slippers is %.2f.%nThe material of the slippers is %s.%nThe durability of the slippers is %d", slippers.getColor(), slippers.getThickness(), slippers.getLength(), slippers.getMaterial(), slippers.getDurability());
	
	System.out.printf("The color of the bag is %s.%nThe thickness of the bag is %.2f.%nThe length of the bag is %.2f.%nThe material of the bag is %s.%nThe durability of the bag is %d", bag.getColor(), bag.getThickness(), bag.getLength(), bag.getMaterial(), bag.getDurability());

	slippers.setColor("red");
	slippers.setThickness(28.7);
	slippers.setLength(30.0);
	slippers.setMaterial("foam");
	slippers.setDurability(4);
	
	System.out.printf("=========================================================");
	
	System.out.printf("The color of the slippers is %s.%nThe thickness of the slippers is %.2f.%nThe length of the slippers is %.2f.%nThe material of the slippers is %s.%nThe durability of the slippers is %d", slippers.getColor(), slippers.getThickness(), slippers.getLength(), slippers.getMaterial(), slippers.getDurability());

}

}