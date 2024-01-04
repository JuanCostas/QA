package Entity;

public class DisplayMatrix {
    /*Numero de filas de la matriz que para este caso son 10 numero por lo que se definen 10 filas*/
    private int n = 10;
    /*Cantidad de columnas de la matriz que para este caso son 7 segmentos por lo que se definen 7 columnas*/
    private int m = 7;
    /*Matriz definida commo: cada fila es el numero a representar y cada columna es el estado de cada segmento para lograrlo*/
                                /*   a  b  c  d  e  f  g  */
    private int[][] matrix7Seg = {  {1, 1, 1, 1, 1, 1, 0},/* 0*/
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

    public DisplayMatrix(){}
    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public int[][] getMatrix7Seg() {
        return matrix7Seg;
    }

}
