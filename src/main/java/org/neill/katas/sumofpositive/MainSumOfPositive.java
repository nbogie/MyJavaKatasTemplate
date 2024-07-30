package org.neill.katas.sumofpositive;

/**
 * @see <a href="https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java">Sum Of Positive (Codewars)</a>
 */
public class MainSumOfPositive {
    private MainSumOfPositive() {

    }
    public static int sum(int[] arr){
        int runningTotal = 0;
        for (int x: arr){
            if (x > 0){
                runningTotal += x;
            }
        }
        return runningTotal;
    }
}
