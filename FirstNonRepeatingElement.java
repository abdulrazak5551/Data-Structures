FirstNonRepeating.java

    public static int findFirstNonRepeating(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 3, 5, 5, 6, 6, 7, 7};

        System.out.println(findFirstNonRepeating(arr));
    }
}
