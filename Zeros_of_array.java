public class Zeros_of_array {
    public static void main(String[] args) {
        int  a[] = {0,0,2, 3, 4};
        System.out.println("Array before removing zeros : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        int j=0;
        for (int i=0; i < a.length ;i++ )
        {
            
            if(a[i] != 0&&a[j]==0)
            {
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(a[j]!=0)
            {
                j++;
            }
        }

        System.out.println( "\nArray after moving zeros :");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }


    }
    
}
