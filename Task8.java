public class Task8 {
    public static void main(String[] args) {
        VariableArguments obj = new VariableArguments();

        int totalSum = obj.sumAll(4,5,10);
        System.out.println("Sum of all Parameters: " + totalSum);

        VariableArguments.cumulativeSum(4, 5, 10);

    }
}

class VariableArguments{

    int sumAll(int... numbers){
        int total = 0;

        for (int n : numbers){
            total += n;
        }
        return total;
    }

    static void cumulativeSum(int... numbers){
        for(int n : numbers){
            int total = 0;
            for(int i = 0; i <= n; i++){
                total += i;
            }
            System.out.println("Cumulative Sum of " + n + " = " + total);
        }
    }

}