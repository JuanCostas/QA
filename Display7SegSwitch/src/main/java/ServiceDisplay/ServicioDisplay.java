package ServiceDisplay;

import Entity.DisplayMatrix;

import java.util.Scanner;

public class ServicioDisplay {
    private DisplayMatrix m = new DisplayMatrix();
    int n = 2;
    private int[] number = new int[n];
    Scanner scan = new Scanner(System.in);
    private int[] sevenseg = {0,0,0,0,0,0,0}; /* es para la función ChangesSwitchver2()*/

    public void ChargeNumbers(){
        for(int i=0; i<n; i++){
            System.out.print("Ingrese el elemento" + (i+1) +" del vector: ");
            number[i] = scan.nextInt();
        }
    }

    public int ChangesSwitch(){
        int c = 0;
                        /*Vector o array number = [1, 5]*/
        for (int i=0; i<number.length; i++){
            if(i==0){
                for(int j=0; j<m.getM(); j++){
                    c = c + m.matrix7Seg[number[i]][j];
                }
            }else{
                for(int j=0; j<m.getM(); j++){
                    /* if(sevenseg[j] !=  m.matrix7Seg[number[i]][j]) esto reemplazaría la línea de abajo y se elimina el caso base if(i==0)*/
                    if(m.matrix7Seg[number[i]][j] != m.matrix7Seg[number[i-1]][j]){
                        /*sevenseg[j] = m.matrix7Seg[number[i]][j]; realiza el cambio en el vector para la comparación*/
                        c = c + 1;
                    }
                }
            }
        }
        return c;
    }
    public int ChangesSwitchver2(){
        int c = 0;
        /*Vector o array number = [1, 6]*/
        for (int i=0; i<number.length; i++) {
            for (int j = 0; j < m.getM(); j++) {
                if (sevenseg[j] != m.matrix7Seg[number[i]][j]) {
                    sevenseg[j] = m.matrix7Seg[number[i]][j];
                    c = c + 1;
                }
            }
        }
        return c;
    }

}
