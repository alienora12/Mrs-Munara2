//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//         byte a=100;
//        short b=20000;
//        int c=10000;
//        long d=100000;
//        float e= 1.234f;
//        double f=1.234;
//        boolean j= true;
//        boolean h=false;
//        char i='i';
//        System.out.println(a+b+c+d+e+f);
//        String name ="Andrei"; string pool
//        String name1="Andrei";
//        String name2= new String("Andrei");
//        System.out.println(name == name1);
//        System.out.println(name == name2);
//       int a=5;  operatory
//       int b=2;
//       int c= a-b;
//       int d= a+b;
//       int e= a*b;
//       double f= (double) a/b;
//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        int num=20;
//        num=num+1;
//        num++;
//        num--;
//        num+=5;
//        num-=2;
//        int num1=10;
//        int num2=15;
//        System.out.println(num==num1);
//        System.out.println(num!=num1);
//        System.out.println(num>num1);
//        System.out.println(num<num1);
//        System.out.println(num>=num1);
//        System.out.println(num<=num1);
//        System.out.println(num);
//        System.out.println(num==num1 && num1==num2);
//        System.out.println(num>num1 || num1==num2);

//        int example=15;
//        if(example>10){ uslovnye operatory
//            example+=10;
//        }
//        System.out.println(example);
//
//
//        if (example<5){
//            example+=5;
//        }else{
//            example-=5;
//        }
//        System.out.println(example);

//        int age=20;
//        String info= age >= 18? "adult":"teen";
//        System.out.println(info);

//        sikly
//        int a=0;
//        for (int i=0; i<5; i++) {
//            System.out.println(a);
//            a++;
//        }
//      int a=1;
//      for (int i=0; i<10; i=i+3) {
//          System.out.println(a);
//          a++;
//          System.out.println(a);
//      }
//        while (a<6){
//            System.out.println(a);
//            a++;
//        }
//        int[] array=new int[10];
//        String[] strarray= new String[5];
//        for(int number:array){
//            System.out.println(number);
//        }
//        for(String str: strarray){
//            System.out.println(str);
//        }
//        Operatory continye and break
        for(int i=0; i<=10; i++){
            if(i%2==0){
                continue;
            }
            if(i>7){
                break;
            }
            System.out.println(i);
        }
    }
}