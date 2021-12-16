package com.sujata.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Element;

@Repository
@Transactional
public interface ElementDao extends JpaRepository<Element, Integer> {

}
