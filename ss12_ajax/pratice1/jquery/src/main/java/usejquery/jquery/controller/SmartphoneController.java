package usejquery.jquery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import usejquery.jquery.model.Smartphone;
import usejquery.jquery.service.SmartPhoneService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("smartphones")
public class SmartphoneController {
    @Autowired
    private SmartPhoneService smartPhoneService;

    @GetMapping
    public ResponseEntity<List<Smartphone>> allPhones() {
        List<Smartphone> smartphoneList = smartPhoneService.findAll();
        if (smartphoneList.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(smartphoneList,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Smartphone> createSmartphone(@RequestBody Smartphone smartphone) {
        return new ResponseEntity<>(smartPhoneService.save(smartphone), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Smartphone> deleteSmartphone(@PathVariable Long id) {
        Optional<Smartphone> smartphoneOptional = smartPhoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartPhoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }

}