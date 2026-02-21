// User-defined exception
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class lab6q5 {
    public static void main(String[] args) {
        try {
            // Check if arguments are less than 4
            if (args.length < 4) {
                throw new CheckArgument("CheckArgument");
            }

            int sum = 0;

            // Take only first 4 arguments
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;  // square and add
            }

            System.out.println(sum);

        } catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}

