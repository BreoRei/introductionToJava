package introductionToJava.Task4;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader reader = null;
        String text = "";

        try{
            fileWriter = new FileWriter("task4.sql");
            fileWriter.append("Домашнее задание номер 4");
            fileWriter.flush();
            reader = new FileReader("task4.sql");
            while (reader.ready()){
                text += (char)reader.read();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(text);

        FileReader reader1 = null;
        String text1 = "";
        try{
            reader1 = new FileReader("data_base.sql");
            while (reader1.ready()) {
                text1 += (char) reader1.read();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(text1);

        String[] str1 = text1.split("\n");
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < str1.length; i++) {
            String[] tmp = str1[i].split(" ");
            surname.add(tmp[0]);
            name.add(tmp[1]);
            patronymic.add(tmp[2]);
            age.add(Integer.parseInt(tmp[3]));
            gender.add(tmp[4].equals("жен") ? true : false);
            ll.add(i);
        }
        for (int i = 0; i < name.size(); i++) {
            System.out.printf("%d. %s %s.%s. %d %s\n",ll.get(i),surname.get(ll.get(i)),name.get(ll.get(i)).charAt(0),patronymic.get(ll.get(i)).charAt(0),
                    age.get(ll.get(i)),gender.get(ll.get(i)).equals(true) ? "Ж" : "М");
        }
        for (int i = 1; i < age.size() ; i++) {
            int current = ll.get(i);
            int j = i-1;
            while (j >= 0 && age.get(current) < age.get(ll.get(j))){
                ll.set(j+1,ll.get(j));
                j -- ;
            }
            ll.set(j+1,current);
        }
        System.out.println();
        for (int i = 0; i < name.size(); i++) {
            System.out.printf("%d. %s %s.%s. %d %s\n",ll.get(i),surname.get(ll.get(i)),name.get(ll.get(i)).charAt(0),patronymic.get(ll.get(i)).charAt(0),
                    age.get(ll.get(i)),gender.get(ll.get(i)).equals(true) ? "Ж" : "М");
        }
    }
}
