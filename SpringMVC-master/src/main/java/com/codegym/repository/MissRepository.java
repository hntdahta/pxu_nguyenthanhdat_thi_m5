package com.codegym.repository;
import com.codegym.model.Miss;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MissRepository extends PagingAndSortingRepository<Miss,Long> {
    Iterable<Miss> findAllByNameContains(String name);

    @Query(value = "select * from Miss",nativeQuery = true)
    Iterable<Miss> findALlByQuery();
}
