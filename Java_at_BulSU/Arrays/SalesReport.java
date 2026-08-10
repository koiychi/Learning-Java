
class SalesReport {
    public static void main (String Koi[]) {
        int sales[][] {
            {1200, 1500, 1700},
            {1000, 1100, 1300},
            {900, 1200, 1600}
        };

        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; i++) {
                total += sales[i][j];
            }      
            System.out.println("Total sales for store: " + (i+1));      
        }
    }
}
