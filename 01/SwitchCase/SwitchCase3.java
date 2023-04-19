
public class SwitchCase3  {
    public static void main(String[] args) {
		Tag day = Tag.SO;
		String t = switch (day) {
			case MO, DI, MI, DO, FR -> "Arbeitstag";
			case SA -> "Halber Arbeitstag";
			default      -> {
              String k = day.toString().toLowerCase();
              yield k;
            }
		};
		System.out.println(t);
    }
   
}
