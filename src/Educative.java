public class Educative {
    public static void main(String[] args) {
        int n=84343;
        int ls=0;
        int s=0;
while(n>0){

    ls=n%10;
    s+=ls;
    n=n/10;


}
        System.out.println(s);

//        do{
//            n=n%2;
//
//        }while(n>1);
    }

}
