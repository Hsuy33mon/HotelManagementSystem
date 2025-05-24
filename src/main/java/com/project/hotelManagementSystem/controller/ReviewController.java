package com.project.hotelManagementSystem.controller;


import com.project.hotelManagementSystem.entity.Review;
import com.project.hotelManagementSystem.service.HotelService;
import com.project.hotelManagementSystem.service.ReviewService;
import com.sun.jdi.event.StepEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;
    private final HotelService hotelService;

    @GetMapping
    public String findAllReviews(Model model) {
        model.addAttribute("reviews",reviewService.findAllReviews());
        return "reviews/listing";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("review", new Review());
        model.addAttribute("hotels",hotelService.findAllHotels());
        return "reviews/create";
    }

    @PostMapping("/create")
    public String createReview(@ModelAttribute Review review) {
        reviewService.createReview(review);
        return "redirect:/reviews";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@RequestParam Long id, Model model) {
        model.addAttribute("review", reviewService.findReviewById(id));
        model.addAttribute("hotels",hotelService.findAllHotels());
        return "reviews/edit";
    }

    @PostMapping("/update/{id}")
    public String updateReview(@PathVariable Long id, @ModelAttribute Review review) {
        reviewService.updateReview(id, review);
        return "redirect:/reviews";
    }

    @GetMapping("/delete/{id}")
    public String deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return "redirect:/reviews";
    }
}
