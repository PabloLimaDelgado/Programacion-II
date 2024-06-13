package com.example.EntregaParcial.services.purchases;

import com.example.EntregaParcial.entities.purchases.DetailRequest;
import com.example.EntregaParcial.repositories.purchases.DetailRequestRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailRequestService extends BaseService<DetailRequest, Long> {
    @Autowired
    private DetailRequestRepository detailRequestRepository;
    public DetailRequestService(DetailRequestRepository detailRequestRepository){
        super(detailRequestRepository);
    }

    @Transactional
    public List<DetailRequest> listByRequest(Long idRequest) throws Exception {
        try {
            return detailRequestRepository.findAllByRequestId(idRequest);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
