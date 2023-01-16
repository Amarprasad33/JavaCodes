package com.BitwiseOPerators;
// Fliiping the Image

//https://leetcode.com/problems/flipping-an-image/
public class flippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            // Reverse this array , means every row in the matrix
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // Swapping and at the same time converting into XOR
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;

            }
        }

        return image;
    }

}
