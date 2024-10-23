class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (point1, point2) -> {
            int dist1 = calculateDistance(point1);
            int dist2 = calculateDistance(point2);

            return Integer.compare(dist1, dist2);
        });

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = points[i]; 
        }

        return result;  
    }

    public static int calculateDistance(int[] point) {
        int x = point[0]; 
        int y = point[1];  
        return x * x + y * y;  
    }
}