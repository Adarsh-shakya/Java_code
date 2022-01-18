import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Data_source1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Mukesh");
        name.add("Supriya");
        name.add("Richa");
        name.add("Radha");
        name.add("Nilam");
        Stream<String > streamname = name.stream();

        Integer[] numbers={2,3,4,5,6,7,44,89,65,90,34};
        Stream<Integer> streamofNumber= Arrays.stream(numbers);
        Stream<Integer> even=streamofNumber.filter(number-> number % 2 == 0);


        IntStream Integerstream;
        Integerstream=IntStream.range(1,100);
        Integerstream=IntStream.rangeClosed(1,100);
        HashSet i=new HashSet();
        i.add("Neeraj");

}

}
