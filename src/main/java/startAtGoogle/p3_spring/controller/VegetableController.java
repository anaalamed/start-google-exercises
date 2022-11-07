package startAtGoogle.p3_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import startAtGoogle.p3_spring.entity.Vegetable;
import startAtGoogle.p3_spring.service.VegetableService;

import java.util.List;


@RestController
@RequestMapping("/veg")
public class VegetableController {
    @Autowired
    private VegetableService vegetableService;
private static final int PAGE_SIZE = 50;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Vegetable>> listVegetables(){
        return ResponseEntity.ok(vegetableService.listVegetables());
    }

    @RequestMapping(value = "filter" ,method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteByType(@RequestParam Vegetable.Type type){
        vegetableService.deleteByType(type);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Vegetable> addVegetable(@RequestBody Vegetable veg){
        return ResponseEntity.ok(vegetableService.add(veg));
    }

}
