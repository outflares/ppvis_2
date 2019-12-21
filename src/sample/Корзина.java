package sample;

import java.util.List;

public class Корзина<Товар> {
    private List<Товар> СписокТоваров;

    public List<Товар> getСписокТоваров() {
        return СписокТоваров;
    }
    public void ЗаписатьТовар(Товар t){}
    public void УдалитьТовар(Товар t){}
}
