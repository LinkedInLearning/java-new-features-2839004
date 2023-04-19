
public class SwitchCase2  {
    public static void main(String[] args) {
		Tag day = Tag.DO;
		String t = switch (day) {
			case MO, DI, MI, DO, FR -> "Arbeitstag";
			case SA -> "Halber Arbeitstag";
			case SO              -> "Frei";
		};
		System.out.println(t);
    }
   
}
