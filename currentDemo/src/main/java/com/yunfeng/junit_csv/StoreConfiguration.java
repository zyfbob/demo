package com.yunfeng.junit_csv;

import lombok.Data;

import java.io.Serializable;

@Data
public class StoreConfiguration implements Serializable {
    private String storeId;
    private String appid;
    private String mch_id;
    //wechat.certifPath
    private String certifPath;
    private String privateKey;



}
