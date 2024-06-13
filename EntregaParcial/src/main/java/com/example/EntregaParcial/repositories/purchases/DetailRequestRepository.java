package com.example.EntregaParcial.repositories.purchases;


import com.example.EntregaParcial.entities.purchases.DetailRequest;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailRequestRepository extends BaseRepository<DetailRequest, Long> {
    List<DetailRequest> findAllByRequestId(Long idRequest);

}
