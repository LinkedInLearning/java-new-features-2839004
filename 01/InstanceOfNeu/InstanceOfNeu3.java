public class InstanceOfNeu3 {
    public static void main(String[] args) {
        Object obj="What? Well, what sort of chance does that give me?";
 
        if (obj instanceof String s & s.length() > 5) {
            System.out.println(s.toUpperCase());
        }else{
			System.out.println(s);
		}
		

    }

}
