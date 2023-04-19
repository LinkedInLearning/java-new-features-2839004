
public class RecordPatternNeu {

	public static void ausgabeKoordinaten(Object o) {
		  if (o instanceof Punkt(int x, int y))
		  {
			   System.out.println(x + ", " + y);
		  }	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ausgabeKoordinaten(new Punkt(4,5));
	}

}
