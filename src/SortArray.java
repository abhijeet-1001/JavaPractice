public class SortArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=2;
        a[1]=1;
        a[2]=5;
        a[3]=4;
        a[4]=3;
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
           if(a[i]>a[j])
           {
               int c=a[j];
               int d=a[i];
               a[i]=c;
               a[j]=d;

           }
        }
        System.out.println("Sorted Array Is:");
        for (int c:a)
        {
            System.out.println(c);
        }
    }
}
