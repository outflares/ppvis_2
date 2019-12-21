package sample;

import java.util.List;

public class Администратор {
    private Магазин аМагазин = new Магазин();
    int price;
    String name;
    String info;
    private List<Товар> СписокТоваров;

    public void ДобавитьТовар(){}

    public List<Товар> getСписокТоваров() {
        return СписокТоваров;
    }

    public void РедактироватьТовар(Товар t){
        t.setНазвание(name);
        t.setЦена(price);
        t.setинформация(info);
    }
    public void УдалитьТовар(Товар t){}
}
