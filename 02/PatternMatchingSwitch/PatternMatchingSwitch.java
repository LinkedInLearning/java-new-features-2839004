package patternmatchingswitch;

/**
 *
 * @author ralph
 */
public class PatternMatchingSwitch {
    static String formatterPatternSwitch(Object o) {
    return switch (o) {
        case Integer i -> String.format("int %d", i);
        case Long l    -> String.format("long %d", l);
        case Double d  -> String.format("double %f", d);
        case String s  -> String.format("String %s", s);
        default        -> o.toString();
    };
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long a = 42;
        System.out.println(formatterPatternSwitch(a));
    }
    
}
