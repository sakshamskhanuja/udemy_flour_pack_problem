public class Main {
    public static void main(String[] args) {
        // Checks if 1 big flour bag can carry 4 kg.
        System.out.println(canPack(1, 0, 4));

        // Checks if 1 big flour bag can carry 5 kg.
        System.out.println(canPack(1, 0, 5));

        // Checks if 5 small flour bag can carry 4 kg.
        System.out.println(canPack(0, 5, 4));

        // Checks if 2 big flour and 2 small flour bag can carry 11 kg.
        System.out.println(canPack(2, 2, 11));

        // CChecks if -3 big flour and 2 small flour bag can carry 12 kg.
        System.out.println(canPack(-3, 2, 12));
    }

    /**
     * Checks if bags can carry the goal.
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Checks for invalid value.
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        // Checks if goal can be full-filled by bigCount.
        int bigCarry = bigCount * 5;

        // Checks if bigCount can carry exactly as the goal.
        if (bigCarry == goal) {
            return true;
        } else if (bigCarry > goal) {
            // bigCount can carry more goal.
            int difference = bigCarry - goal;
            if (difference % 5 == 0) {
                // bigCounts bags were fully-filled.
                return true;
            } else {
                // bigCounts bags were not fully-filled. Calculating new bigCarry with 1 less bag.
                bigCarry = (bigCount - 1) * 5;
                int smallBagRequired = goal - bigCarry;

                // Checks if smallCount can fully-fill the goal.
                return (smallCount >= smallBagRequired);
            }
        } else {
            // bigCount cannot fill the goal.
            int smallBagRequired = goal - bigCarry;

            // Checks if smallCount can fully-fill the goal.
            return (smallCount >= smallBagRequired);
        }
    }
}