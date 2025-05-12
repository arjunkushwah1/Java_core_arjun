package collection_worksheet_2.Q8_employee_hierarchy_system;

import java.util.*;

public class EmployeeHierarchy
{
    Map<String, TreeMap<String, List<Employee>>> map=new HashMap<>();
    public void addEmployee(String managerName,String level, Employee emp)
    {
        TreeMap<String,List<Employee>> levelmap = map.get(managerName);
        if(levelmap==null)
        {
            levelmap=new TreeMap<>();
            map.put(managerName,levelmap);
        }
        List<Employee> empList = levelmap.get(level);
        if (empList == null) {
            empList = new ArrayList<>();
            levelmap.put(level, empList);
        }
        empList.add(emp);
    }
    public void displayHierarchy() {
        for (String manager : map.keySet()) {
            System.out.println("Manager: " + manager);
            TreeMap<String, List<Employee>> levelMap = map.get(manager);
            for (String level : levelMap.keySet()) {
                System.out.println("  Level: " + level);
                for (Employee e : levelMap.get(level)) {
                    System.out.println("    " + e);
                }
            }
            System.out.println();
        }
    }
}
