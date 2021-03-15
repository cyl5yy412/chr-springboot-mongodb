package com.chryl.service;

import com.chryl.po.MemberReadHistory;

import java.util.List;

/**
 * 会员浏览记录管理Service
 * Created by Chr.yl on 2021/3/15.
 *
 * @author Chr.yl
 */


public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
