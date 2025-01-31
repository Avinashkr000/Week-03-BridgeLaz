import static com.Day02.stacksandqueus.circulartourproblem.CircularTourProblem.findStartingPoint;

public static void main(String[] args) {
    int[] petrol = {4, 6, 7, 4};
    int[] distance = {6, 5, 3, 5};

    int start = findStartingPoint(petrol, distance);

    if (start != -1) {
        System.out.println("Starting point for the circular tour: " + start);
    } else {
        System.out.println("No valid starting point exists.");
    }
}

