package com.chryl.controller;

import com.chryl.repo.BaseMongoRepository;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 未实现
 * <p>
 * Created By Chr on 2019/6/28.
 */
@RestController
@RequestMapping("/m")
public class MongoController2 {
    @Autowired
    private BaseMongoRepository baseMongoRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/show00")
    public String show00() {

        return "suc";
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @GetMapping("/show0")
    public String show0() {
//        条件列表：
        BasicDBList condList = new BasicDBList();
//        临时条件对象：
        BasicDBObject cond = null;
        cond.put("s_name", "nancy");
        condList.add(cond);
//        DBCollection collection = MongoDBUtil.getDBCollection("acc");
//        DBCollection coll = db.getCollection();


        return "";
    }

    @GetMapping("/show1")
    public String show1() {
//        key 为指定显示的字段。
//        codition 是查询条件。
        BasicDBObject condition = new BasicDBObject();//条件
        condition.append(
                "createTime", new BasicDBObject("$gt", Long.valueOf("1365492600111"))
                        .append("$lt", "1367119800803"));
        BasicDBObject key = new BasicDBObject("vid", 1);//指定需要显示列
//        DBCursor cursor = video_info.find(condition, key);
        return "suc";
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @GetMapping("/show2")
    public String show2() {


        return "";
    }
}
