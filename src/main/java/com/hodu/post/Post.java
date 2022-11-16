package com.hodu.post;

import com.hodu.hashtag.Hashtag;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String date;
    private String youtubeCode;
    private String youtubeTitle;
    private String content;
    private String conectedFilename;
    private String regidate;
    private String editdate;

    @ManyToMany
    private List<Hashtag> tags;
}
