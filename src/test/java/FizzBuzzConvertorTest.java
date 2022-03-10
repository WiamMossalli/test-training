import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzConvertorTest {

    @Test
    public void shouldReturnFizzWhenInputIs3(){
        FizzBuzzConvertor fizzBuzzConvertor=new FizzBuzzConvertor();
        String result = fizzBuzzConvertor.convert(3);
        assertEquals("Fizz",result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIs5(){
        FizzBuzzConvertor fizzBuzzConvertor=new FizzBuzzConvertor();
        String result = fizzBuzzConvertor.convert(5);
        assertEquals("Buzz",result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIs6(){
        FizzBuzzConvertor fizzBuzzConvertor=new FizzBuzzConvertor();
        String result = fizzBuzzConvertor.convert(6);
        assertEquals("Buzz",result);
    }



}
