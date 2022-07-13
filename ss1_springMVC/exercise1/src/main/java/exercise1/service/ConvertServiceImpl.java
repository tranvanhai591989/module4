package exercise1.service;

import org.springframework.stereotype.Service;

@Service
public class ConvertServiceImpl implements ConvertService {
    
    @Override
    public double convert(double usd) {
        return usd * 23000;
    }
}
