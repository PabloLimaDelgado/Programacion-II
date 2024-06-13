package com.example.EntregaParcial.services.purchases;

import com.example.EntregaParcial.entities.purchases.DetailRequest;
import com.example.EntregaParcial.entities.purchases.Request;
import com.example.EntregaParcial.repositories.purchases.RequestRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService extends BaseService<Request, Long> {
    @Autowired
    private RequestRepository requestRepository;
    @Autowired
    private DetailRequestService detailRequestService;
    public RequestService(RequestRepository requestRepository){
        super(requestRepository);
    }

    @Transactional
    public Request calculateTotal(Request request) throws Exception {
        try{
            List<DetailRequest> detailRequests = detailRequestService.listByRequest(request.getId());
            Double total = 0.0;
            if (detailRequests != null && !detailRequests.isEmpty()){
                total = detailRequests.stream()
                        .mapToDouble(detail -> detail.getSubtotal())
                        .sum();
            }

            request.setTotal(total);
            return requestRepository.save(request);

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Request update(Request request) throws Exception {
        try{
            calculateTotal(request);
            return requestRepository.save(request);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Request> listByClient(Long clientId) throws Exception {
        try {
            return requestRepository.findAllByClientId(clientId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Request> listByEmployee(Long employeeId) throws Exception {
        try {
            return requestRepository.findAllByEmployeeId(employeeId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Request> listByBranch(Long branchId) throws Exception {
        try {
            return requestRepository.findAllByBranchId(branchId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
