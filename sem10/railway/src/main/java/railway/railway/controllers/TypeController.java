package railway.railway.controllers;

import railway.railway.models.TrainType;
import railway.railway.services.TrainService;
import railway.railway.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/types")
public class TypeController {
    @Autowired
    private TypeService typeService;
    @Autowired
    private TrainService trainService;

    @GetMapping("")
    public List<TrainType> getAllTypes(){
        return typeService.getAllTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrainType> get(@PathVariable Integer id){
        try{
            TrainType trainType = typeService.getTypeById(id);
            return new ResponseEntity<TrainType>(trainType, HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<TrainType>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/name/{name}")
    public List<TrainType> getByName(@PathVariable String name){
        return typeService.getTypeByName(name);
    }

    @PostMapping("/")
    public void add(@RequestBody TrainType trainType){
        typeService.saveType(trainType);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        typeService.deleteType(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody TrainType trainType, @PathVariable Integer id){
        try{
            TrainType baseType = typeService.getTypeById(id);
            baseType.updateType(trainType);
            typeService.saveType(baseType);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
