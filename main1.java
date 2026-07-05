import java.util.Scanner;
public class main1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[][] arr=new int[n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
arr[i][j]=sc.nextInt();
}
}
int min=arr[0][0];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
if(arr[i][j]<min){
min=arr[i][j];
}
}
}
int max=arr[0][0];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
if(arr[i][j]>max){
max=arr[i][j];
}
}
System.out.println("Minimum number = " +min);
System.out.println("Maximum number = " +max); 
}
}
}

