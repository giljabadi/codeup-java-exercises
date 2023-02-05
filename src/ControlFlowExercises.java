import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");


        /***************Print 5 to 15*******************/
//        int i = 5;
//        while(i<=15){
//            System.out.printf("%d ",i);
//            i++;
//        }
        /***************Print 100 to 0 decremented by 5*******************/
//        int j =100;
//        do {
//
//            System.out.printf("%d\n",j);
//            j-=5;
//        }while (j>=0);

        /***************Print n squared up to 1000000 do while loop*******************/
//        long k = 2;
////        System.out.printf("%d",k);
//        do {
//
//            System.out.printf("%d\n",k);
//            k*=k;
//        }while (k<=1000000);

        /***************Print 5 to 15 for loop*******************/
//        for(int i =5; i<=15; i++){
//            System.out.println(i);
//        }

        /***************Print n squared up to 1000000 for loop*******************/
//        for(long j=2; j<1000000; j*=j){
//            System.out.println(j);
//        }
        /***************Fizz Buzz*******************/
//        for(int i=1; i<=100;i++){
//
//            if(i%15 ==0){
//                System.out.println("FizzBuzz");
//            }else if(i%3==0){
//                System.out.println("Fizz");
//            }else if(i%5==0){
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }

        /***************Number Table*******************/
//
//        String userVerification;
//
//        do {
//            int startNum =1;
//
//            System.out.printf("Enter a integer: ");
//            int userInput = scanner.nextInt();
//            System.out.printf("%10s%10s%10s\n","number|","squared|","cubed|");
//            System.out.printf("%10s%10s%10s", "-----|","-----|","-----|");
//
//            while(startNum<= userInput) {
//                System.out.printf("\n%9d|%9d|%9d\n", startNum, (int) Math.pow(startNum, 2), (int) Math.pow(startNum, 3));
//                startNum++;
//            }
//
//            System.out.printf("Would you like to continue?(Yes=y No=n): ");
//            userVerification = scanner.next();
//            System.out.println(userVerification);
//        }while(userVerification.equalsIgnoreCase("y"));

        /***************User Grade*******************/
        int userGrade;
        String userCont;
        do{
            System.out.printf("Enter your numerical grade from 0 to 100: ");
            userGrade = scanner.nextInt();

            if(userGrade >= 88 && userGrade <= 100)
                System.out.printf("Congrats!!! You have an A!");
            if(userGrade >= 80 && userGrade <= 87)
                System.out.printf("You have an B");
            if(userGrade >= 67 && userGrade <= 79)
                System.out.printf("You have an C");
            if(userGrade >= 60 && userGrade <= 66)
                System.out.printf("You have an D");
            if(userGrade <60)
                System.out.printf("You Failed!!!: \'F\'");

            System.out.printf("\nWould you like to continue?(Yes=y No=n): ");
            userCont = scanner.next();
        }while (userCont.equalsIgnoreCase("y"));




    }
}