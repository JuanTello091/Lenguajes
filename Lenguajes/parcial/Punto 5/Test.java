// import de librerias de runtime de ANTLR
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
	public static void main(String[] args) throws Exception {
		try{
			String inputFile = null;
			if(args.length>0){inputFile = args[0];}
			InputStream is = System.in;
			if(inputFile != null){
				is=new FileInputStream(inputFile);
			}
			ANTLRInputStream input = new ANTLRInputStream(is);
			
			//File f = new File(args[0]);
			// crear un analizador léxico que se alimenta apartir de la entrada (archivo  o consola)
			SenCosTanLexer lexer = new SenCosTanLexer(input);
			// Identificar al analizador léxico como fuente de tokens para el sintactico
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// Crear el objeto correspondiente al analizador sintáctico que se alimenta apartir del buffer de tokens
			SenCosTanParser parser = new SenCosTanParser(tokens);
			ParseTree tree = parser.prog(); // begin parsing at init rule
			
			SenCosTanVisitorTest visitorCal = new SenCosTanVisitorTest();
        		visitorCal.visit(tree);
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
        		
		} catch (Exception e){
			System.err.println("Error (Test): " + e);
		}
	}
}
