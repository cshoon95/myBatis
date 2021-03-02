package com.myBatis.myService.service;

import com.myBatis.myService.model.Member;

import java.util.List;

public interface MemberService {
    public List<Member> selectList();
}
