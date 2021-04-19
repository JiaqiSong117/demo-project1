package com.example.demo.service;

import com.example.demo.domain.NewsMedia;
import com.example.demo.domain.SuggestionsAccount;

import java.io.IOException;
import java.util.List;

public interface SuggestionAccountService {
    List<SuggestionsAccount> selectAll() throws IOException;
}

