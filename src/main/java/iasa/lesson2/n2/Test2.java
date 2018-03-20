package iasa.lesson2.n2;

public class Test2 {
    public static void main(String[] args) {
        ConvetGen<Integer, Integer> conv1 = new ConvetGen<Integer, Integer>() {
            @Override
            public Integer apply(Integer origin) {
                return null;
            }
        };

        ConvetGen<String, String> conv2 = new ConvetGen<String, String>() {
            @Override
            public String apply(String origin) {
                return null;
            }
        };

        ConvetGen<Integer, String> conv3 = new ConvetGen<Integer, String>() {
            @Override
            public String apply(Integer origin) {
                return null;
            }
        };

        Usage<Integer, Integer> u1 = new Usage<>(conv1);
        Integer i1 = u1.process(1);

        Usage<String, String> u2 = new Usage<>(conv2);
        String s2 = u2.process("AAA");

        Usage<Integer, String> u3 = new Usage<>(conv3);
        String s3 = u3.process(1);
    }
}
