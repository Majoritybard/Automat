import utils.List;

public class Parser {
    private Token akutellesToken;
    private boolean fehler;
    private List<Token> Tokenliste;
    public Parser(List pTokenliste){
        this.Tokenliste=pTokenliste;
        
    }
    public Token nextToken(){
        Tokenliste.next();
        Token S=Tokenliste.getContent();
        return S;
    }
    public boolean parse(){
        if (Tokenliste.hasAccess() && pruefeS()){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean pruefeS(){
        if (Tokenliste.getContent().equals("la")||Tokenliste.getContent().equals("le")||Tokenliste.getContent().equals("lu")){
            Tokenliste.next();
            return pruefeA();
        }
        System.out.println("Das Element '"+ Tokenliste.getContent()+"' an der Stelle "+Tokenliste.getContent()+" ist nicht korrekt. Erwartet 'la','le' oder 'lu'");
        fehler=false;
        return false;
    }
    public boolean pruefeA(){
        if (Tokenliste.getContent().equals("la")||Tokenliste.getContent().equals("le")||Tokenliste.getContent().equals("lu")){
            Tokenliste.next();
            return pruefeB();
        }
        System.out.println("Das Element '"+ Tokenliste.getContent()+"' an der Stelle "+Tokenliste.getContent()+" ist nicht korrekt. Erwartet 'la','le' oder 'lu'");
        fehler=false;
        return false;
    }


    public boolean pruefeB(){
        if (Tokenliste.getContent().equals("lu") && this.nextToken()==null){
            return true;
        }
        if (!Tokenliste.getContent().equals("lu")){
            System.out.println("Das Element '" + Tokenliste.getContent().getWert() + "' an der Stelle " + Tokenliste.getContent().getTyp() + " ist nicht korrekt. Erwartet 'lu'");
        }else{
            System.out.println("Das Element '" + nextToken().getWert() + "' an der Stelle 4 ist nicht korrekt. Erwartet null");
        }
        fehler=false;
        return false;
    }
}
