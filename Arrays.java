import java.util.Random;

/**
 * Created by Zar on 6/13/2016.
 */
public class Arrays {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        RandomGeneratedArray(arr);
        BubbleSort(arr);
        UnduplicateArray(arr);
    }

    public static void RandomGeneratedArray(int[] num)
    {
        Random ra=new Random();


        for(int i=0; i<5; i++)
        {
            num[i]=ra.nextInt(5);
        }
        System.out.print("Random Generated Array:");
        for(int i=0; i<5; i++)
        {
            System.out.print(" "+ num[i]);
        }
    }
    public  static  void UnduplicateArray(int[] num)
    {
        for(int i=0; i<num.length; i++)
        {
            for(int j=i+1; j<num.length;  j++)
            {
                if(num[i]==num[j])
                {
                    num[i]=-1;
                }
            }
        }
        System.out.print("\nUnduplicate Array:");
        for(int k=0;k<num.length; k++)
        {
            if(num[k]!=-1)
            {
                System.out.print(" " +num[k]);
            }
        }
    }
    public static void BubbleSort(int[] num)
    {
        int j;
        boolean flag=true;
        int temp;
        while(flag)
        {
            flag=false;
            for(j=0; j<num.length-1; j++)
            {
                if(num[j]>num[j+1])
                {
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    flag=true;
                }
            }
        }
        System.out.print("\nsorted array:");
        for(int i=0; i<num.length; i++)
        {
            System.out.print(" "+num[i]);
        }
    }
}
