package com.yunfeng.mapofjson;

import lombok.Data;

import java.io.Serializable;

@Data

public class TaxDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;

    private String id;

    private  Short rate;



}
