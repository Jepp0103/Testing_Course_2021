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

    @Test
    void updateCupPointsHalfKings() {
        //Act
        cup.updateCupPoints("half kings", 2, 4); //Testing if extra tarots or matadors can be added
        //Assert
        assertEquals(5, cup.getPoints());
    }

    @Test
    void updateCupPointsHalfCavalry() {
        //Act
        cup.updateCupPoints("half cavalry", 2, 4); //Testing if extra tarots or matadors can be added
        //Assert
        assertEquals(5, cup.getPoints());
    }

    @Test
    void updateCupPointsFullKings() {
        //Act
        cup.updateCupPoints("full kings", 2, 4); //Testing if extra tarots or matadors can be added
        //Assert
        assertEquals(10, cup.getPoints());
    }

    @Test
    void updateCupPointsFullCavalry() {
        //Act
        cup.updateCupPoints("full cavalry", 2, 4); //Testing if extra tarots or matadors can be added
        //Assert
        assertEquals(10, cup.getPoints());
    }

    @Test
    void updateCupPointsOverFullKings() {
        //Act
        cup.updateCupPoints("overfull kings", 2, 4); //Testing if extra tarots or matadors can be added
        //Assert
        assertEquals(15, cup.getPoints());
    }

    @Test
    void updateCupPointsOverFullCavalry() {
        //Act
        cup.updateCupPoints("overfull cavalry", 2, 4); //Testing if extra tarots or matadors can be added
        //Assert
        assertEquals(15, cup.getPoints());
    }
}