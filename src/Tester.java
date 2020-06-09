import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {

    public static void main(String[] args) {

        List<Integer> numberCollection = Stream.iterate(8, x -> x + 1)
                .filter(x -> x > 100)
                .filter(x -> x % 5 == 0)
                .map(x -> x * 3)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("First 10 elements of Stream:");
        System.out.println(numberCollection);
    }
}
