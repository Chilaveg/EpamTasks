import java.io.Console;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import static java.lang.Math.*;



public class Main {

    public static int checking(int numb)
    {
        while (true) {
            int point;
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                point = scanner.nextInt();
                if (point <= numb && point > 0) return point;
                else System.out.println("Bad point. Try again");
            } else {
                System.out.println("Bad point. Try again");
            }
        }
    }

    public static void main(String[] args) {
        int point;
        double z, a, b, c, x, y, d;
        long l,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose a theme");
        System.out.println("1. Linear programs.");
        System.out.println("2. Branchings.");
        System.out.println("3. Cycles.");
        System.out.println("enter a point");
        point = checking(3);
        try {
            switch (point)
            {
                case 1:
                    System.out.println("chose a number of task (1-6)");
                    point = checking(6);

                    switch (point) {
                        case 1:
                            System.out.println("Enter a");
                            a = sc.nextDouble();
                            System.out.println("Enter b");
                            b = sc.nextDouble();
                            System.out.println("Enter c");
                            c = sc.nextDouble();
                            z = ((a - 3) * b / 2) + c;
                            System.out.println("z = " + z);
                            break;
                        case 2:
                            System.out.println("Enter a");
                            a = sc.nextDouble();
                            System.out.println("Enter b");
                            b = sc.nextDouble();
                            System.out.println("Enter c");
                            c = sc.nextDouble();
                            z = (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
                            System.out.println("z = " + z);
                            break;
                        case 3:
                            System.out.println("Enter x");
                            x = sc.nextDouble();
                            System.out.println("Enter y");
                            y = sc.nextDouble();
                            z = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
                            System.out.println("z = " + z);
                            break;
                        case 4:
                            System.out.println("Gimme number in a format nnn,ddd");
                            x = sc.nextDouble();

                            a = (int) x * 0.001;
                            b = x % 1 * 1000;
                            System.out.printf("Result = %.3f", a + b);
                            break;
                        case 5:
                            System.out.println("Enter a count of seconds");
                            int h, m, s;
                            s = sc.nextInt();
                            h = s / 3600;
                            s -= h * 3600;
                            m = s / 60;
                            s = s % 60;
                            System.out.println("The converted time is: " + h + "h " + m + "m " + s + "s");
                            break;
                        case 6:
                            System.out.println("Enter coordinate x");
                            x = sc.nextDouble();
                            System.out.println("Enter coordinate y");
                            y = sc.nextDouble();
                            if ((y <= 0) && (x >= -4 && x <= 4) || ((y > 0 && y <= 4) && (x >= -2 && x <= 2)))
                                System.out.println("true");
                            else System.out.println("false");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("chose a number of task (1-5)");
                    point = checking(5);
                    switch (point)
                    {
                        case 1:
                            System.out.println("enter a first angle");
                            a=sc.nextDouble();
                            System.out.println("enter a second angle");
                            b=sc.nextDouble();
                            if ((a+b)<180)
                            {
                                System.out.println("this triangle is exist");
                                if (a==90 || b==90 || (a+b)==90) System.out.println("this triangle is rectangular");
                                else System.out.println("this triangle isn't rectangular");
                            }
                            else System.out.println("this triangle isn't exist");
                            break;
                        case 2:
                            System.out.println("enter a");
                            a=sc.nextDouble();
                            System.out.println("enter b");
                            b=sc.nextDouble();
                            System.out.println("enter c");
                            c=sc.nextDouble();
                            System.out.println("enter d");
                            d=sc.nextDouble();
                            if (a<b) x=a;
                            else x=b;
                            if (c<d) y=c;
                            else y=d;
                            if (x>y) z=x;
                            else z=y;
                            System.out.println("max{min(a,b),min(c,d)} = " + z);
                            break;
                        case 3:
                            double x1,y1,x2,y2,x3,y3;
                            System.out.println("enter x of A point");
                            x1 = sc.nextDouble();
                            System.out.println("enter y of A point");
                            y1 = sc.nextDouble();
                            System.out.println("enter x of B point");
                            x2 = sc.nextDouble();
                            System.out.println("enter y of B point");
                            y2 = sc.nextDouble();
                            System.out.println("enter x of C point");
                            x3 = sc.nextDouble();
                            System.out.println("enter y of C point");
                            y3 = sc.nextDouble();
                            if ((y1-y2)*x3+(x2-x1)*y3+(x1*y2-x2*y1) == 0) System.out.println("dots on one line");
                            else System.out.println("dots not on one line");
                            break;
                        case 4:
                            System.out.println("enter A");
                            a=sc.nextDouble();
                            System.out.println("enter B");
                            b=sc.nextDouble();
                            System.out.println("enter x");
                            x=sc.nextDouble();
                            System.out.println("enter y");
                            y=sc.nextDouble();
                            System.out.println("enter z");
                            z=sc.nextDouble();
                            if (x <= a && y <= b || y <= a && x <= b ||
                                    x <= a && z <= b || z <= a && x <= b ||
                                    z <= a && y <= b || y <= a && z <= b) System.out.println("block will pass");
                            else System.out.println("block shall not pass");
                            break;
                        case 5:
                            System.out.println("enter x");
                            x = sc.nextDouble();
                            if (x<=3) z=pow(x,2) - 3 * x + 9;
                            else
                            {
                                if (pow(x,3)+6 == 0)
                                {
                                    System.out.println("division by zero");
                                    break;
                                }
                                z=1/(pow(x,3)+6);
                            }
                            System.out.println("result = " + z);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("chose a number of task (1-8)");
                    point = checking(8);
                    switch (point)
                    {
                        case 1:

                            System.out.println("enter a positive and integer numb");
                            l=sc.nextLong();
                            for (;l>0;l--)
                            {
                                sum+=l;
                            }
                            System.out.println("the sum is " + sum);
                            break;
                        case 2:
                            double h;
                            System.out.println("enter a");
                            a=sc.nextDouble();
                            System.out.println("enter b");
                            b=sc.nextDouble();
                            System.out.println("enter h");
                            h=sc.nextDouble();
                            x=a;
                            System.out.println("y | x");
                            while (x<=b)
                            {
                                if (x>2) y=x;
                                else y=-x;
                                System.out.println(y+" | "+ x);
                                x+=h;
                            }
                            break;
                        case 3:
                            for (int i=1;i<=100;i++)
                            {
                                sum+=i*i;
                            }
                            System.out.println("sum of squares of 100's first numbers is " + sum);
                            break;
                        case 4:
                            BigInteger pr = new BigInteger("1");

                            for (int i=1;i<=200;i++)
                            {
                                pr=pr.multiply(BigInteger.valueOf(i*i));
                            }
                            System.out.println("product of squares of 200's first numbers is " + pr);
                            break;
                        case 5:
                            int n;
                            b=0;
                            System.out.println("enter n");
                            n = sc.nextInt();
                            System.out.println("enter e");
                            a = sc.nextDouble();
                            int m = 1;
                            while (1/pow(2,m)+1/pow(3,m) >= a || m<=n)
                                {
                                b+=1/pow(2,m)+1/pow(3,m);
                                m++;
                                }
                            System.out.println("sum = " + b);
                            break;
                        case 6:
                            char ch;
                            for (int i=0;i<=255;i++)
                            {
                                ch =(char) i;
                                System.out.println(i+" | "+ch);
                            }
                            break;
                        case 7:

                            System.out.println("enter m");
                            m=sc.nextInt();
                            System.out.println("enter n");
                            n=sc.nextInt();
                            for (int i = m; i<=n;i++)
                            {
                                String del = "";
                                System.out.printf("numb = "+i);
                                for (int j = 2;j<i;j++)
                                {
                                    if (i%j==0)
                                    {
                                        del+=j +",";
                                    }

                                }
                                System.out.println(" ;"+del);
                            }
                            break;
                        case 8:
                            float fl1=0f,fl2=0f;
                            System.out.println("enter a");
                            fl1=sc.nextFloat();
                            System.out.println("enter b");
                            fl2=sc.nextFloat();
                            String str1="",str2="",str3;
                            str1 = String.valueOf(fl1);
                            str2 = String.valueOf(fl2);
                            System.out.printf("the numerals from which consist both of numbers are " );
                            for (int i = 0;i<10;i++)
                            {
                                str3 = String.valueOf(i);
                                if (str1.contains(str3) && str2.contains(str3)) System.out.printf(i + ", ");
                            }
                            break;
                    }
                    break;
            }
        } catch (Throwable e)
        {
            System.out.println("SOMETHING WRONG. PLEASE BE CAREFUL AND TRY AGAIN");
            return;
        }

    }
}
