package lab1.exam3;
// Lab 1.3

import lab1.exam3.entity.MinAndMax;


public class FindMinMax {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 5, 14};
        MinAndMax minAndMax = new MinAndMax();
        System.out.printf("Max: %d", minAndMax.max(num));
        System.out.printf("\nMin: %d", minAndMax.min(num));
    }
}
