import java.util.Scanner;

public class Transform{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexDigit=input.nextLine();

        int count=0;
        int value = 0;
        for(int i=0;i<hexDigit.length();i++){
            char ch=Character.toUpperCase(hexDigit.charAt(i));//将截取出的字符转换为大写字母
            if('A'<=ch&&ch<='F'){
                value=ch-'A'+10;
            }
            else if(Character.isDigit(ch)){
                value=Integer.parseInt(String.valueOf(ch));

            }
            else{
                System.out.println(ch+" is an invalid input");
                System.exit(1);
            }
            count=count*16+value;
        }
        System.out.println("The decimal value for the hex digit "+hexDigit+" is "+count);
    }
}


