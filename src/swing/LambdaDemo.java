package swing;

interface Add {

    int addition(int a, int b);
}

public abstract class LambdaDemo implements Add{

    public static void main(String[] args) {

        //lanbda expression return keyword.
        Add add = (int a, int b) -> {
            int sum = a + b;
            return sum;
        };
        int sum = add.addition(10, 30);
        System.out.println("sum                      " + sum);
    }

 
}
