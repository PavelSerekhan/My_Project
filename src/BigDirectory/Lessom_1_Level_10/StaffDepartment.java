package Lessom_1_Level_10;

import java.util.HashMap;
import java.util.Map;

public class StaffDepartment {
    private Map<String, Employee> currentEmployees = new HashMap<>();

    public Employee receiveEmployee(String type) throws Exception {
        Employee result;
        if (currentEmployees.containsKey(type)) {
            result = currentEmployees.get(type);
        } else {
            switch (type) {
                case "Бухгалтер":
                    result = new Accountant();
                    currentEmployees.put(type, result);
                    break;
                case "Юрист":
                    result = new Lawyer();
                    currentEmployees.put(type, result);
                    break;
                default:
                    throw new Exception("Данный сотрудник в штате не предусмотрен!");
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception{
        StaffDepartment staffDepartment = new StaffDepartment();
        Employee empl1 = staffDepartment.receiveEmployee("Юрист");
        empl1.work();
        Employee empl2  = staffDepartment.receiveEmployee("Бухгалтер");
        empl2.work();
        Employee empl3  = staffDepartment.receiveEmployee("Юрист");
        empl1.work();
        Employee empl4  = staffDepartment.receiveEmployee("Бухгалтер");
        empl2.work();
        Employee empl5  = staffDepartment.receiveEmployee("Юрист");
        empl1.work();
        Employee empl6  = staffDepartment.receiveEmployee("Бухгалтер");
        empl2.work();
        Employee empl7  = staffDepartment.receiveEmployee("Юрист");
        empl1.work();
        Employee empl8  = staffDepartment.receiveEmployee("Бухгалтер");
        empl2.work();
        Employee empl9  = staffDepartment.receiveEmployee("Юрист");
        empl1.work();
        Employee empl10  = staffDepartment.receiveEmployee("Бухгалтер");
        empl2.work();

    }


}
