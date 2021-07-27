package com.example.interviewproject.controller;

import com.example.interviewproject.service.WatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WatchController {

    private WatchService watchService;

    @GetMapping(value = "/checkout")
    public Integer calculateTotalPrice(@RequestBody List<String> checkoutList) {
        return watchService.calculateTotalPrice(checkoutList);
    }
}
