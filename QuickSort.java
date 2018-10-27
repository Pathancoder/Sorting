//Uses the last element in the array as the PIVOT ELEMENT and recursive put the pivot at its correct position

import java.util.Scanner;
public class QuickSort
{

public static void Sort(int[] array,int low,int high)
{
if(low<high)
{
int pi;
pi=Partition(array,low,high);
Sort(array,low,pi-1);
Sort(array,pi+1,high);
}

}

public static int Partition(int[] arr,int low, int high)
{

int pivot=arr[high];
int i=low-1;
for(int j=low;j<=high-1;j++)
{
if(arr[j]<=pivot)
{

i++;
{  //swap
int temp;
temp=arr[i];
arr[i]=arr[j];
arr[i]=temp;
}
}
}
//swap
{
int temp;
temp=arr[i+1];
arr[i+1]=arr[high];
arr[high]=temp;
}

return (i+1);

}

public static void main(String[] args)
{
int num;
//int[] x;
System.out.print("Enter the number in the array: ");
Scanner input = new Scanner(System.in);
num=input.nextInt();
int[] x= new int[num];

System.out.println("Enter the element in the array: ");
for(int i=0;i<num;i++)
x[i]=input.nextInt();
Sort(x,0,num-1);
print(x);
}

public static void print(int[] a)
{
for(int i=0;i<a.length;i++)
System.out.printf("%d  ",a[i]);
System.out.println();
}

}
