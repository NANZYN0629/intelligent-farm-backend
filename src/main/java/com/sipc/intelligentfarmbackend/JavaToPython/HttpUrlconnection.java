package com.sipc.intelligentfarmbackend.JavaToPython;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@Slf4j
public class HttpUrlconnection {

//    /**
//     * 发送JSON字符串到指定的URL，并返回服务器的响应。
//     *
//     * @param urlPath 请求的URL路径
//     * @param json 要发送的JSON字符串
//     * @return 服务器返回的响应字符串，如果请求失败则返回空字符串
//     */
    public static String doJsonPost(String urlPath, String json) {
        String result = "";
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlPath);
            conn = (HttpURLConnection) url.openConnection();
            configureConnection(conn);
            sendJsonData(conn, json);
            if (conn.getResponseCode() == 200) {
                result = readResponse(conn);
            } else {
                log.error("HTTP request failed with response code: {}", conn.getResponseCode());
            }
        } catch (IOException e) {
            log.error("IO error during JSON POST request to URL: {}", urlPath, e);
        } catch (Exception e) {
            log.error("Unexpected error during JSON POST request to URL: {}", urlPath, e);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return result;
    }

//    /**
//      配置HTTP连接的属性。
//
//      @param conn 要配置的HttpURLConnection对象
//      @throws IOException 如果配置过程中发生IO错误
//     **/
    private static void configureConnection(HttpURLConnection conn) throws IOException {
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setUseCaches(false);
        conn.setRequestProperty("Connection", "Keep-Alive");
        conn.setRequestProperty("Charset", "UTF-8");
        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        conn.setRequestProperty("accept", "application/json");
    }

//    /**
//     * 发送JSON数据到服务器。
//     *
//     * @param conn 已配置的HttpURLConnection对象
//     * @param json 要发送的JSON字符串
//     * @throws IOException 如果发送过程中发生IO错误
//     */
    private static void sendJsonData(HttpURLConnection conn, String json) throws IOException {
        if (json != null && !json.isEmpty()) {
            byte[] writeBytes = json.getBytes();
            conn.setRequestProperty("Content-Length", String.valueOf(writeBytes.length));
            try (OutputStream outStream = conn.getOutputStream()) {
                outStream.write(writeBytes);
                outStream.flush();
            }
        }
    }

//    /**
//     * 读取服务器的响应。
//     *
//     * @param conn 已连接的HttpURLConnection对象
//     * @return 服务器返回的响应字符串
//     * @throws IOException 如果读取过程中发生IO错误
//     */
    private static String readResponse(HttpURLConnection conn) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
    }
}