package sample;

import java.util.List;

public class Склад {
    private List<Товар> СписокТоваровВНаличии;

    public List<Товар> getСписокТоваровНаСкладе() {
        return СписокТоваровВНаличии;
    }
    public void ДобавитьТоварНаСклад(Товар t){}
    public void УдалитьТоварСоСклада(Товар t){}
}
