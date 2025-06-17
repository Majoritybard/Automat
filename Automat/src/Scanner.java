import java.util.List;
import utils.*;
public class Scanner {
    private boolean fehler;
    private String eingabe;

    Scanner(String pEingabe){
   pEingabe=this.eingabe;

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
    }
}
