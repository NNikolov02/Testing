package Notepad;


import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class NotePad implements INotePad{
    String Titel;
    String Text;

    public NotePad(String Titel,String Text){
        this.Text = Text;
        this.Titel = Titel;
    }
    public String add(){
        return null;
    }
    public String delete(){
        return null;
    }
    public void print(){

    }

}
