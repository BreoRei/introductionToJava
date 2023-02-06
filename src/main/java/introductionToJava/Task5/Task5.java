package introductionToJava.Task5;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {

//      Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> hashMap = new HashMap<>();

//      Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        hashMap.putIfAbsent(0, "красный");
        hashMap.putIfAbsent(1, "черный");
        hashMap.putIfAbsent(2, "белый");

//      Изменить значения дописав восклицательные знаки.
        for (int tmp: hashMap.keySet()) {
            hashMap.compute(tmp, (k, v) -> v = v.concat("!"));
        }

//      *Создать TreeMap, заполнить аналогично.
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.putAll(hashMap);

//      *Увеличить количество элементов до 1000 случайными ключами и общей строкой.
        String str = "ораньжевый";
        while (treeMap.size()<1000) {
            int i = new Random().nextInt(hashMap.size(), Short.MAX_VALUE);
            treeMap.putIfAbsent(i, str);
        }

//      **Сравнить время последовательного и случайного перебора тысячи элементов словарей.
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            hashMap1.put(i, str);
        }
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.putAll(hashMap1);

        long startHashMap = System.currentTimeMillis();
        for (int i = 0; i < hashMap1.size(); i++) {
            String strHashMap = hashMap1.get(i);
        }
        long endHashMap = System.currentTimeMillis();

        long startTreeMap = System.currentTimeMillis();
        for (int i = 0; i < treeMap1.size(); i++) {
            String strTreeMap = treeMap1.get(i);
        }
        long endTreeMap = System.currentTimeMillis();

        System.out.println(endHashMap-startHashMap);
        System.out.println(endTreeMap-startTreeMap);

    }
}
