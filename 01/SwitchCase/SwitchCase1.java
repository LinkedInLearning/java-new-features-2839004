
public class SwitchCase1  {
    public static void main(String[] args) {
		Tag day = Tag.MI;
		switch (day) {
			case MO, DI, MI, DO, FR -> System.out.println("Arbeitstag");
			case SA -> System.out.println("Halber Arbeitstag");
			case SO -> System.out.println("Frei");
		}
    }
   
}
