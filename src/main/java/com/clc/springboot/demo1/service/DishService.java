package com.clc.springboot.demo1.service;

import com.clc.springboot.demo1.facade.so.DishSo;
import com.clc.springboot.demo1.facade.vo.DishVo;

import java.util.List;

public interface DishService {

    List<DishVo> findAllDish();

    Boolean saveDish(DishSo dishSo);

    Boolean deleteDish(DishSo dishSo);

}
