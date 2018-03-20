package iasa.lesson1.n5;

import org.cactoos.text.SplitText;
import org.cactoos.text.TextOf;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class LongTextProcess {
    public void process(String origin) throws IOException {
        Map<String, Long> map = StreamSupport.stream(
                new SplitText(
                        Jsoup.parse(
                                new TextOf(
                                        new URL(origin)
                                ).asString())
                                .text(),
                        new TextOf("\\W+")
                ).spliterator(), false)
                .filter(s -> s.length() > 2)
                .map(String::toLowerCase)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ))
                .forEach((word, count) -> System.out.printf("C:%3d, W:%s\n", count, word));

    }
}
