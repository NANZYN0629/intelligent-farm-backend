package com.sipc.intelligentfarmbackend.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ExportTxt {

    /**
     * 将数据列表导出为TXT文件
     * @param data 要导出的数据列表（每个元素为一行）
     * @param filePath 输出文件路径（如：D:/export/data.txt）
     */
    public static void exportToTxt(List<String> data, String filePath) {
        try {
            // 确保父目录存在
            Path path = Path.of(filePath);
            if (!Files.exists(path.getParent())) {
                Files.createDirectories(path.getParent());
            }

            // 写入文件（覆盖模式）
            Files.write(path, data,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException e) {
            throw new RuntimeException("导出TXT文件失败: " + e.getMessage(), e);
        }
    }
}
