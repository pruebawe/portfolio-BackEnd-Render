package com.portfolio.ML.Controller;

import com.portfolio.ML.Dto.dtoProyecto;
import com.portfolio.ML.Entity.Proyecto;
import com.portfolio.ML.Security.Controller.Mensaje;
import com.portfolio.ML.Service.SProyecto;
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

@RestController
@RequestMapping("proy")
@CrossOrigin(origins = "https://frontend-ml.web.app/")
public class CProyecto {
    @Autowired
    SProyecto sProyecto;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> list(){
        List<Proyecto> list = sProyecto.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id") int id){
        if(!sProyecto.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Proyecto proyecto = sProyecto.getOne(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyecto dtoproy){
        if(StringUtils.isBlank(dtoproy.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sProyecto.existsByNombre(dtoproy.getNombre()))
            return new ResponseEntity(new Mensaje("Ese proyecto existe"), HttpStatus.BAD_REQUEST);

        Proyecto proyecto = new Proyecto(
                dtoproy.getNombre(), dtoproy.getFecha(), dtoproy.getDescripcion(), dtoproy.getImgProy(), dtoproy.getUrl());
        sProyecto.save(proyecto);

        return new ResponseEntity(new Mensaje("Proyecto agregado"), HttpStatus.OK);
    }
    
     @PutMapping("/update/{id}")
    public ResponseEntity<?>update(@PathVariable("id") int id,@RequestBody dtoProyecto dtoproy){
        if(!sProyecto.existsById(id))
            return new ResponseEntity(new Mensaje ("El id no existe"), HttpStatus.BAD_REQUEST);

        if(sProyecto.existsByNombre(dtoproy.getNombre()) && sProyecto.getByNombre(dtoproy.getNombre()).get().getId() != id)
            return new ResponseEntity(new Mensaje ("Ese Proyecto ya existe"), HttpStatus.BAD_REQUEST);

        if(StringUtils.isBlank(dtoproy.getNombre()))
            return new ResponseEntity(new Mensaje ("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        Proyecto proyecto = sProyecto.getOne(id).get();
        proyecto.setNombre(dtoproy.getNombre());
        proyecto.setFecha (dtoproy.getFecha());
        proyecto.setDescripcion(dtoproy.getDescripcion());
        proyecto.setImgProy(dtoproy.getImgProy());
        proyecto.setUrl(dtoproy.getUrl());

        sProyecto.save(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto actualziado"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>delete(@PathVariable("id") int id){
        if(!sProyecto.existsById(id))
         return new ResponseEntity(new Mensaje ("El id no existe"), HttpStatus.BAD_REQUEST);

        sProyecto.delete(id);

        return new ResponseEntity(new Mensaje("Proyecto eliminado"), HttpStatus.OK);
    }

}
