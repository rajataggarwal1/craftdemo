package com.intuit.craftdemo.domain.model.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends CrudRepository<PlayerEntity, String>
{


}