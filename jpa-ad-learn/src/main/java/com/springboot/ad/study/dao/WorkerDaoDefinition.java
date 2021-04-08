package com.springboot.ad.study.dao;

import com.springboot.ad.study.entity.Worker;
import org.springframework.data.repository.RepositoryDefinition;

/**
 *
 */
@RepositoryDefinition(domainClass = Worker.class, idClass = Long.class)
public interface WorkerDaoDefinition {

    Worker findByName(String name);
}
