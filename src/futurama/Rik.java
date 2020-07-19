package futurama;

public class Rik extends Multik {
    public static void main(String[] args) {

        int massiv1 [] [] = {{12,42,61,6,4},{1,66,87,39,2}};
        int massiv2 [] [] = {{12,45,6},{32,87,91,55,62}};

        System.out.println(av(12,213,3,32,1,34,45,4356,23,57,53234,2,5));


    massiv(massiv1);
    massiv(massiv2);


    }

    public static void massiv(int m [][]){
        for (int i = 0; i < m.length; i++){
         for (int j = 0; j<m[i].length ;j++){
             System.out.print(m[i][j] +"\t");

            }
            System.out.println();
        }
    }


    public static int av(int...num){
        int sum = 0;
        for (int i: num )
        sum+=i;
        return sum/num.length;
    }

  //  hour = ((h>0 && h<24) ? h:0);


    public void mult(){
        System.out.println("Йа метод жизнь-!!!");
    }
}
