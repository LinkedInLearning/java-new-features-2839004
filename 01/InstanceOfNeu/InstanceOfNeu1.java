public class InstanceOfNeu1 {
    public static void main(String[] args) {
        Object obj=5.0;
        String fO = null;
        /*
        Alter Ansatz
         */
        if (obj instanceof Integer) {
			System.out.println(obj + " erkannt als Integer");
            fO = String.format("int %d", (Integer) obj);
        } else if (obj instanceof Byte) {
		  System.out.println(obj + " erkannt als Byte");

            fO = String.format("byte %d", (Byte) obj);
        } else if (obj instanceof Long) {
			System.out.println(obj + " erkannt als Long");
            fO = String.format("long %d", (Long) obj);
        } else if (obj instanceof Double) {
			System.out.println(obj + " erkannt als Double");

            fO = String.format("double %f", (Double) obj);
        } else if (obj instanceof String) {
			System.out.println(obj + " erkannt als String");
            fO = String.format("String %s", (String) obj);
        } else{
			System.out.println("Typ von " + obj + " wurde nicht erkannt");
            fO = "Unbekannt";
		}
		System.out.println("Formatiertes Objekt: " + fO);

      /*
        Neuer Ansatz Java 14
         */
        if (obj instanceof Integer i) {
            fO = String.format("int %d", i);
        } else if (obj instanceof Byte b) {
            fO = String.format("byte %d", b);
        } else if (obj instanceof Long l) {
            fO = String.format("long %d", l);
        } else if (obj instanceof Double d) {
            fO = String.format("double %f", d);
        } else if (obj instanceof String s) {
            fO = String.format("String %s", s);
        }else{
		   fO = "Unbekannt";
		}
		
		System.out.println("Formatiertes Objekt: " + fO);

    }

}
