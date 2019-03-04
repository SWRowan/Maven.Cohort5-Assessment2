package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
        list.add(valueToBeAdded);
        Integer[] answer = new Integer[list.size()];
        answer = list.toArray(answer);

        return answer;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
        list.remove(indexToInsertAt);
        list.add(indexToInsertAt, valueToBeInserted);
        Integer[] answer = new Integer[list.size()];
        answer = list.toArray(answer);

        return answer;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
        Integer answer = list.get(indexToFetch);
        return answer;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
        List<Integer> newList = new ArrayList<>();
        for (Integer num : list) {
            if(num % 2 == 0){
                num++;
                newList.add(num);
            } else{
                num--;
                newList.add(num);
            }
        }
        Integer[] answer = new Integer[integerArray.length];
        answer = newList.toArray(answer);
        return answer;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
        List<Integer> newList = new ArrayList<>();
        for (Integer num : list) {
            if(num % 2 == 0) {
                num++;
                newList.add(num);
            } else {
            newList.add(num);
            }
        }
        Integer[] answer = new Integer[integerArray.length];
        answer = newList.toArray(answer);
        return answer;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        List<Integer> list = new ArrayList<>(Arrays.asList(input));
        List<Integer> newList = new ArrayList<>();
        for (Integer num : list) {
            if(num % 2 != 0) {
                num--;
                newList.add(num);
            } else {
                newList.add(num);
            }
        }
        Integer[] answer = new Integer[input.length];
        answer = newList.toArray(answer);
        return answer;
    }
}
