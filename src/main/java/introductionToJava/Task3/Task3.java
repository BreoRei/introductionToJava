package introductionToJava.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class Task3 {
    public static void main(String[] args) {

//      Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> ArrList = new ArrayList<>();
        ArrList.add("белый");
        ArrList.add("красный");
        ArrList.add("чёрный");
        ArrList.add("синий");
        ArrList.add("оранжевый");
        System.out.println(ArrList);

//      Итерация всех элементов списка и добавления к каждому символа '!'.
        ListIterator<String> listIterator = ArrList.listIterator();
        while ((listIterator.hasNext())) {
            String str = listIterator.next().concat("!");
            listIterator.remove();
            listIterator.add(str);
        }
        System.out.println(ArrList);

//      Вставить элемент в список в первой позиции.
        ArrList.add(0, "золотой");

//      Извлечь (3) элемент из заданного списка.
        System.out.println(ArrList.get(3));

//      Обновить определенный элемент списка по заданному индексу (3).
        ArrList.set(3, "серый");

//      Удалить третий элемент из списка.
        ArrList.remove(3);

//      Поиска элемента в списке по строке.
        ListIterator<String> lstIter = ArrList.listIterator();
        String iterStr = "жев";
        while ((lstIter.hasNext())) {
            String str = lstIter.next();
            if (str.contains(iterStr)) {
                System.out.printf("Найденый по строке '%s' элемент '%s' есть в списке %s\n", iterStr, str, ArrList);
            }
        }

//      Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> ArrListNew = new ArrayList<>();
        for (int i = 0; i < ArrList.size(); i++) {
            if (i % 2 == 0){
                ArrListNew.add(ArrList.get(i));
            }
        }
        System.out.println(ArrListNew);

//      Удалить из первого списка все элементы отсутствующие во втором списке.
        ArrList.retainAll(ArrListNew);

    }
}
