package com.myBatis.myService.controller;

import com.myBatis.myService.dao.MemberDao;
import com.myBatis.myService.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberDao memberDao;

    @GetMapping("/main")
    public List<Member> main() {
        List<Member> list = memberDao.selectList();
        return list;
    }
}
