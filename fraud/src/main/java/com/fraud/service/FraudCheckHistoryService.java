package com.fraud.service;

import com.fraud.entity.FraudCheckHistory;
import com.fraud.repository.FraudCheckHistoryRepository;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FraudCheckHistoryService {
    private final FraudCheckHistoryRepository repository;
    public boolean isFraudulentCustomer(Integer customerId) {

        repository.save(FraudCheckHistory.builder()
                .isFraudster(false)
                .customerId(customerId)
                .createdAt(LocalDateTime.now())
            .build());

        return false;
    }

}
