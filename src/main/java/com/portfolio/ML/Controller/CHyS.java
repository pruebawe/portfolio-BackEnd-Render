package com.portfolio.ML.Controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.ML.Dto.dtoHyS;
import com.portfolio.ML.Entity.HyS;
import com.portfolio.ML.Security.Controller.Mensaje;
import com.portfolio.ML.Service.SHyS;

@RestController
@RequestMapping("/hys")
//*@CrossOrigin(origins = "https://frontend-ml.web.app/")*//
@CrossOrigin(origins = "http://localhost:4200/")
public class CHyS {
    @Autowired
    SHyS shys;

    @GetMapping("/lista")
    public ResponseEntity<List<HyS>> list(){
        List<HyS> list= shys.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<HyS> getById(@PathVariable("id") int id){
        if(!shys.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        HyS hys = shys.getOne(id).get();
        return new ResponseEntity(hys, HttpStatus.OK);
    }

    @PostMapping ("/create")
    public ResponseEntity<?> create(@RequestBody dtoHyS dtohys){
        if(StringUtils.isBlank(dtohys.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(shys.existsByNombre(dtohys.getNombre()))
            return new ResponseEntity(new Mensaje("Esa habilidad existe"), HttpStatus.BAD_REQUEST);

        HyS hys = new HyS(dtohys.getNombre(), dtohys.getPorcentaje());
        shys.save(hys);

        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?>update(@PathVariable("id") int id,@RequestBody dtoHyS dtohys){
        if(!shys.existsById(id))
            return new ResponseEntity(new Mensaje ("El id no existe"), HttpStatus.BAD_REQUEST);

        if(shys.existsByNombre(dtohys.getNombre()) && shys.getByNombre(dtohys.getNombre()).get().getId() != id)
            return new ResponseEntity(new Mensaje ("Esa habilidad ya existe"), HttpStatus.BAD_REQUEST);

        if(StringUtils.isBlank(dtohys.getNombre()))
            return new ResponseEntity(new Mensaje ("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        HyS hys = shys.getOne(id).get();
        hys.setNombre(dtohys.getNombre());
        hys.setPorcentaje((dtohys.getPorcentaje()));

        shys.save(hys);
        return new ResponseEntity(new Mensaje("Habilidad actualziada"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>delete(@PathVariable("id") int id){
        if(!shys.existsById(id))
         return new ResponseEntity(new Mensaje ("El id no existe"), HttpStatus.BAD_REQUEST);

        shys.delete(id);

        return new ResponseEntity(new Mensaje("Habilidad eliminada"), HttpStatus.OK);
    }

}
