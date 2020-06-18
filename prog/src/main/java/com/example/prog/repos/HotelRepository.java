package com.example.prog.repos;

import com.example.prog.entity.Hotel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface HotelRepository extends CrudRepository<Hotel, Long>{	

}