/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 17-12-2021
 *   Time: 00:47
 *   File: FractionalKnapsack.java
 */

package dsaLab.greedy;

import java.util.Arrays;

public class FractionalKnapsack {
    private static double getMaxValue(int[] weight, int[] profit, int capacity) {
        ItemProfit[] itemProfit = new ItemProfit[weight.length];
        for (int i = 0; i < weight.length; i++) {
            itemProfit[i] = new ItemProfit(weight[i], profit[i], i);
        }

        Arrays.sort(itemProfit, (o1, o2) -> o2.cost.compareTo(o1.cost));

        double totalProfit = 0d;
        for (ItemProfit i: itemProfit) {
            int currentWeight = (int) i.weight;
            int currentProfit = (int) i.profit;

            if (capacity - currentWeight >= 0) {
                capacity = capacity - currentWeight;
                totalProfit += currentProfit;
            } else {
                double fraction = ((double) capacity / (double) currentWeight);
                totalProfit += (currentProfit*fraction);
                break;
            }
        }
        return totalProfit;
    }

    static class ItemProfit {
        Double cost;
        double weight;
        double profit;
        double ind;

        public ItemProfit(int weight, int value, int ind) {
            this.weight = weight;
            this.profit = value;
            this.ind = ind;
            cost = (double) value / (double) weight;
        }
    }

    public static void main(String[] args) {
        int[] weight = {40, 10, 20, 24};
        int[] profit = {280, 100, 120, 120};
        int capacity = 60;

        double maxValue = getMaxValue(weight, profit, capacity);
        System.out.print("maximum value we can obtained is : " + maxValue);
    }
}