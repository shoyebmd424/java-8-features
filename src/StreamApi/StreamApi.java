package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
//        create  alist and filter all even numbers from list

        List<Integer>  l1= Arrays.asList(new Random().ints(10,100,110).boxed().toArray(Integer[]::new));
//l1.add(23);
        System.out.println(l1);

        Stream<Integer> stream=l1.stream();
     List<Integer>list2=   stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list2);


//        Array of object




    }
}
