package comShofaKhafiy.project.modul1.codelab.belajar.wildcard;

import java.util.List;

public class DataProcessor{

    public void printNumbers (List < ? extends Number> list){
        System.out.println("Data Angka:");

        for (Number num: list){
            System.out.println(num);
        }
    }

}
