package com.example.springbootdemo.mapper;

/**
 * @Author：Chaojun_Lu
 * @Date：2024/7/15 23:51
 * @Function：
 */
import com.example.springbootdemo.entity.ProductProgress;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    // 查询数据库中所有信息
    List<ProductProgress> getAllProductProgress();

    // 根据ID查询其中一条数据
    List<ProductProgress> getProductProgressBySaleOrder(String saleOrder);

//    // 根据ID删除数据库中信息
//    boolean deleteById(int id);
//
//    // 增加一条数据
//    boolean insert(User user);
//
//    // 改变数据库中一条数据
//    boolean updateById(int id);
}
