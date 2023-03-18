package Bucketcount;
import java.util.Scanner;
class count

{
public static int getBucketCount(double width, double height, double areaPerBucket){
        
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        
        int numOfBuckets = (int) Math.ceil((width * height) / areaPerBucket);
        return numOfBuckets;
        
    }
    
    public static int getBucketCount(double area, double areaPerBucket){
        
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int numOfBuckets = (int) Math.ceil(area / areaPerBucket);
        return numOfBuckets;
    } 

    public class Paint
    {
   public static void main (String[]args)

{

double w,h,ab,a;

int x;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the Width");

w=sc.nextDouble();

System.out.println("Enter the Height");

h=sc.nextDouble();

System.out.println("Enter the Area Per Bucket");

ab=sc.nextDouble();

count obj=new count();

x=obj.getBucketCount(w,h,ab);

System.out.println(x);

}
}
}
