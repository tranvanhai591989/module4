package dictionary.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepositoryImpl implements DictionaryRepository {

    private static Map<String, String> dictionaryArrayList = new HashMap<>();

    static {
        dictionaryArrayList.put("one", "mot");
        dictionaryArrayList.put("two", "hai");
        dictionaryArrayList.put("three", "ba");
        dictionaryArrayList.put("four", "bon");
        dictionaryArrayList.put("five", "nam");
        dictionaryArrayList.put("six", "sau");
        dictionaryArrayList.put("seven", "bay");
        dictionaryArrayList.put("eight", "tam");
        dictionaryArrayList.put("mine", "chin");
        dictionaryArrayList.put("ten", "muoi");
    }

    @Override
    public Map<String, String> getData() {
        return dictionaryArrayList;
    }

}
