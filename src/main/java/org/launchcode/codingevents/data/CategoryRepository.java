package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chris Bay
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {}
