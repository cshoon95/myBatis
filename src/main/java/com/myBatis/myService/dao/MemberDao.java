package com.myBatis.myService.dao;

import com.myBatis.myService.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // mapping파일에 있는 sql을 인터페이스로 호출
public interface MemberDao {
    public List<Member> selectList();
}
