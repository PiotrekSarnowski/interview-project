package com.example.interviewproject.controller;

import com.example.interviewproject.service.WatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WatchController {

    private WatchService watchService;

    @PostMapping("/checkout")
    public Integer calculateTotalPrice(@RequestBody List<Long> checkoutList) {
        return watchService.calculateTotalPrice(checkoutList);
    }
}
