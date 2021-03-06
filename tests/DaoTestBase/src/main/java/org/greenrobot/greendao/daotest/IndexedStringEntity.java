package org.greenrobot.greendao.daotest;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "INDEXED_STRING_ENTITY".
 */
@Entity
public class IndexedStringEntity {

    @Id
    private Long id;

    @Index
    private String indexedString;

    @Generated
    public IndexedStringEntity() {
    }

    public IndexedStringEntity(Long id) {
        this.id = id;
    }

    @Generated
    public IndexedStringEntity(Long id, String indexedString) {
        this.id = id;
        this.indexedString = indexedString;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndexedString() {
        return indexedString;
    }

    public void setIndexedString(String indexedString) {
        this.indexedString = indexedString;
    }

}
