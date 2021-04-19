package com.example.demo.dao;

import com.example.demo.domain.SuggestionsAccount;

import java.io.IOException;
import java.util.List;

public interface SuggestionAccountMapper {

    List<SuggestionsAccount> selectAll();
}
