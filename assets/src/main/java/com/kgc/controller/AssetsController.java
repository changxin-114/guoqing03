package com.kgc.controller;

import com.kgc.pojo.Assets;
import com.kgc.service.AssetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AssetsController {
    @Resource
    AssetsService assetsService;

    @RequestMapping("/selectAll")
    public String selectAll(Model model, String assetid, Integer assettype){
        List<Assets> assets = assetsService.selectAll(assetid, assettype);
        model.addAttribute("assets",assets);
        return "index";
    }

    @RequestMapping("/add")
    public String add(Assets assets){
        assetsService.add(assets);
        return "redirect:selectAll";
    }
}
