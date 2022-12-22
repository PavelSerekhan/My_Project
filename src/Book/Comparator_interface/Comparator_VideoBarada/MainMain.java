package Book.Comparator_interface.Comparator_VideoBarada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainMain {
    public static void main(String[] args) {
        ArrayList<CountSortObjects> workerList = new ArrayList<>();

        workerList.add(new CountSortObjects(123,"Андюк Иван Васильевич", + 2343321, 3));
        workerList.add(new CountSortObjects(153,"Качко Игорь Олегович", + 4433321, 4));
        workerList.add(new CountSortObjects(251,"Янус Леха Минусович", + 3435529, 5));
        workerList.add(new CountSortObjects(444,"Плюс Валера Замыкание", + 664477, 7));
        workerList.add(new CountSortObjects(444,"Халява Просто Толик", + 664477, 3));

        Collections.sort(workerList, new Comparator<CountSortObjects>() {
            @Override
            public int compare(CountSortObjects o1, CountSortObjects o2) {
//                return o1.getName().compareTo(o2.getName()); //по алфавиту
//                return o1.getQualification() - o2.getQualification(); // по возрастанию

                int result = o1.getQualification() - o2.getQualification();
                if (result == 0){
                    return o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });

        for (CountSortObjects worker : workerList){
            System.out.println(worker);
        }
    }
}
