class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        floodFillLogic(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void floodFillLogic(int[][] image, int sr, int sc, int match, int color) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != match) {
            return;
        }
        image[sr][sc] = color;
        floodFillLogic(image, sr - 1, sc, match, color);
        floodFillLogic(image, sr + 1, sc, match, color);
        floodFillLogic(image, sr, sc - 1, match, color);
        floodFillLogic(image, sr, sc + 1, match, color);
    }
}
