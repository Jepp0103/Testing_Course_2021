package main.java.tarok;

public class Cup {
    private int points;
    private String playerName;
    // protected int cup2;
    // protected int cup3;

    public Cup(String playerName, int points) {
          this.points = points;
          this.playerName = playerName;
//        this.cup2 = 0;
//        this.cup3 = 0;
    }

    public int updateCupPoints(String pointAnnouncement, int extraTarotsAmount, int extraMatadorsAmount) {
        if (pointAnnouncement == "10 tarots" && extraTarotsAmount > 0 && extraTarotsAmount <= 12) {
            points += 10 + (5 * extraTarotsAmount);
        } else if (pointAnnouncement == "10 tarots") {
            points += 10;
            System.out.println(("10 tarots = 10 points added to"));
        } else if (pointAnnouncement == "3 matadors" && extraMatadorsAmount > 0 && extraMatadorsAmount <= 12) {
            points += 10 + (5 * extraTarotsAmount);
        } else if (pointAnnouncement == "half kings" || pointAnnouncement == "half cavalry"){
            points += 5;
        } else if (pointAnnouncement == "full kings" || pointAnnouncement == "full cavalry"){
            points += 10;
        } else if (pointAnnouncement == "overfull kings" || pointAnnouncement == "overfull cavalry"){
            points += 15;
        } else {
            System.out.println(("Couldnt add points due to invalid input"));
        }
        return points;
    }

}
