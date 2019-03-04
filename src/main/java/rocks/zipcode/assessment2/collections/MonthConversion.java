package rocks.zipcode.assessment2.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
   public Map<Integer, String> calender = new TreeMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        calender.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        //throw new NullPointerException();
        return calender.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {

        for(Map.Entry s : calender.entrySet()){
            if (s.getValue() == monthName) {
                return (Integer)s.getKey();
            }
        }
        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        for(Map.Entry s : calender.entrySet()){
            if (s.getKey() == monthNumber) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        for(Map.Entry s : calender.entrySet()){
            if (s.getValue() == monthName) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calender.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        calender.replace(monthNumber, monthName);
    }
}
