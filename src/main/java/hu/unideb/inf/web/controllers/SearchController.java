package hu.unideb.inf.web.controllers;

import hu.unideb.inf.service.WordService;
import hu.unideb.inf.service.domain.WordDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by varadi on 2017.03.26..
 */
@RestController
@RequestMapping("/words")
public class SearchController {

    @Resource
    WordService wordService;

    @RequestMapping(value="/search",method = RequestMethod.GET)
    public List<WordDTO> searchForThisWord(@RequestParam(value = "word") String word, @RequestParam(value="sourceLang") String sourceLang, @RequestParam(value="destLang") String destLang){
        return wordService.findMeaning(word,sourceLang,destLang);
    }
}
