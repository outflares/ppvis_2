package sample;

import java.util.List;

public class Покупатель {
    Товар t = new Товар();
    ПластиковаяКарточка аКарточка = new ПластиковаяКарточка();
    Корзина аКорзина = new Корзина();
    Магазин аМагазин = new Магазин();
    private int Деньги;


    public String ВернутьКарточку(ПластиковаяКарточка аКарточка){
        return аКарточка.getПинкод();
    }

    /*
    public List ВернутьКорзину(Корзина аКорзина){

    }
    */

    private void ВзятьКорзину(){}

    private String ВыбратьТоварИзАссортимента(Товар t){
        return t.getНазвание();
    }

    private void ВыложитьТоварИзКорзины(Корзина аКорзина){
        аКорзина.УдалитьТовар();
    }

    private void ДобавитьТоварВКорзину(Корзина аКорзина){
        аКорзина.ЗаписатьТовар();
    }

    private void ОплатитьКарточкой(){}

    public void ОплатитьНаличными(){}

    public void ПолучитьСдачу(){}

    private void ПросмотретьИнформациюОТоваре(Товар t){
        t.getинформация();
    }
}
