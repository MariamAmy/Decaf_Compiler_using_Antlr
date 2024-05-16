import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception{
        //String s = ";

        // Instantiate the lexer
        //DecafLexer lexer = new DecafLexer(CharStreams.fromString(s));
        ANTLRInputStream input = new ANTLRFileStream("/home/mariam/year 4/year 4 sem 2/Compilers/Lab/Project/PA_2/file");
        DecafLexer lexer = new DecafLexer(input);
        // Print tokens
        Token token;
        do {
            token = lexer.nextToken();
            String tokenName = DecafLexer.VOCABULARY.getSymbolicName(token.getType());
            if (tokenName != null && !tokenName.equals("WhiteSpace") && !tokenName.equals("COMMENT") && !tokenName.equals("LineComment")) {
                System.out.println(tokenName + ": " + token.getText());
            }
        } while (token.getType() != Token.EOF);

        // Reset lexer for parser
        lexer.reset();

        // Instantiate the parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DecafParser parser = new DecafParser(tokens);

        // Parse the input string starting from the 'program' rule
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);
    }
}