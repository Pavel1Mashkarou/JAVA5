import java.util.*;

public class PhoneBook {
    static void AddContact(String name, String phone, Map<String,ArrayList<String>>map){
        if (map.containsKey(name)){
            map.get(name).add(phone);
        }
        else {
            ArrayList<String> list = new ArrayList<>();
            list.add(phone);
            map.put(name,list);
        }
    }
    static void printContact(Map<String,ArrayList<String>> map){
        int maxSize = 0;
        for (ArrayList<String> list  :map.values()){
            if (list.size()>=maxSize){
                maxSize = list.size();
            }
        }
        for (int i =maxSize;i>0;i--){
            for (Map.Entry<String,ArrayList<String>> list : map.entrySet()){
                if (list.getValue().size()==i){
                    System.out.println(list.getKey()+" "+list.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        AddContact("Лапин Лавр Никитевич", "3(5635)411-58-84", map);
        AddContact("Терентьев Валентин Иосифович", "7(51)495-83-34", map);
        AddContact("Тест", "3(5635)421-58-84", map);
        AddContact("Тетерин Исаак Эдуардович", "9(4389)149-66-01", map);
        AddContact("Калинин Рудольф Валерьянович", "96(6628)772-61-61", map);
        AddContact("Голубева Тамара Феликсовна", "5(68)670-06-76", map);
        AddContact("Тест", "3(5635)421-25-84", map);
        AddContact("Лапина Юзефа Прокловна", "926(932)199-91-50", map);
        AddContact("Голубева Тамара Феликсовна", "632(0066)765-43-23", map);
        AddContact("Сафонова Ариадна Ярославовна", "89(226)162-21-39", map);
        AddContact("Лапина Юзефа Прокловна", "715(2131)063-39-79", map);
        AddContact("Тест", "3(5635)421-58-77", map);
        AddContact("Сафонова Ариадна Ярославовна", "740(0307)280-17-73", map);
        AddContact("Калинин Рудольф Валерьянович", "046(1656)674-79-34", map);
        AddContact("Сафонова Ариадна Ярославовна", "058(6002)004-79-41", map);
        AddContact("Тест", "3(5635)421-63-84", map);
        AddContact("Лапин Лавр Никитевич", "22(88)461-25-56", map);
        AddContact("Тетерин Исаак Эдуардович", "61(57)693-60-73", map);

        printContact(map);

    }
}
