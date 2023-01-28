// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.Comparator;
// import java.util.Random;

public class task2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add( "Земля");
        list.add( "Марс");
        list.add("Юпитер");
        list.add("Юпитер");
        list.add("Венера");
        list.add("Плутон");
        list.add("Сатурн");
        list.add("Земля");
        list.add("Земля");
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                System.out.print(list.get(i));
                System.out.println(" " + count);
                count = 1;
            }
        }
        System.out.print(list.get(list.size() - 1));
        System.out.println(" " + count);
    }
}
