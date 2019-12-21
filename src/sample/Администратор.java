package sample;

import java.util.List;

public class Администратор {
    private Магазин аМагазин = new Магазин();
    Товар t = new Товар();
    int price;
    String name;
    String info;

    public void ДобавитьТовар(){}
    /*
    public List<Товар> getСписокТоваров() {
        return СписокТоваров;
    }
    */
    public void РедактироватьТовар(Товар t){
        t.setНазвание(name);
        t.setЦена(price);
        t.setинформация(info);
    }
    public void УдалитьТовар(Товар t){
        УдалитьТовар(t);
    }
}
