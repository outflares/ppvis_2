package sample;

public class Продавец {
    private int Сдача;
    private int СуммаПолученныхДенег;

    public int ПодсчитатьОбщуюСумму(){
        return СуммаПолученныхДенег;
    }
    public int ПолучитьДеньги(){
        return СуммаПолученныхДенег;
    }
    public void ПолучитьКарточку(ПластиковаяКарточка k){
        k.getПинкод();
    }
}
