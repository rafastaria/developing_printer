package com.developingprinter.ToastPackage;

import android.app.Activity;
import java.util.*;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

public class ToastPackage implements ReactPackage {
  private Activity mActivity = null;
  
  public ToastPackage(Activity activity) {
    mActivity = activity;
  }
  
  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();
    modules.add(new ToastModule(reactContext));
    
    return modules;
  }
  @Override
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }
  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext) {
    return Collections.emptyList();
  }
}