package com.pimbackend.repository;

import com.pimbackend.entities.FolhaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolhaPagamentoRepository extends JpaRepository<FolhaPagamento, Long> {
}
