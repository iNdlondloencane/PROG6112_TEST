public class Question1 {

    public static void main(String[] args) {

        // arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        int[][] sales = {{1000, 2000, 3000},
                         {2000, 3000, 4000},
                         {1500, 1100, 1200}};
        int[] totals = new int[3];

        // work out the total for each city
        for (int i = 0; i < 3; i++) {
            totals[i] = sales[i][0] + sales[i][1] + sales[i][2];
        }

        // print the report
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------");
        System.out.println("\t\t\t" + consoles[0] + "\t" + consoles[1] + "\t" + consoles[2]);

        for (int i = 0; i < 3; i++) {
            System.out.print(cities[i] + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(sales[i][j] + "\t");
            }
            System.out.println();
        }

        // print the totals
        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println(cities[i] + "\t" + totals[i]);
        }

        // find the city with the most sales
        int max = 0;
        for (int i = 1; i < 3; i++) {
            if (totals[i] > totals[max]) {
                max = i;
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[max]);
    }
}
