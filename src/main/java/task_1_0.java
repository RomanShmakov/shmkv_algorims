public class task_1_0 {

    public void binary_search() {

        List<Integer> my_list = Arrays.asList(1, 3, 5, 7, 9);
        int item = 5;

        int low = 0;
        int high = my_list.size() - 1;
        int result = -1;
        int mid;
        int guess;
        while (low <= high) {
            mid = (low + high) / 2;
            guess = my_list.get(mid);
            if (guess == item) {
                result = mid;
                break;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (result >= 0) {
            System.out.println("list[" + result + "]:" + item);
        } else {
            System.out.println("NO NUMBER");

        }

    }

}
