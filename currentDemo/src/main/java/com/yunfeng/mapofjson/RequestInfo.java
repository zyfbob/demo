package com.yunfeng.mapofjson;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class RequestInfo {

        private String reqestId;

        //  private Tax tax;
        private Map<String, TaxDto> tax = new HashMap<>();


}
