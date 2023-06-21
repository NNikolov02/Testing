package bank;

import java.util.ArrayList;

public class Bank {

    ArrayList<Accaunt> accaunts = new ArrayList<>();

    public void add(Accaunt accaunt){
        accaunts.add(accaunt);

    }
    public void remove(Accaunt accaunt){
        accaunts.remove(accaunt);
    }
}
