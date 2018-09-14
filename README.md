# RxActivity
优雅的实现onActivityResult。

##添加依赖
```text
implementation 'com.milo:rxactivitylib:0.0.7'
```
    
##根目录中allprojects加入
```text
maven {  
    url 'https://repo.rdc.aliyun.com/repository/31621-release-UVGFM4/'
    credentials{  
       username 'ZC8beb'  
       password 'snSb0jBSE4'  
    } 
}
```
      
##用法
```text
 mActivityOnResult.startForResult(TargetActivity.class, 1, new ActivityOnResult.Callback() {
      @Override
      public void onActivityResult(int requestCode, int resultCode, Intent data) {
           if (resultCode == RESULT_OK) {
                 String extra = data.getStringExtra("extra");
                 mTvContent.setText(extra);
            }
      }
});
```
     
        
        
        
     

    


