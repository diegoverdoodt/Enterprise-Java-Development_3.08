package com.example.demo.ModelEjercicio1;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chapters")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chapter_id")
    private Integer chapterId;

    @Column(name = "chapter_name")
    private String chapterName;

    @Column(name = "chapter_district")
    private String chapterDistrict;

    @ManyToOne
    @JoinColumn(name = "chapter_president_member_id")
    private Member chapterPresident;

    @OneToMany
    @JoinColumn(name = "member_id")
    @Column(name = "member_list")
    private List<Member> listOfMember;


    public Integer getChapterId() {
        return chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterDistrict() {
        return chapterDistrict;
    }

    public void setChapterDistrict(String chapterDistrict) {
        this.chapterDistrict = chapterDistrict;
    }

    public Member getChapterPresident() {
        return chapterPresident;
    }

    public void setChapterPresident(Member chapterPresident) {
        this.chapterPresident = chapterPresident;
    }

    public List<Member> getListOfMember() {
        return listOfMember;
    }

    public void setListOfMember(List<Member> listOfMember) {
        this.listOfMember = listOfMember;
    }
}
