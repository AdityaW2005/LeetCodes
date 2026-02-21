class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0, j = 0;

        int UP = 0, RIGHT = 1, DOWN = 2, LEFT = 3;
        int direction = RIGHT;

        List<Integer> ans = new ArrayList<>();

        int upWall = 0;
        int rightWall = n;
        int downWall = m;
        int leftWall = -1;

        while (ans.size() != m * n) {

            if (direction == RIGHT) {
                while (j < rightWall) {
                    ans.add(matrix[i][j]);
                    j++;
                }
                i = i + 1;
                j = j - 1;
                rightWall--;
                direction = DOWN;
            }

            else if (direction == DOWN) {
                while (i < downWall) {
                    ans.add(matrix[i][j]);
                    i++;
                }
                i = i - 1;
                j = j - 1;
                downWall--;
                direction = LEFT;
            }

            else if (direction == LEFT) {
                while (j > leftWall) {
                    ans.add(matrix[i][j]);
                    j--;
                }
                i = i - 1;
                j = j + 1;
                leftWall++;
                direction = UP;
            }

            else {
                while (i > upWall) {
                    ans.add(matrix[i][j]);
                    i--;
                }
                i = i + 1;
                j = j + 1;
                upWall++;
                direction = RIGHT;
            }
        }

        return ans;
    }
}
