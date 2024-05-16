import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        String s = "class Program {\n" +
                "  int abs(int a) {\n" +
                "    int b;\n" +
                "    if (a < 0) {\n" +
                "      b = -a;\n" +
                "    }\n" +
                "    else {\n" +
                "      b = a;\n" +
                "    }\n" +
                "\n" +
                "    return b;\n" +
                "  }\n" +
                "\n" +
                "  int main() {\n" +
                "    return abs(-2);\n" +
                "  }\n" +
                "}";

        // Instantiate the lexer
        DecafLexer lexer = new DecafLexer(CharStreams.fromString(s));

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