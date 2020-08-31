import java.util.*;
class show
{
    //STATIC METHOD
    public static void pr()
    {
        System.out.println("\nHello from the static method");
    }
}
public class th
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //ACCESSING THE COMMAND LINE ARGUMENTS
        String clg=args[0];
        String city=args[1];
        System.out.println("The name of the college is "+args[0]);
        System.out.println("The location of the college is "+args[1]);
        System.out.println("Enter Name of 5 students");
        //USING 1-D ARRAY
        String[] name=new String[5];
        for(int i=0;i<5;i++)
        {
                name[i]=sc.nextLine();
        }
        //USING 2-D ARRAY(NORMAL)
        String[][] info=new String[5][4];
        System.out.println("Enter name,hometown,branch and blood group of each student");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                info[i][j]=sc.nextLine();
            }
        }
        //USING 2-D JAGGED ARRAY
        int marks[][]=new int[5][];
        float[] avg=new float[5];
        int sum=0;
        for(int i=0;i<5;i++)
        {
            int size;
            System.out.println("Enter the number of subjects of "+name[i]);
            size=sc.nextInt();
            //GIVING SIZE TO EACH COLOUMN IN JAGGED ARRAY
            marks[i]=new int[size];
            System.out.println("Enter marks of "+name[i]);
            sum=0;
            for(int j=0;j<size;j++)
            {
                marks[i][j]=sc.nextInt();
                sum+=marks[i][j];
            }
            avg[i]=sum/size;
        }
        System.out.println("\n");
        int co=0;
        //USING ENHANCED FOR LOOP
        for(float t:avg)
        {
            System.out.println("The average marks of "+name[co++]+" is "+t);
        }
        //SHOWING 10 BUILT IN STRING FUNCTIONS
        System.out.println("\n\nEnter a name for showcasing string functions\n");
        String n=sc.nextLine();
        System.out.println("\nThe character at index 0 is "+n.charAt(0));
        System.out.println("The unicode of character at index 0 is "+n.codePointAt(0));
        System.out.println("The full name is "+n.concat(" Kumar"));
        System.out.println("The hashcode of the name is "+n.hashCode());
        System.out.println("The first index of k in the string is "+n.indexOf("a"));
        System.out.println("The length of the name is "+n.length());
        System.out.println("Is the string \"Ram\"? "+n.equals("Ram"));
        System.out.println("Does the string contains \"an\"? "+n.contains("an"));
        System.out.println("Does the string starts with \"a\"? "+n.startsWith("a"));
        System.out.println("The string in lowercase is "+n.toLowerCase());
         System.out.println("The string in uppercase is "+n.toUpperCase());
        int[] newa=new int[10];
        int newaa[]={1,2,3,4,5,6,7,8,9,0};
        System.out.println("\n\nEnter the array elements");
        for(int i=0;i<10;i++)
        {
            newa[i]=sc.nextInt();
        }
        //SHOWING 5 BUILT IN ARRAY FUNCTIONS
        System.out.println("Enter a number to be searched");
        int key=sc.nextInt();
        System.out.println("Found at index "+Arrays.binarySearch(newa,key));
        System.out.println("Are the both array equal? "+Arrays.equals(newa,newaa));
        System.out.println("The result of comparasion of both array is "+Arrays.compare(newa,newaa));
        System.out.println("The deep hashcode for the array is "+Arrays.hashCode(newa));
        Arrays.sort(newa);
        System.out.println("The array after sorting is "+Arrays.toString(newa));
        show.pr();
    }
}