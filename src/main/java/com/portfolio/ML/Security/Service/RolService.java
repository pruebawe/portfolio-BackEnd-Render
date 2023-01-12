package com.portfolio.ML.Security.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import com.portfolio.ML.Security.Entity.Rol;
import com.portfolio.ML.Security.Enums.RolNombre;
import com.portfolio.ML.Security.Repository.iRolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired 
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
