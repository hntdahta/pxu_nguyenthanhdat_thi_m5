package com.codegym.repository;


import com.codegym.model.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoomRepository extends PagingAndSortingRepository<Room,Long> {

    Iterable<Room> findAllByNameContains(String name);

    @Query(value = "select * from Room",nativeQuery = true)
    Iterable<Room> findALlByQuery();
}
