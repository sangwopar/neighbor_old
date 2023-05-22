package com.neighbor.market.serviceImpl;

import com.neighbor.market.dao.DealPostDAO;
import com.neighbor.market.dto.DealPostDTO;
import com.neighbor.market.service.DealPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealPostServiceImpl implements DealPostService {

    private final DealPostDAO dealPostDAO;

    @Autowired
    public DealPostServiceImpl(DealPostDAO dealPostDAO) {
        this.dealPostDAO = dealPostDAO;
    }

    @Override
    public void write(DealPostDTO dto) {
        dealPostDAO.write(dto);
    }

    @Override
    public List<DealPostDTO> list() {
        return dealPostDAO.list();
    }

    @Override
    public DealPostDTO detail(Long postNum) {
        return dealPostDAO.detail(postNum);
    }
}
