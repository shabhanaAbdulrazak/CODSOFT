import java.util.Scanner;
public class Mark{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Total Number of Subject ");
        int n=scanner.nextInt();
       // int m=scanner.nextInt();
        int total=0;
         System.out.println("mark obtained in "+n+" is " );
        for(int i=1;i<=n;i++){
             int m=scanner.nextInt();
             total+=m;
        }
        System.out.println("total mark is "+total);
        double percentage = (double)total/n;
        System.out.println(percentage);
        if(percentage>80 && percentage<=100){
            System.out.println("\nyour total mark is : "+total+"\nyour percentage is : "+percentage+"\nyour grade is : A+");
        }
        else if(percentage>60 && percentage<=80){
            System.out.println("\nyour total mark is : "+total+"\nyour percentage is : "+percentage+"\nyour grade is : A");
        }
        else if(percentage>40 && percentage<=60){
            System.out.println("\nyour total mark is : "+total+"\nyour percentage is : "+percentage+"\nyour grade is : B+");
        }
        else{
            System.out.println("\nyour total mark is : "+total+"\nyour percentage is : "+percentage+"\nyou are fail... Better Luck Next Time!!!");
        }

    }
}