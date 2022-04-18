import java.util.*;

public class code1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row and column");

    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][]= new int[n][m];
    for(int i= 0 ;i<n ;i++){
      for (int j = 0;j<m ;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    for(int i= 0 ;i<n ;i++){
      for (int j = 0;j<m ;j++){
        System.out.print(arr[i][j]+" ");
      }

        System.out.println();
    }
    boolean rowcol0 = false;
    for(int i= 0 ;i<n ;i++){
      for (int j = 0;j<m ;j++){
        if(arr[i][j] == 0 && j == 0){
          rowcol0 = true;
        }
        else if(arr[i][j] == 0){
          arr[i][0] = 0;
          arr[0][j] = 0;
        }
      }
    }
    for(int i= n-1 ;i>=0 ;i--){
      for (int j = m-1;j>=0 ;j--){
        if(arr[i][0] == 0 || arr[0][j] == 0){
          if(j == 0 || rowcol0){
            continue;
          }
          arr[i][j] = 0;
        }
      }
    }
    if(rowcol0){
      for(int i = 0;i<n;i++){
        arr[i][0] = 0 ;
      }
    }
    for(int i= 0 ;i<n ;i++){
      for (int j = 0;j<m ;j++){
        System.out.print(arr[i][j]+" ");
      }

        System.out.println();
    }


  }
}
