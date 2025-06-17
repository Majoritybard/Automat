import utils.*;
public class Token {
    private  String wert;

    private String typ;

    Token(String pWert, String pTyp){
    pWert=this.wert;
    pTyp=this.typ;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getWert() {
        return wert;
    }

    public void setWert(String wert) {
        this.wert = wert;
    }
}
