package main.java.tarok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    //Arrange
    Cup cup = new Cup("Jeppe", 0);
    @Test
    void getPoints() {
        assertEquals(0, cup.getPoints());
    }

    @Test
    void getPlayerName() {
        assertEquals("Jeppe", cup.getPlayerName());
    }

    @Test
    void updateCupPointsTenTarotsAndExtraTarotsAmount() {
        cup.updateCupPoints("10 tarots", 3, 0);
        assertEquals(25, cup.getPoints());
    }

    @Test
    void updateCupPointsTenTarots() {
        //Act
        cup.updateCupPoints("10 tarots", 0, 0);
        //Assert
        assertEquals(10, cup.getPoints());
    }

    @Test
    void updateCupPointsThreeMatadorsAndExtraMatadors() {
        //Act
        cup.updateCupPoints("3 matadors", 0, 4);
        //Assert
        assertEquals(30, cup.getPoints());
    }

}