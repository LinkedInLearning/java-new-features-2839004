
public class Records  {
    public static void main(String[] args) {
		Person p = new Person("Hans","Dampf");
		System.out.println(p.lastName());
		System.out.println(Person.x);
		Person.erhoeheX();
		System.out.println(Person.x);
		System.out.println(p.getName());
    }
   
}
