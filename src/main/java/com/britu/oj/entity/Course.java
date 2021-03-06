package com.britu.oj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @program: brituoj
 * @description: 教程
 * @author: Gauss
 * @date: 2020-07-29 19:21
 **/
@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;      //id
    private String t_name;  //教程的名字
    private String title;   //页面标题
    private String contentHTML;  //内容
    private Integer preId;  //上一页
    private Integer nextId; //下一页




}
