package main.java;

import main.java.calculation.Calculation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    Calculation calculation = new Calculation(2000, "kroner", true);

    @Test
    void addSalary() {
        calculation.addSalary(200);
        assertEquals(calculation.getSalary(), 2200);
    }

    @Test
    void testAddStringToUnit() {
        String newString = calculation.addStringToUnit("danish valuta");
        assertEquals(newString, "kr: danish valuta");
    }

    @Test
    public void testGetSalary() throws Exception {
        assertEquals(calculation.getSalary(), 2000);
    }

    @Test
    void testGetUnit() {
        assertEquals(calculation.getUnit(), "kr");
    }

    @Test
    void getIsNegative() {
        assertEquals(calculation.getIsNegative(), true);
    }

    @Test
    void setSalary() {
        calculation.setSalary(3000);
        assertEquals(calculation.getSalary(), 3000);
    }

    @Test
    void setUnit() {
        calculation.setUnit("$");
        assertEquals(calculation.getUnit(), "$");
    }

    @Test
    void setIsNegative() {
        calculation.setIsNegative(false);
        assertEquals(calculation.getIsNegative(), false);
    }
}