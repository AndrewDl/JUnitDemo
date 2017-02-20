/**
 * Created by Andrew on 18.02.2017.
 */
public class ArrayProcessor<T> {

    private T[] array;

    public ArrayProcessor(T[] array){
        this.array = array;
    }

    public T getMax(){
        if ((array != null ) && (array.length > 0)) {
            if (array.getClass().equals(Integer[].class)) {
                return getMax((Integer[]) array);
            } else if (array.getClass().equals(String[].class)) {
                return getMax((String[]) array);
            }
        }
        return null;
    }

    public String getType(){

        String type = array.getClass().toString();
        return type;
    }

    private T getMax(Integer[] array) {

        Integer max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return (T)max;
    }

    private T getMax(Character[] array) {
        Character max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return (T)max;
    }

    private T getMax(String[] array) {
        int max = 0;
        T result = null;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]!=null){
                max = i;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] != null)) {
                if (array[i].length() > array[max].length()) max = i;
                result = (T)array[max];
            }
        }
        return result;
    }
}
