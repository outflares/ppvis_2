package sample;

public class Покупатель {
    Товар t = new Товар();
    PlasticCard аКарточка = new PlasticCard();
    Корзина аКорзина = new Корзина();
    Магазин аМагазин = new Магазин();
    private int Деньги;


    public String ВернутьКарточку(PlasticCard аКарточка){
        return аКарточка.getPIN();
    }

    private void ВзятьКорзину(){}

    private String ВыбратьТоварИзАссортимента(Товар t){
        return t.getНазвание();
    }

    private void ВыложитьТоварИзКорзины(Товар t){
        аКорзина.УдалитьТовар(t);
    }

    private void ДобавитьТоварВКорзину(Товар t){
        аКорзина.ЗаписатьТовар(t);
    }

    private void ОплатитьКарточкой(){}

    public void ОплатитьНаличными(){}

    public void ПолучитьСдачу(){}

    private void ПросмотретьИнформациюОТоваре(Товар t){
        t.getинформация();
    }
}
