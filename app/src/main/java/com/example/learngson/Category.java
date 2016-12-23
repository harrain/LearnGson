package com.example.learngson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by stephen on 2016/12/14.
 */

public class Category {

    @SerializedName("resultcode")
    String resultcode;

    @SerializedName("reason")
    String reason;

    @SerializedName("result")
    List<result> resultList;

    static class result{

        @SerializedName("id")
        String id;

        @SerializedName("catalog")
        String catalog;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<result> getResultList() {
        return resultList;
    }

    public void setResultList(List<result> resultList) {
        this.resultList = resultList;
    }
}
