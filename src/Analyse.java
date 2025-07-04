import utils.*;
public class Analyse {
    private String eingabe;
    private List<Token> Tokenliste;
    private Scanner scanner;
    private Parser parser;


    public Analyse(String eingabe) {
        this.eingabe = eingabe;
        Tokenliste=new List<>();
        scanner=new Scanner(eingabe,Tokenliste);
        parser=new Parser(scanner.getTokenliste());
        analysieren();
    }

    public void analysieren(){
    scanner.scanne();
    if (!Tokenliste.isEmpty()){
        parser=new Parser(scanner.getTokenliste());
        parser.parse();
    }
    }
}
