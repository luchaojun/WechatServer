package com.example.springbootdemo.service;

/**
 * @Author：Chaojun_Lu
 * @Date：2024/7/15 23:54
 * @Function：
 */

import com.example.springbootdemo.entity.ProductProgress;
import com.example.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    // 查询数据库中所有信息
    public List<ProductProgress>  getAllProductProgress(){
        return userMapper.getAllProductProgress();
    }

    // 根据ID查询其中一条数据
    public List<ProductProgress> getProductProgressBySaleOrder(String saleOrder){

        return userMapper.getProductProgressBySaleOrder(saleOrder);
    }

//    // 根据ID删除数据库中信息
//    public boolean deleteById(int id){
//    // 用于判断sql语句是否执行
//        boolean flag = false;
//        try{
//            userMapper.deleteById(id);
//            flag = true;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return flag;
//    }
//
//    // 增加一条数据
//    public boolean insert(User user){
//        boolean flag = false;
//        try {
//            userMapper.insert(user);
//            flag = true;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return flag;
//    }
//
//    // 改变数据库中一条数据
//    public boolean updateById(int id){
//        boolean flag = false;
//        try {
//            userMapper.updateById(id);
//            flag = true;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return flag;
//    }
}
