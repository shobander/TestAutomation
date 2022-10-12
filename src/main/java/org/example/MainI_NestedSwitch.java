package org.example;

public class MainI_NestedSwitch {
    public String DisplayDayOfTheWeek(int x) {
        return switch (x) {
            case 1 -> ("Sunday");
            case 2 -> ("Monday");
            case 3 -> ("Tuesday");
            case 4 -> ("Wednesday");
            case 5 -> ("Thursday");
            case 6 -> ("Friday");
            case 7 -> ("Saturday");
            default -> ("Please enter a number from 1 to 7");
        };
    }

    public static void main(String[] args) {
            MainI_NestedSwitch mainI_nestedSwitch = new MainI_NestedSwitch();
        System.out.println(mainI_nestedSwitch.DisplayDayOfTheWeek(6));
        }
}

