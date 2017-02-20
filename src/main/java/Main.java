/**
 * Created by Andrew on 18.02.2017. s
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, -5, 8, 16, 32, -285, 13, 11, 0, 0};

        String[] arrays = {"Hello world", "My name", "is", "Andrew"};

        ArrayProcessor<Integer> arrayProcessor = new ArrayProcessor(array);
        ArrayProcessor<String> arrayProcessor2 = new ArrayProcessor(arrays);

        System.out.println(arrayProcessor.getMax());
        System.out.println(arrayProcessor2.getMax());

        System.out.println( arrayProcessor.getType() );
        System.out.println( arrayProcessor2.getType() );
    }


}
