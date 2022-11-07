package startAtGoogle.p3_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startAtGoogle.p3_spring.entity.Vegetable;
import startAtGoogle.p3_spring.repository.VegetableRepository;

import java.util.List;

@Service
public class VegetableService {
    @Autowired
    private VegetableRepository vegetableRepository;

    public List<Vegetable> listVegetables(){
        return vegetableRepository.findAll();
    }

    public void deleteByType(Vegetable.Type type){
        vegetableRepository.deleteByType(type);
    }

    public Vegetable add(Vegetable veg){
        return vegetableRepository.add(veg);
    }


}
