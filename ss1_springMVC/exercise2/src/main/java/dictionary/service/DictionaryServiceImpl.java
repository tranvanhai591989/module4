package dictionary.service;

import dictionary.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private DictionaryRepository dictionaryRepository;


    public String getData(String keyword){
        Map<String,String>dictionaryArrayList = dictionaryRepository.getData();
        String result = dictionaryArrayList.get(keyword);
        if (result == null) {
            return result = "not exits";
        }
        return result;

    }

}