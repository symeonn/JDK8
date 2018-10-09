package mario.utils.stream;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.mapping;

public class Main {

    public static void main(String[] args) {

        po();
    }

    private static void po() {
        Stream<A> integerStream = Stream.iterate(new A(BigInteger.ZERO), n -> {
            BigInteger add = n.getField().add(BigInteger.ONE);
            return new A(add);
        }).limit(10);

        System.out.println(integerStream);

        List<BigInteger> collect = integerStream.collect(mapping(a -> a.getField(), Collectors.toList()));
    }

    public static class A {

        BigInteger field;


        public A(BigInteger integer) {
            field = integer;
        }

        public BigInteger getField() {
            return field;
        }
    }


}
