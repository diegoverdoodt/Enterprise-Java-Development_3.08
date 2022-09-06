package com.example.demo.ModelEjercicio1;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_id;

    private String name;

    @Column(columnDefinition = "ENUM('ACTIVE','LAPSED')")
    @Enumerated(EnumType.STRING)
    private MemberStatus memberStatus;

    @Column(name = "renewal_date")
    private Date renewalDate;

    @ManyToOne()
    private Chapter chapter;

    public Integer getMember_id() {
        return member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
}
