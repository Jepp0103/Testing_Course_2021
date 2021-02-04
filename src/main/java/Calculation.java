package main.java;

public class Calculation {
    private int salary;
    private String unit;
    private Boolean isNegative;

    public Calculation (int salary, String unit, Boolean isNegative) {
        this.salary = salary;
        this.unit = unit;
        this.isNegative = isNegative;
    }
    public int getSalary() {
        return salary;
    }

    public String getUnit() {
        return unit;
    }

    public Boolean getIsNegative() {
        return isNegative;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setUnit(String newUnit) {
        unit = newUnit;
    }

    public void setIsNegative(Boolean bool) {
        isNegative = bool;
    }

    public int addSalary(int addedSalary) {
        salary += addedSalary;
        return salary;
    }

    public String addStringToUnit(String string) {
        return unit + " " + string;
    }
}
