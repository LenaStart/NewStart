package lesson2;

import java.sql.SQLOutput;

public class SwitchTest {
    public static void main(String[] args) {
        final int SEASON_NUMBER = 3;  //константа
        // coverSeason(3);
        //convertSeasonSwitch(SEASON_NUMBER);
        convertMonthToSeasonAndPrint(SEASON_NUMBER);
    }

   /* private static void convertSeasonSwitch(int seasonNumber) {
        String season = switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "Unknown season";
        };

        System.out.println(season);
    }*/

    public static void convertMonthToSeasonAndPrint (int monthNumber) {
        String season = switch (monthNumber) {
            case 12,1,2 -> "Winter";
            case 3,4,5 -> "Spring";
            case 6,7,8 -> "Summer";
            case 9,10,11 -> "Fall";
            default -> "Unknown season";
        };

        System.out.println(season);
    }

   /* private static void coverSeason(int seasonNumber) {
        String season;
        if (seasonNumber == 1) {
            season = "Winter";
        } else if (seasonNumber == 2) {
            season = "Spring";
        } else if (seasonNumber == 3) {
            season = "Summer";
        } else if (seasonNumber == 4) {
            season = "Fall";
        } else {
            season = "Unknown season";
    }
        System.out.println(season);*/
}
