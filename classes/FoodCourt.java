package classes;
import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations
{
    private Restaurant restaurant[] = new Restaurant[500];
    private Employee employees[] = new Employee[100];

    public boolean insertRestaurant(Restaurant r) {
        boolean flag = false;
        for (int i = 0; i < restaurant.length; i++) {
            if (restaurant[i] == null) {
                restaurant[i] = r;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean removeRestaurant(Restaurant r) {
        boolean flag = false;
        for (int i = 0; i < restaurant.length; i++) {
            if (restaurant[i] == r) {
                restaurant[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void showAllRestaurants() {
        for (int i = 0; i < restaurant.length; i++) {
            if (restaurant[i] != null) {
                System.out.println("**********************************");
                System.out.println("Restaurant Name: " + restaurant[i].getName());
                System.out.println("Restaurant RID: " + restaurant[i].getRid());
                System.out.println("----------------------------------");
                //restaurant[i].showAllRestaurant();
                //System.out.println("----------------------------------");
            }
        }
    }

    public Restaurant searchRestaurant(String rid) {
        Restaurant r = null;

        for (int i = 0; i < restaurant.length; i++) {
            if (restaurant[i] != null) {
                if (restaurant[i].getRid().equals(rid)) {
                    r = restaurant[i];
                    break;
                }
            }
        }
        return r;
    }

    public boolean insertEmployee(Employee e) {
        boolean flag = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = e;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean removeEmployee(Employee e) {
        boolean flag = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == e) {
                employees[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void showAllEmployees() {
        System.out.println("//////////////////////////////////");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Employee Name: " + employees[i].getName());
                System.out.println("Employee ID: " + employees[i].getEmpId());
                System.out.println("Salary: " + employees[i].getSalary());
                System.out.println();
            }
        }
        System.out.println("//////////////////////////////////");
    }

    public Employee searchEmployee(String empId) {
        Employee e = null;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getEmpId().equals(empId)) {
                    e = employees[i];
                    break;
                }
            }
        }
        return e;
    }
}