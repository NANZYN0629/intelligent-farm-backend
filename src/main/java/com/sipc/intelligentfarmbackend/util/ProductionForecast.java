package com.sipc.intelligentfarmbackend.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductionForecast {
    
    /**
     * 执行Python脚本
     * @param pythonPath Python解释器路径（如："C:/Python39/python.exe"）
     * @param scriptPath Python脚本路径
     * @param args 传递给脚本的参数列表
     * @return Python程序输出结果
     * @throws IOException 执行异常
     * @throws InterruptedException 进程中断异常
     */
    public static String executePythonScript(String pythonPath, String scriptPath, String... args) 
        throws IOException, InterruptedException {
        
        // 构建命令参数
        String[] cmdArray = new String[args.length + 2];
        cmdArray[0] = pythonPath;
        cmdArray[1] = scriptPath;
        System.arraycopy(args, 0, cmdArray, 2, args.length);

        // 执行Python进程
        Process process = Runtime.getRuntime().exec(cmdArray);
        
        // 读取标准输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line).append("\n");
        }
        
        // 读取错误流
        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        while ((line = errorReader.readLine()) != null) {
            System.err.println(line);
        }
        
        // 等待进程结束并返回结果
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new RuntimeException("Python脚本执行异常，退出码：" + exitCode);
        }
        return output.toString();
    }

    // 测试用main方法（实际使用时可删除）
    public static void main(String[] args) {
        try {
            String result = executePythonScript(
                "python3", 
                "/path/to/your_script.py",
                "arg1", 
                "arg2"
            );
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}