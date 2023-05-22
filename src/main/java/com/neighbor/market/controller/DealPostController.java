package com.neighbor.market.controller;

import com.neighbor.market.dto.DealPostDTO;
import com.neighbor.market.service.DealPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DealPostController {
    private final DealPostService dealPostService;

    @Autowired
   public DealPostController(DealPostService dealPostService){
       this.dealPostService = dealPostService;
   }

    @GetMapping("/test")
    public String test() {
        DealPostDTO dto = new DealPostDTO();
        dto.setMemberId(1L);
        dto.setRegion("testaddress");
        dto.setTitle("그루트 팝니다");
        dto.setContent("별로 안썼어요");
        dto.setPostType(1);
        dealPostService.write(dto);
        return "neighborDealPost/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", dealPostService.list());
        return "neighborDealPost/list";
    }

    @GetMapping("/detail")
    public String detail(Long postNum, Model model) {
        model.addAttribute("dto", dealPostService.detail(postNum));
        return "neighborDealPost/detail";
    }

}
