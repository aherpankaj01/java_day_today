class pattern09 {
    public static void main(String[] args) {

        int rows = 8;

        for(int i = 1; i <= rows; i++) {

            if(i <= rows/2) {

                for(int j = 1; j <= rows - i; j++) {
                    System.out.print("*");
                }

                for(int j = 1; j <= 2*i - 1; j++) {
                    System.out.print("-");
                }

                for(int j = 1; j <= rows - i; j++) {
                    System.out.print("*");
                }

            } 
            else {

                int k = rows - i + 1;

                for(int j = 1; j <= rows - k; j++) {
                    System.out.print("*");
                }

                for(int j = 1; j <= 2*k - 1; j++) {
                    System.out.print("-");
                }

                for(int j = 1; j <= rows - k; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}