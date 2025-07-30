package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    private String[] strings = {"Geeks", "Nerds", "Nicknames"};
    List<String> list = Arrays.asList("geeks", "gfg", "geeddasda", "edddddddd", "e", "k", "s");

    public void StreamOf() {
        Stream<String> str = Stream.of(strings);
        // --> strs --> System.out.println(strs)
        str.forEach(System.out::println);
    }

    public void StreamCollect() {
        list.stream()
        .filter(s -> s.length() > 5)
        .map(String::toUpperCase)
        .collect(Collectors.toList())
        .forEach(System.out::println);
    }
}

class RunApp {
    public static void main(String[] args) {
        Streams streams = new Streams();
        streams.StreamOf();
        streams.StreamCollect();
    }
}