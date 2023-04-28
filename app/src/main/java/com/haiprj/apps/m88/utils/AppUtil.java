package com.haiprj.apps.m88.utils;

import android.content.Context;
import android.content.res.AssetManager;

import com.haiprj.apps.m88.Const;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppUtil {
    public static File writeContentToCache(Context context, String content){
        File mapFileCache = new File(context.getCacheDir(), "map_file.txt");
        if (!mapFileCache.exists()) {
            try {
                mapFileCache.createNewFile();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mapFileCache))) {
            bw.write(content); // Write the content to the file
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapFileCache;
    }

    public static String readFileTextContentFromAsset(Context context, String fileName){
        AssetManager assetManager = context.getAssets();
        StringBuilder stringBuilder = new StringBuilder();
        String filePath = Const.fixedMapDir + fileName;
        try {
            InputStream inputStream = assetManager.open(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }

            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
