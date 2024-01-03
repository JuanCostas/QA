package Entity;

public class DisplayMatrix {
    private int n = 10;
    private int m = 7;
                                /*   a  b  c  d  e  f  g  */
    public int[][] matrix7Seg = {   {1, 1, 1, 1, 1, 1, 0},/* 0*/
                                    {0, 1, 1, 0, 0, 0, 0},/* 1*/
                                    {1, 1, 0, 1, 1, 0, 1},/* 2*/
                                    {1, 1, 1, 1, 0, 0, 1,},/* 3*/
                                    {0, 1, 1, 0, 0, 1, 1,},/* 4*/
                                    {1, 0, 1, 1, 0, 1, 1},/* 5*/
                                    {1, 0, 1, 1, 1, 1, 1},/* 6*/
                                    {1, 1, 1, 0, 0, 0, 0},/* 7*/
                                    {1, 1, 1, 1, 1, 1, 1},/* 8*/
                                    {1, 1, 1, 1, 0, 1, 1}/* 9*/
    };

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public int[][] getMatrix7Seg() {
        return matrix7Seg;
    }

    public DisplayMatrix(){}

    public void Mostrat_Matriz(){
        for (int i=0; i < n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix7Seg[i][j]+" ");
            }
            System.out.println();
        }
    }
}
