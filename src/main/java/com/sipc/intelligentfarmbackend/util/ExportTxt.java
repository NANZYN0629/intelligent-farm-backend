package com.sipc.intelligentfarmbackend.util;

import com.sipc.intelligentfarmbackend.pojo.Environment;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportTxt {
    // 新增：导出环境数据到txt文件的方法
    public static void exportEnvironmentData(List<Environment> dataList, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // 写入表头
            writer.write("ID,FieldID,Nitrogen,Potassium,Moisture,Light,Phosphorus,Temperature,PH,CO2");
            writer.newLine();
            
            // 写入最后6条数据
            for (Environment env : dataList) {
                writer.write(String.format("%d,%d,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f",
                        env.getId(),
                        env.getFieldId(),
                        env.getNitrogen(),
                        env.getPotassium(),
                        env.getMoisture(),
                        env.getLight(),
                        env.getPhosphorus(),
                        env.getTemperature(),
                        env.getPh(),
                        env.getCo2()));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}