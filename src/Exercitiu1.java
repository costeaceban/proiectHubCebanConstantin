import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;

// Program to reverse an `ArrayList` in Java
public class Exercitiu1
{
    public static<T> List<T> reverseList(List<T> list)
    {
        return IntStream.range(0, list.size())
                .map(i -> (list.size() - 1 - i))    // IntStream
                .mapToObj(list::get)                // Stream<T>
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(90, 80, 70, 60, 50, 40, 30, 20, 10);

        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }
}