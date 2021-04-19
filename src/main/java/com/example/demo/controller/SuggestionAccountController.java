package com.example.demo.controller;

import com.example.demo.domain.SuggestionsAccount;
import com.example.demo.service.SuggestionAccountService;
import com.example.demo.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/suggestion")
public class SuggestionAccountController {

    @Autowired
    private SuggestionAccountService suggestionAccountService;

    @GetMapping(value = "getAccount")
    public Object getList() throws IOException {
        List<SuggestionsAccount> list = suggestionAccountService.selectAll();
        return JsonData.buildSuccess(list);
    }


}
