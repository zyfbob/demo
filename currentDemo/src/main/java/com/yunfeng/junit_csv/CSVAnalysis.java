package com.yunfeng.junit_csv;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.annotation.PropertyAccessor.GETTER;

public class CSVAnalysis {
    private InputStreamReader fr = null;
    private BufferedReader br = null;

    public CSVAnalysis(String f) throws IOException {
        fr = new InputStreamReader(new FileInputStream(f));
    }

    public List readCSVFile() throws IOException {
        br = new BufferedReader(fr);
        String rec = null;//一行
       List<String> list=new ArrayList<>();
        try {
            while ((rec = br.readLine()) != null) {
                list.add(rec);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                fr.close();
            }
            if (br != null) {
                br.close();
            }
        }
        return list;
    }

    public static void main(String[] args) throws Throwable {
        CSVAnalysis parser = new CSVAnalysis("src/main/resources/json/2.txt");
        List<String> lists = parser.readCSVFile();

        System.out.println(lists);

    }

    public static String getListAsSting(){
        CSVAnalysis parser =null;
        String json=null;
        try {
            parser=new CSVAnalysis("src/main/resources/json/1.txt");
            List<String> lists = parser.readCSVFile();
            json=lists.get(0);
        }catch(Exception e){

        }
        return json;
    }
    private static Charset defaultCharset = Charset.forName("UTF-8");
    private static String keyString="Jd5yp8O1AC4Gh6MA";

    private static ObjectMapper ignoreGetterOm;

    public static ObjectMapper getIgnoreGetterOm(){
        if(ignoreGetterOm == null){
            ignoreGetterOm = new ObjectMapper();
            ignoreGetterOm.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            ignoreGetterOm.setVisibility(GETTER, JsonAutoDetect.Visibility.NONE);
            return ignoreGetterOm;
        }
        return ignoreGetterOm;
    }

    public static StoreConfiguration getEntityBean(String json,String StoreId){
        StoreConfiguration storeConfiguration=null;
        if(ignoreGetterOm == null){
            ignoreGetterOm = new ObjectMapper();
           // ignoreGetterOm.setSerializerProvider()
            try{

                Map<String, StoreConfiguration> map = ignoreGetterOm.readValue(json, new TypeReference<HashMap<String, StoreConfiguration>>() {
                });
                storeConfiguration = map.get(StoreId);

            }catch(Exception e){
               
            }
        }
        return storeConfiguration;
    }

}
