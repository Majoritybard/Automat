public class Parser {

    public Parser(){

    }
    public boolean parse(){
        if (tokenliste.hasAcess() && pruefeS()){
            return true;
        }
        else {
            return false;
        }
    }
}
