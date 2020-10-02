package com.yunfeng.junit_csv;

public class test02 {
    public static void main(String[] args) {
       String json="{\"xx\":\"yyt\",\"S669\":{\"appid\":\"wx5387c26fe5ad3f38\",\"mch_id\":\"1317710601\",\n" +
               "\"certifPath\":\"/opt/appdata/payment/pspcerts/CN/wechat/apiclient_cert_S669.p12\",\n" +
               "\"privateKey\":\"Decathlon00000000000000000000669\"}}";
        StoreConfiguration s669 = CSVAnalysis.getEntityBean(json, "S669");
        System.out.println(s669);
    }



}
