
public class RecordPatternBisher {
	public static void ausgabeKoordinaten(Object o) {
		  if (o instanceof Punkt p)
		  {
			  int x = p.x();
			  int y = p.y();
		    System.out.println(x + ", " + y);
		  }	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ausgabeKoordinaten(new Punkt(4,5));
	}

}
