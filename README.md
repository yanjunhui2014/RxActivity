# RxActivity
优雅的实现onActivityResult。

##添加依赖
implementation 'com.milo:rxactivitylib:0.0.7'
    
##根目录中allprojects加入
maven {</br> 
    url 'https://repo.rdc.aliyun.com/repository/31621-release-UVGFM4/'</br> 
    credentials{</br>   
        username 'ZC8beb'</br> 
        password 'snSb0jBSE4'</br> 
    }
}
          
##用法
 mActivityOnResult.startForResult(TargetActivity.class, 1, new ActivityOnResult.Callback() {
      @Override
      public void onActivityResult(int requestCode, int resultCode, Intent data) {
           if (resultCode == RESULT_OK) {
                 String extra = data.getStringExtra("extra");
                 mTvContent.setText(extra);
            }
      }
});
     
        
        
        
     

    


