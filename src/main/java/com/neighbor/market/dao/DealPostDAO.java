package com.neighbor.market.dao;

import com.neighbor.market.dto.DealPostDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DealPostDAO {
    @Insert("insert into post (memberId, region, title, content, postType) values (#{memberId}, #{region}, #{title}, #{content}, #{postType})")
    public void write(DealPostDTO dto);

    @Select("select a.postNum, memberId, region, title, content, createdAt, updateAt, countNum, postType, productId, price, productImage, c.categoryName from post a inner join product b on a.postNum = b.postNum inner join category c on b.categoryId = c.categoryId")
    public List<DealPostDTO> list();

    @Select("select a.postNum, memberId, region, title, content, createdAt, updateAt, countNum, postType, productId, price, productImage, c.categoryName from post a inner join product b on a.postNum = b.postNum inner join category c on b.categoryId = c.categoryId where a.postNum = #{postNum}")
    public DealPostDTO detail(Long postNum);

}
