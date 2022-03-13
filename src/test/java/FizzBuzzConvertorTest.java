import org.junit.jupiter.api.Test;

import java.util.Scanner;

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
    public void shouldReturnBuzzWhenInputIsMultipleOf3(){
        FizzBuzzConvertor fizzBuzzConvertor=new FizzBuzzConvertor();
        String result = fizzBuzzConvertor.convert(6);
        assertEquals("Fizz",result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIsMultipleOf15(){
        FizzBuzzConvertor fizzBuzzConvertor=new FizzBuzzConvertor();
        String result = fizzBuzzConvertor.convert(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void output(){
        FizzBuzzConvertor fizzBuzzConvertor=new FizzBuzzConvertor();
        //System.out.println("enter a number : ");
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        for (int i=1;i<=16;i++){
            System.out.println(fizzBuzzConvertor.convert(i));
        }
    }



}
