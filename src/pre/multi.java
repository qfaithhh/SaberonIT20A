
package pre;


public class multi {
     public static void main(String[] args) {
    int age [][] = {
        {1, 71, 41},
        {15, 6, 3},
        {5, 48, 9},
};
    for (int i = 0; i < age.length; i++){
    for (int j= 0; j < age[i].length; j++){
        System.out.print(age[i][j] + " ");
    }
    System.out.println();
}
}
}
