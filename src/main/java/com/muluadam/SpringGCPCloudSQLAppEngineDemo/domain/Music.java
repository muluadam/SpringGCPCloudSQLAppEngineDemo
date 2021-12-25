package com.muluadam.SpringGCPCloudSQLAppEngineDemo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Music {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String singer;

}
