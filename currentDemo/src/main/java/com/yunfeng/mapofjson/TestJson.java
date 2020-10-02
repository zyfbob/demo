package com.yunfeng.mapofjson;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.yunfeng.junit_csv.CSVAnalysis;

public class TestJson {
    public static void main(String[] args)throws Exception {
     String json="{\n" +
             "\"reqestId\":\"ddd\",\n" +
             "\"tax\":{\n" +
             "\n" +
             "\"1111\":{\n" +
             "\"id\":\"11\",\n" +
             "\"code\":\"nnn\",\n" +
             "\"rate\":\"10\"},\n" +
             "\"1111\":{\n" +
             "\"id\":\"33\",\n" +
             "\"code\":\"mmm\",\n" +
             "\"rate\":\"11\"}}\n" +
             "}";
     String json2="{\n" +
             "        \"1111\":{\n" +
             "            \"id\":\"11\",\n" +
             "            \"code\":\"nnn\",\n" +
             "            \"rate\":\"11\"\n" +
             "        },\n" +
             "        \"2222\":{\n" +
             "            \"id\":\"33\",\n" +
             "            \"code\":\"mmm\",\n" +
             "            \"rate\":\"12\"\n" +
             "        }\n" +
             "    }";
       /* TypeReference<HashMap<String, TaxDto>> typeRef
                = new TypeReference<>() {};*/
        ObjectMapper objectMapper = CSVAnalysis.getIgnoreGetterOm();
       /* Map<String, TaxDto> requestInfo=  objectMapper.readValue(json2,typeRef);
        System.out.println(requestInfo);*/
        /*RequestInfo requestInfo1 = JSON.parseObject(json, RequestInfo.class);
        System.out.println(requestInfo1);*/
        RequestInfo requestInfo2 = objectMapper.readValue(json, RequestInfo.class);
        System.out.println(requestInfo2);



    }
}
