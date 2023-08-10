package Math;

public class flipimage {

    public int[][] flipAndInvertImage(int[][] image) {

        for(int[] row : image){
            for(int j = 0 ; j <= image[0].length / 2; j++){
                int temp = row[j] ^ 1;
                row[j] = row[image[0].length - j - 1];
                row[image[0].length - j - 1] = temp;
            }
        }
        return image;
    }

}
