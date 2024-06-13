package com.example.EntregaParcial.repositories.purchases;

import com.example.EntregaParcial.entities.purchases.Request;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends BaseRepository<Request, Long> {
    List<Request> findAllByClientId(Long clientId);
    List<Request> findAllByEmployeeId(Long employeeId);
    List<Request> findAllByBranchId(Long branchId);
}
