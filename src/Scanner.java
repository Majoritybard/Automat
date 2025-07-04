import utils.*;

public class Scanner {
    private boolean fehler;
    private String eingabe;
    public Token aktuellesToken;
    private List Tokenliste;
    public Scanner(String pEingabe, List <Token> pTokenliste){
        this.eingabe=pEingabe;
   Tokenliste.append(pTokenliste);

    }

    public void scanne(){
        char erster,zweiter;
        int pos=0;
        while (eingabe.charAt(pos)!='#'){
            erster = eingabe.charAt(pos);
            zweiter = eingabe.charAt(pos+1);
            if (erster =='l' && zweiter== 'a'){
                aktuellesToken= new Token("Egal","la");
            }
            if (erster =='l' && zweiter== 'e'){
                aktuellesToken= new Token("Egal","le");
            }
            if (erster =='l' && zweiter== 'u'){
                aktuellesToken= new Token("Ende","lu");
            }
            else{
                fehler=true;
            }
        }
        pos=pos+2;
        Tokenliste.append(aktuellesToken);
        }

        public List<Token> getTokenliste(){
        if (fehler=false){
            return Tokenliste;
        }
        else {
            return null;
        }
        }

    }

