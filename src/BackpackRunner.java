
public class BackpackRunner {
	public static void main(String[] args) {
		
	
	Backpack bp = new Backpack();
	Pencil pen = new Pencil();
	Ruler rule = new Ruler();
	Textbook tb = new Textbook();
	
	bp.putInBackpack(pen);
	bp.putInBackpack(rule);
	bp.putInBackpack(tb);
	tb.read();
	pen.write("'...Welcome to Chili's'");
	rule.measure();
	bp.goToSchool();
	}
}
