package com.sipc.intelligentfarmbackend;

import com.sipc.intelligentfarmbackend.pojo.Environment;
import com.sipc.intelligentfarmbackend.util.ExportTxt;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExportTxtText {
    // 新增：测试导出环境数据的方法
    @Test
    public void testExportEnvironmentData() {
        // 创建测试数据（最后6条）
        List<Environment> dataList = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            Environment env = new Environment();
            env.setId(i);
            env.setFieldId(1001);
            env.setNitrogen(new BigDecimal("1." + i));
            env.setPotassium(new BigDecimal("2." + i));
            env.setMoisture(new BigDecimal("50." + i));
            env.setLight(new BigDecimal("1000." + i));
            env.setPhosphorus(new BigDecimal("0.5" + i));
            env.setTemperature(new BigDecimal("25." + i));
            env.setPh(new BigDecimal("6." + i));
            env.setCo2(new BigDecimal("400." + i));
            dataList.add(env);
        }
        
        // 调用导出方法
        ExportTxt.exportEnvironmentData(dataList, "src/main/resources/data/data.txt");
        System.out.println("导出完成，请检查项目根目录下export文件夹");
    }
}