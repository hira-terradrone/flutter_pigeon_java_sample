package com.example.flutter_pigeon_java_sample;

import androidx.annotation.NonNull;

import io.flutter.plugins.Pigeon;
import io.flutter.plugins.Pigeon.*;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

import java.util.*;

public class MainActivity extends FlutterActivity {
    public class JavaApi implements Pigeon.JavaApi {
        public Long sum(StrctSrc src) {
            Long result = src.getA() + src.getB();
            Long result2 = result * 5;
            return result2;
        }
    }

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine){
        super.configureFlutterEngine(flutterEngine);
        Pigeon.JavaApi.setup(flutterEngine.getDartExecutor().getBinaryMessenger(), new JavaApi());
    }
}
