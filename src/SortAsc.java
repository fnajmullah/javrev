public class SortAsc {
    public static void main(String[] args) {
        int a[]= {34,6,38,35,3};
        int temp=a[0];
        for (int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }

            System.out.println(a[i]);
        }
    }
}
