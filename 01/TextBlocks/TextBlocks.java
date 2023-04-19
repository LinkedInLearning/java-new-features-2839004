import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class TextBlocks {
	public static void main(String[] args) {
		String html = """
	              <html>
	                 <body>
	                    <h1>Text Blocks in Verbindung mit HTML</h1>
	                 </body>
	              </html>""";
		System.out.println(html);
		String query = """
               SELECT * FROM `PERSON`
               WHERE `STADT` = 'EPPSTEIN'
               ORDER BY `ID`, `VNAME`;
               """;
		System.out.println(query);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
        try {
            Object obj = engine.eval("""
                         function hello() {
                             print('"Hallo Text Blocks"');
                         }
                         hello();
                         """);
        } catch (ScriptException ex) {
            System.out.println(TextBlocks.class.getName());
        }
		String rgb1 = """
		red  \s
		green\s
		blue \s
		""";
		System.out.println(rgb1);
		String rgb2 = """
		red  \
		green          \
		blue \
		""";
		System.out.println(rgb2);

	}

}
