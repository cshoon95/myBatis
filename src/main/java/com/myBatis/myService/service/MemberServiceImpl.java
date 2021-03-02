package com.myBatis.myService.service;

import com.myBatis.myService.dao.MemberDao;
import com.myBatis.myService.model.Member;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberDao memberDao;

    @Override
    public List<Member> selectList() {
        return memberDao.selectList();
    }
}
