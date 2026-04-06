package comShofaKhafiy.project.modul1.codelab.belajar.wildcard;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();

        //list Integer
        List <Integer> integerList = Arrays.asList(10,20,30);

        //list double
        List <Double> doubleList = Arrays.asList(2.0,4.8,8.9);

        processor.printNumbers(integerList);
        processor.printNumbers(doubleList);
    }
}

