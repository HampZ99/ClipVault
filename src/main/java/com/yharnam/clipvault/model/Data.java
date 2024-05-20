package com.yharnam.clipvault.model;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {
    @SerializedName("data")
    private List<ClipsData> dataList = new ArrayList<>();

    public List<ClipsData> getDataList() {
        return dataList;
    }

    public void setDataList(List<ClipsData> dataList) {
        this.dataList = dataList;
    }
}
