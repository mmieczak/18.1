import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {

    public static void main(String[] args) {

        Stream.iterate(8, x -> x + 1)
                .filter(x -> x > 100)
                .filter(x -> x % 5 == 0)
                .map(x -> x * 3)
                .limit(10)
                .forEach(System.out::println);
    }
}
