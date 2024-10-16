public class Main {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


## Example 1:

* Input: prices = [7,1,5,3,6,4]
* Output: 5
* Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
* Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

## Example 2:

* Input: prices = [7,6,4,3,1]
* Output: 0
* Explanation: In this case, no transactions are done and the max profit = 0.

     */


    /*
    TASK-2
    You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

![Sample](Task03.jpg)

## Example 1:
* Input: height = [1,8,6,2,5,4,8,3,7]
* Output: 49
* Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

## Example 2:
* Input: height = [1,1]
* Output: 1
     */
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        int[] heights = new int[]{1,8,6,2,5,4,8,3,7};
        int minHeight = 0;
        int maxWater = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length - 1;
        while(left<right){
            minHeight = Math.min(heights[left], heights[right]);
            maxWater = Math.max(maxWater, minHeight*(right-left));
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxWater);

    }











    private static void findMaxProfit(){
        int[] stocks = new int[]{7,6,4,3,1};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: stocks){
            if(price < minPrice){
                minPrice = price;
            }else{
                int diff = price-minPrice;
                if(diff > maxProfit){
                    maxProfit = diff;
                }
            }
        }
        System.out.println(maxProfit);
    }
}