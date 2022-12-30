public class FindMxArryInt {
    public static void main(String[] args) {
        int[] myarr= {34,6,38,35,3};
        int mx=myarr[0];
        System.out.println(myarr.length);
        for (int i=0;i<myarr.length;i++)
        {
            if(myarr[i]>=mx){
                mx=myarr[i];
            }

        }
        System.out.println("max value from above array:"+mx);
    }
}
