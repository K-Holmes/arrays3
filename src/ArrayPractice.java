import java.util.Random;

public class ArrayPractice {
    public void arrayMaking(){
        //1
        int[] scores = new int[15];

        //2
        int[] odd = {1, 3, 5, 7, 9};

        //3
        int[] number = new int[30];
        for (int i: number){
            number[i] = 5;
        }

        //4
        int[] randomNums = new int[16];
        Random rnd = new Random();
        for (int i: randomNums){
            randomNums[i] = rnd.nextInt(100);
            System.out.print(randomNums[i]+" ");
        }

        //5
        int num[]={7,7,6,6,5,5,4,4,3,3,2,2,1};
        for(int i=0;i<13;i=i+4) {
            //prints out every 4 numbers in the array
            System.out.print(num[i]);
        }
        System.out.println();

        //6
        int array6[][]= {{2,3,1},{2,2,1},{0,2,3},{1,0,4}};
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                //prints out each row line by line
                System.out.print(array6[i][j]);
            }
            System.out.println();
        }

        //7
        System.out.println();
        int array7[][]= {{2,2,2},{2,2,0}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(array7[i][j]==0&&j==2){
                    //prints out only the last number in the array
                    System.out.print(array7[i][j]);
                }
            }
        }System.out.println();

        //8
        int array8[][]= {{6,4,3},{4,3,2}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                //doubles all the numbers in the array
                System.out.print(2*array8[i][j]);
            }
        }
        System.out.println();
    }
}
