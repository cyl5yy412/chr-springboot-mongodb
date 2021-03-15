package com.chryl.repo;


import com.chryl.po.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created By Chr on 2019/6/26.
 */
public interface BaseMongoRepository extends MongoRepository<User, String> {//第一个参数是哪个类,第二个参数id类型

}
