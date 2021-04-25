package com.example.demo;


import com.example.demo.repository.JdbcTemplateMemberRepository;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.MemoryMemberRepository;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

//    @Bean
//    @Profile("test")
////    public MemberRepository memberRepository(){
////        return new MemoryMemberRepository();
//    }


    @Bean
//    @Profile("product")
    public MemberRepository memberRepository(){
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
