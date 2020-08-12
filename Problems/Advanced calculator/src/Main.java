
/* Please, do not rename it */
class Problem {

    public static void main(String args[]) {
        String operator = args[0];
        int sum = 0, max = Integer.parseInt(args[1]), min = Integer.parseInt(args[1]);
        // write your code here
        if (operator.equals("MAX")) {
            for (int i = 2; i < args.length; i++) {
                if (max < Integer.parseInt(args[i]))
                    max = Integer.parseInt(args[i]);
            }
            System.out.println(max);
        } else if (operator.equals("MIN")) {
            for (int i = 2; i < args.length; i++) {
                if (min > Integer.parseInt(args[i]))
                    min = Integer.parseInt(args[i]);
            }
            System.out.println(min);
        } else if (operator.equals("SUM")) {
            for (int i = 1; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println(sum);
        }
    }
}