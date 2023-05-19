package com.neighbor.market.service;

import com.neighbor.market.dto.DealPostDTO;

import java.util.List;

public interface DealPostService {
    public void write(DealPostDTO dto);
    public List<DealPostDTO> list();
    public DealPostDTO detail(Long postNum);
}
