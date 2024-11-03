package Solutions;

public class TVShowRatings
{
    // Array to store the names of the TV shows
    private static final String[] showNames = {"Big Bang Theory", "Scandal", "Modern Family", "Dexter", "Grand Designs"};

    // 2D Array to store ratings for each show
    private static final int[][] ratings = {
            {9, 8, 5},
            {7, 5, 5},
            {8, 8, 8},
            {10, 7, 8},
            {3, 1, 5}
    };

    // Main method
    public static void main(String[] args)
    {
        try
        {
            calculateAndDisplayRatings();
        }
        catch (Exception e)
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Method to calculate the average ratings and determine continuation
    private static void calculateAndDisplayRatings()
    {
        System.out.printf("%-20s %-10s %-10s%n", "TV SHOW", "RATING", "SERIES CONTINUATION");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < showNames.length; i++)
        {
            try
            {
                int totalRating = 0;

                // Calculate total rating for current show
                for (int j = 0; j < ratings[i].length; j++)
                {
                    totalRating += ratings[i][j];
                }

                // Calculate average rating as an integer
                int averageRating = totalRating / ratings[i].length;

                // Determine if the show will continue based on average rating
                String continuation = (averageRating >= 7) ? "Yes" : "No";

                // Display formatted output
                System.out.printf("%-20s %-10d %-10s%n", showNames[i], averageRating, continuation);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Error calculating average for " + showNames[i] + ": " + e.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Error accessing ratings for " + showNames[i] + ": " + e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("An unexpected error occurred for " + showNames[i] + ": " + e.getMessage());
            }
        }
        
        System.out.println("\n");
    }
}
