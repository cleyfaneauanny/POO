/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author cleyf
 */
class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    double percentage;
    
    public double netSalary() {
    return grossSalary - tax;
    }
    
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
    }
    
    
    public String toString() {
    return name + ", $ " + String.format("%.2f", netSalary());
    }
    
}
    
}
