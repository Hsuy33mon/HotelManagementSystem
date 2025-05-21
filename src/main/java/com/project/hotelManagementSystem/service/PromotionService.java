package com.project.hotelManagementSystem.service;

import com.project.hotelManagementSystem.entity.Promotion;
import com.project.hotelManagementSystem.repository.PromotionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PromotionService {

    private final PromotionRepository promotionRepository;

    public Promotion createPromotion(Promotion promotion) {
        return this.promotionRepository.save(promotion);
    }

    public Promotion updatePromotion(Long id,Promotion promotion) {
        Optional<Promotion> promotionOp = promotionRepository.findById(id);
        if(promotionOp.isPresent()) {
            Promotion updatedPromotion = promotionOp.get();
            updatedPromotion.setCode(promotion.getCode());
            updatedPromotion.setDiscountType(promotion.getDiscountType());
            updatedPromotion.setDiscountAmount(promotion.getDiscountAmount());
            updatedPromotion.setStartDate(promotion.getStartDate());
            updatedPromotion.setEndDate(promotion.getEndDate());
            updatedPromotion.setPointAmount(promotion.getPointAmount());
            updatedPromotion.setUsageLimit(promotion.getUsageLimit());
            updatedPromotion.setTimesUsed(promotion.getTimesUsed());
            return this.promotionRepository.save(updatedPromotion);
        }
        return null;
    }

    public void deletePromotion(Long id) {
        Optional<Promotion> promotionOp = promotionRepository.findById(id);
        if(promotionOp.isPresent()) {
            promotionRepository.deleteById(id);
        }
    }

    public Promotion findPromotionById(Long id) {
        Optional<Promotion> promotionOp = promotionRepository.findById(id);
        return promotionOp.orElse(null);
    }

    public List<Promotion> findAllPromotions() {
        return this.promotionRepository.findAll();
    }
}