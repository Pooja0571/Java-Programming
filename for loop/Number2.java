class Number2 {
    public static void main(String[] args) {

        int n = 5;
        int count = 1;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {

                if (count < 10) {
                    System.out.print("0" + count + " ");
                } else {
                    System.out.print(count + " ");
                }

                count++;
            }

            System.out.println();
        }
    }
}