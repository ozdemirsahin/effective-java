package autoboxing;

public class Test {
    public static void sum (){
        Integer sum=0;
        for(int i=0;i<150;i++ ){
            sum+=i;
        }
    }

    public static void sum_ (){
        Integer sum=0;
        for(Integer i=0;i<150;i++ ){
            sum+=i;
        }
    }

    public static void main(String[] args) {
     long start =System.nanoTime();
     sum();
     long end =System.nanoTime();
     System.out.println(end - start);

     long start_ =System.nanoTime();
     sum_();
     long end_ =System.nanoTime();
     System.out.println(end_ - start_);

    }
}
