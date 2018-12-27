/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android27_lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class EmployeeManager {
    ArrayList<EmployeeModel> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }
    
    //them moi nv
    public void addEmployee(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Vui long nhap thong tin nv");
        System.out.println("Id: ");
        String id = scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Address:");
        String address = scanner.nextLine();
        System.out.println("Phone:");
        String phone = scanner.nextLine();
        System.out.println("Salary:");
        float salary = scanner.nextFloat();
        
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setId(id);
        employeeModel.setName(name);
        employeeModel.setAddress(address);
        employeeModel.setPhone(phone);
        employeeModel.setSalary(salary);
        
        employees.add(employeeModel);
    }
    
    public boolean deleteEmployee(String id){
      int deleteIndex = this.findEmployeeById(id);
      if(deleteIndex>-1){
         this.employees.remove(deleteIndex);
         //xoa duơc
         return true;
      }
      //ko xoa duoc
      return false;
    }
    
    public int findEmployeeById(String id){
        for (int i = 0; i < this.employees.size(); i++) {
            if(this.employees.get(i).getId().equals(id)){
               //trong truong hop tim thay
               return i;
            }
        }
        //trong truong hop ko tim thay
        return -1;
    }
    
    public void listEmployee(){
        for (EmployeeModel employee : employees) {
            System.out.println("----------------------");
            System.out.println("ID."+employee.getId());
            System.out.println("Name."+employee.getName());
            System.out.println("Address."+employee.getAddress());
            System.out.println("Phone."+employee.getPhone());
            System.out.println("Salary."+employee.getSalary());
            System.out.println("----------------------");
        }
    }
    
    public boolean updateEmployee(String id){
       int updateIndex = this.findEmployeeById(id);
       if(updateIndex>-1){
          Scanner scanner = new Scanner(System.in);
          
          System.out.println("New Name");
          String name = scanner.nextLine();
          
          System.out.println("New Address");
          String address = scanner.nextLine();
          
          System.out.println("New Phone");
          String phone =scanner.nextLine();
          
          System.out.println("New Salary");
          float salary = scanner.nextFloat();
          
          this.employees.get(updateIndex).setAddress(address);
          this.employees.get(updateIndex).setPhone(phone);
          this.employees.get(updateIndex).setSalary(salary);
          this.employees.get(updateIndex).setName(name);
          //neu update thanh cong
          return true;
       }
       
       //new update loi
       return false;
    }

    public ArrayList<EmployeeModel> getEmployees() {
        return employees;
    }    
}
