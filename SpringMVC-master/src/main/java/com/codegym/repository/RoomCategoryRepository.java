package com.codegym.repository;

import com.codegym.model.RoomCategory;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoomCategoryRepository extends PagingAndSortingRepository<RoomCategory,Long> {
}
