package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    Calculation calculation = new Calculation(2000, "kr", true);

    @Test
    public void getSalary() throws Exception {

        assertEquals(calculation.getSalary(), 2000);
    }

    @Test
    void getUnit() {
        assertEquals(calculation.getUnit(), "kr");
    }

    @Test
    void getNegative() {
        assertEquals(calculation.getIsNegative(), true);
    }

    @Test
    void setSalary() {
    }

    @Test
    void setUnit() {
    }

    @Test
    void setIsNegative() {
    }

    @Test
    void testGetSalary() {
    }

    @Test
    void testGetUnit() {
    }

    @Test
    void getIsNegative() {
    }

    @Test
    void addSalary() {
    }

    @Test
    void addStringToUnit() {
    }
}