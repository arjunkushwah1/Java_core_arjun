package collection_worksheet_2.Department_directory_3_map_list;

import java.util.*;

public class EmployeeDirectory {
    Map<String, List<Employee>> edir = new HashMap<>(); //edir =  emplyoee_directory

    public void addEmployee(Employee emp) {
        if (edir.containsKey(emp.getDepartment())) {
            edir.get(emp.getDepartment()).add(emp);
        } else {
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(emp);
            edir.put(emp.getDepartment(), employeeList);
        }
    }


    public void sortEmployeesBySalaryDesc() {
        for (List<Employee> employees : edir.values()) {
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    if (e1.getSalary() > e2.getSalary()) {
                        return -1; // e1 comes before e2
                    } else if (e1.getSalary() < e2.getSalary()) {
                        return 1;  // e2 comes before e1
                    } else {
                        return 0;  // equal salary
                    }
                }
            });
        }
    }

    public void topNEmployee(int n)
    {
        List<Employee> allemp=new ArrayList<>();

        for(List<Employee> e:edir.values())
        {
            allemp.addAll(e);
        }
        Collections.sort(allemp, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return -1;
                } else if (e1.getSalary() < e2.getSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        //return allemp.subList(0, Math.min(n, allemp.size()));
        System.out.print("\n all top "+n+" from all department :- \n");
        for (int i = 0; i < Math.min(n, allemp.size()); i++) {
            System.out.println(allemp.get(i));
        }

    }
}
