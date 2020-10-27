public class twoDarray{
{

public static void main (String args[])  
{


//print2dArray();
//matrixORdotproduct();
//spiralArray();
//exitpoint()
//degree90My();
//mydigonalTraves();
//shellrotate();
//search2d();

}

public static void search2d()
{
      int [][] arr1={
            {10,11,12,13},
            {21,22,23,24},
            {31,32,33,34},
            {41,42,43,49}
      };
      int l=0;
      int no=44;
      for(int i=0;i<arr1.length;i++)
      {
      for(int j=0;j<arr1[0].length;j++)
            {
                  int k=arr1[i][j];
                  
                  if(k==no)
                  {
                        l=1;
                  System.out.print(i+"\n"+j);
                  }
      
      
      
      }
      
      }
      
      if(l==0)
      System.out.print("not found");
      
}
public static void mydigonalTraves()
{
      Scanner scn=new Scanner (System.in);
      int n=scn.nextInt();
//      int m=scn.nextInt();
int [][]arr1=new int [n][n];
for(int i=0;i<arr1.length;i++)
{
      for(int j=0;j<arr1[0].length;j++)
      {
            arr1[i][j]=scn.nextInt();
      }
}


/*int [][] arr1={
      {11,12,13,14},
      {21,22,23,24},
      {31,32,33,34},
      {41,42,43,44}
};
*/
//int s=scn.nextInt();








int minr=0;
int minc=0;
int maxr=arr1.length-1;
int maxc=arr1[0].length-1;

//while(o<=maxc)

for(int i=minc;i<=maxr;i++)
{
      for(int j=i;j<=i;j++)
      {
System.out.println(arr1[i][j]);
      }
}

int k=0;
int m=1;



for(int i=0;i<maxr;i++)
{
m=1;
      k=0;
      m=m+i;
      for(int j=0;j<maxc-i;j++)
{
      
      System.out.println(arr1[k][m]);
      k++;
      m++;
}

}


}
public static void shellrotate()

{

      Scanner scn=new Scanner (System.in);
      int n=scn.nextInt();
      int m=scn.nextInt();
int [][]arr1=new int [n][m];
for(int i=0;i<arr1.length;i++)
{
      for(int j=0;j<arr1[0].length;j++)
      {
            arr1[i][j]=scn.nextInt();
      }
}

     
/*
int [][] arr1={
      {11,12,13,15},
      {21,22,23,26},
      {41,42,43,45}
};
*/
//int s=scn.nextInt();
System.out.print("r");
int r=scn.nextInt();

System.out.print("s");
int s=scn.nextInt();

int minc=0;
int minr=0;
int maxc=0;
int maxr=0;


minr=s-1;
minc=s-1;
maxr=arr1.length-s;
maxc=arr1[0].length-s;
System.out.print(minr);

System.out.print(minc);

System.out.print(maxr);
int sz=0;
System.out.println(maxc);


if(maxr==minr)
{
sz=maxc-minc+1;    
System.out.println(" "+sz);

}
else
{
 sz=2*(maxr-minr+maxc-minc);
System.out.println(sz);
}
int [] oned=new int [sz];
int k=0;
int i=0;
int j=minc;



for(j=minc,i=minr;i<=maxr;i++)
{
      oned[k]=arr1[i][j];
      k++;
}

//22 23 24

for(j=minc+1,i=maxr;j<=maxc;j++)
{
      oned[k]=arr1[i][j];
      k++;
}



for(j=maxc,i=maxr-1;i>=minr;i--)
{oned[k]=arr1[i][j];
     if(k<=sz)
      k++;
}     


for(i=minr,j=maxc-1;j>=minc+1;j--)
{
      if(k>sz-1)
      {
            break;
      }
oned[k]=arr1[i][j];
k++;
}




/*
System.out.println(k);
for(int v=0;v<oned.length;v++)
{
System.out.print(oned[v]+" ");
}
*/


int [] l=rotatearray(oned,1);
//for(int q=0;q<l.length;q++)
//System.out.print(l[q]);


System.out.print("\n");
k=0;
for(j=minc,i=minr;i<=maxr;i++)
{
      
      arr1[i][j]=l[k];
      k++;
}

//22 23 24
for(j=minc+1,i=maxr;j<=maxc;j++)
{
      arr1[i][j]=l[k];
      k++;
}


for(j=maxc,i=maxr-1;i>=minr;i--)
{
      arr1[i][j]=l[k];
     if(k<=sz)
      k++;
}     


for(i=minr,j=maxc-1;j>=minc+1;j--)
{
      if(k>sz-1)
      {
            break;
      }
      arr1[i][j]=l[k];
k++;
}


for(int row=0;row<arr1.length;row++)
{
for(int col=0;col<arr1[0].length;col++)
{
System.out.print(arr1[row][col]+" ");

}
System.out.print("\n");
}


}


public static int [] rotatearray(int [] arr,int r  )
{

      r=r%arr.length;
     if(r<0)
     {
           r=-r;
           int mod=r%arr.length;
           int frt=arr.length-mod;
           r=frt;
     }

      int k=arr.length-r;
int j=arr.length-1;

for(int i=0;i<r/2;i++)
{
      int temp=arr[j];
    arr[j]=arr[k];
    arr[k]=temp;

    j--;
    k++;
}

int p=arr.length-r-1;
int l=p;
j=0;
for(int i=0;i<l/2;i++)
{
      int temp=arr[p];
    arr[p]=arr[j];
    arr[j]=temp;

    j++;
    p--;
}
j=0;
p=arr.length-1;
for(int i=0;i<arr.length/2;i++)
{

      int temp=arr[p];
    arr[p]=arr[j];
    arr[j]=temp;

    j++;
    p--;
}
//for(int i=0;i<arr.length;i++)
//{
  //    System.out.print(arr[i]);
//}

return arr;
}




public static void myrotateArray(int [] a ,int k)
{
            // write your code here
                  int n=a.length;
         //     System.out.print("rotation");
              int r=k;
        if(r>=0)
        r=r%n;
        if(r<0)
        {
              r=-r;
              r=r%n;
              r=n-r;
        
        }
        
        
        
        
        int [ ]arr2=new int [n];
        
        int t=0;
        int s=a.length-r;
        while(t<r)
        {
        
              arr2[t]=a[s];
              t++;
              s++;
        
        }
        
        
        
        int j=0;
        while(t<=a.length-1)
        { 
                 arr2[t]=a[j];
                 j++;
                 t++;
        }
        
        //for(int i=0;i<arr2.length;i++)
        {
          //    System.out.print(arr2[i]+" ");
        }
         
          


          for(int val:arr2)
          {
                System.out.print(val+" ");
          }
        
}









public static void degree90My()
{
      
     
Scanner scn=new Scanner (System.in);
int n=scn.nextInt();
//int m=scn.nextInt();
int [][] arr=new int [n][n];

for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[0].length;j++)
{
      arr[i][j]=scn.nextInt();
}
}

for(int i=0;i<arr.length;i++)
{

for(int j=arr.length-1;j>=0;j--)
{
      System.out.print(arr[i][j]+" ");
}

}
}





public static void exitpoint()
{
      int [][] arr={
            {0,0,0,1},
            {0,0,0,0},
            {0,1,1,0},
            {1,0,0,0}
         };
 

         int right=0;
         int left=0;
         int down=0;
         int up=0;


         int i=0;
         int j=0;
         int dir=0;

while(true)
{
      dir=(dir+arr[i][j])%4;
if(dir==0)
{
      j++;
}
else if(dir==1)
{
      i++;
}
else if(dir==2)
{
      j--;
}
else if(dir==3)
{
      i--;
}


if(j==arr[0].length)
{
      j--;
      System.out.print(i+" "+j);
      break;
}

if(j==-1)
{
      j++;
      System.out.print(i+" "+j);
      break;
}
if(i==-1)
{
      i++;
      System.out.print(i+" "+j);
      break;
}

if(i==arr.length)
{
      i--;
      System.out.print(i+" "+j);
      break;
}

}

}

public static void wave()

{
 /*     Scanner scn=new Scanner (System.in);
      int n=scn.nextInt();
      int m=scn.nextInt();
int [][]arr=new int [n][m];
for(int i=0;i<arr.length;i++)
{
      for(int j=0;j<arr[0].length;j++)
      {
            arr[i][j]=scn.nextInt();
      }
}
*/
      int [][] arr={
            {11,12,13,14},
            {21,22,23,24},
            {31,32,33,34},
            {41,42,43,44}
         };
 


      int tnl=arr.length*arr[0].length;
      int cnt=0;
      int minr=0;
      int minc=0;
      int maxr=arr.length-1;
      int maxc=arr[0].length-1;
      int k=arr.length-1;


      for(int i=0;i<arr[0].length;i++)
      {

            if(i%2==0)
            for(int j=0;j<=k;j++)
             System.out.print(arr[j][i]+" ");

             
            if(i%2==1)
            for(int j=k;j>=0;j--)
             System.out.print(arr[j][i]+" ");
      }

}
public static void spiralArray()
{

      Scanner scn=new Scanner (System.in);
      //int n=scn.nextInt();
      //int m=scn.nextInt();

      int [][] arr={
            {11,12,13,14,15,16},
            {21,22,23,24,25,26},
            {31,32,33,34,35,36},
            {41,42,43,44,45,46}
         };
 


      int tnl=arr.length*arr[0].length;
      int cnt=0;
      int minr=0;
      int minc=0;
      int maxr=arr.length-1;
      int maxc=arr[0].length-1;

      while(cnt<tnl)      
    {  for(int i=minr,j=minc;i<=maxr && cnt<tnl ;i++)
      {
            System.out.print(arr[i][j]+" ");
            cnt++;
      }
      minc++;

      for(int i=maxr,j=minc;j<=maxc && cnt<tnl ;j++)
      {
            System.out.print(arr[i][j]+" ");
            cnt++;
      }

      maxr--;
      for(int i=maxr,j=maxc;i>=minr && cnt<tnl ;i--)
      {
            System.out.print(arr[i][j]+" ");
            cnt++;
      }

maxc--;
      for(int i=minr,j=maxc;j>=minc && cnt<tnl ;j--)
{
      System.out.print(arr[i][j]+" ");
      cnt++;
      
}
minr++;

}
}


public static void matrixORdotproduct()
{
      
      Scanner scn=new Scanner (System.in);
      int n=scn.nextInt();
      int m=scn.nextInt();

      int [][] arr1=new int[n][m];
      for(int i=0;i<arr1.length;i++)
      {
            for(int j=0;j<arr1[0].length;j++)
            {
                  
                  arr1[i][j]=scn.nextInt();
            }
      }

System.out.print("second_row_column");
      int a=scn.nextInt();
      int b=scn.nextInt();

      int [][] arr2=new int[a][b];
      for(int i=0;i<arr2.length;i++)
      {
            for(int j=0;j<arr2[0].length;j++)
            {
                  arr2[i][j]=scn.nextInt();
            }
      }



      int [][] arr;

      arr=new int[n][b];

 //     System.out.print("ok");

for(int i=0;i<arr.length;i++)
{
      for(int j=0;j<arr[0].length;j++)
      {
            for(int k=0;k<m;k++)
            arr[i][j]+=arr1[i][k]*arr2[k][j];
      
      }
      System.out.print("\n");
}


for(int i=0;i<arr.length;i++)
{
      for(int j=0;j<arr[0].length;j++)
      {
            System.out.print(arr[i][j]+" ");

      }
      System.out.print("\n");
}



}
public static void print2dArray()
{
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int m=scn.nextInt();
      int [][] arr=new int [n][m];

      for(int i=0;i<arr.length;i++)
      {
            for(int j=0;j<arr[0].length;j++)
            {
                  arr[i][j]=scn.nextInt();
            }
            System.out.println();
      }

      
      for(int i=0;i<arr.length;i++)
      {
            for(int j=0;j<arr[0].length;j++)
            {
                  System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
      }


}
  
  
}
