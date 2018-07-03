package com.example.service;

import com.example.domain.Smartphone;
import com.example.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class SmartphoneService {
	@Autowired
	SmartphoneRepository smartphoneRepository;
 	public List<Smartphone> findAll(){
    	return smartphoneRepository.findAll(new Sort(Sort.Direction.ASC,"id"));
 	}
 	
    public Page<Smartphone> findAll(Pageable pageable) {
        return smartphoneRepository.findAll(pageable);
    }
    public Smartphone findOne(Integer id) {
        return smartphoneRepository.findOne(id);
    }  
    
    public Smartphone create(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    public Smartphone save(Smartphone smartphone) {
    	return smartphoneRepository.save(smartphone);
    }

    public void delete(Integer id) {
        smartphoneRepository.delete(id);
    }
}