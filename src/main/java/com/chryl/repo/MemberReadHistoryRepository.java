package com.chryl.repo;

import com.chryl.po.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Chr.yl on 2021/3/15.
 *
 * @author Chr.yl
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {

//    使用@Query注解可以用Mongodb的JSON查询语句进行查询
//    @Query("{ 'memberId' : ?0 }")
//    List<MemberReadHistory> findByMemberId(Long memberId);


    /**
     * 根据会员id按时间倒序获取浏览记录
     *
     * @param memberId 会员id
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
