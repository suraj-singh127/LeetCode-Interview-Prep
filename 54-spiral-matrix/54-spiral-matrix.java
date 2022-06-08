class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix.length==0) return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while(true){
            for(int i = left;i<=right;i++) result.add(matrix[top][i]);
            top++;
            if(top > bottom || left > right) break;

            for(int i = top;i<=bottom;i++) result.add(matrix[i][right]);
            right--;
            if(top > bottom || left > right) break;

            for(int i = right;i>=left;i--) result.add(matrix[bottom][i]);
            bottom--;
            if(top > bottom || left > right) break;

            for(int i = bottom;i >=top;i-- ) result.add(matrix[i][left]);
            left++;
            if(top > bottom || left > right) break;
        }
        
        return result;
    }
}