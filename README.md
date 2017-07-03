# NumberTextViewDemo# 
使用
 1、项目配置
     ![配置图](http://7xpffz.com1.z0.glb.clouddn.com/图片1.png)
       
       
  1.1、在上图标注1的文件中找到相应位置加入下面代码

```
dependencies {
       compile 'com.github.onlybeyond:NubmerTextVeiw:1.0.5'
｝
```
1.2在上图标注2的文件中找到相应位置加入下面代码

```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
1.3同步一下配置结束了

2.使用
     2.1、正负数的使用       
           ![Alt text](http://7xpffz.com1.z0.glb.clouddn.com/1.gif)
```
 默认效果从零开始，以最小精度开始动画 ，支持正负数，可以直接设置               
 ntvTestOne.setNumberValue("100");
 ntvTestOne.setNumberValue("－100");
```
  2.2支持小数，可以n倍精度变化，通过这个功能，可以实现倒数第一位滚动，倒数第二位   
      滚动，倒数n位滚动。
           ![Alt text](http://7xpffz.com1.z0.glb.clouddn.com/2.gif)

```
 //三倍精度增长
    ntvTestThree.setRollInt(3);
    ntvTestTwo.setUseMax(true);
    ntvTestThree.setNumberValue("100.9");

    //倒数第二位变化
    ntvTestFour.setRollInt(10);
    ntvTestFour.setNumberValue("100.9");

    //倒数第三位变化
    ntvTestFive.setRollInt(100);
    ntvTestFive.setNumberValue("100.9");
```

2.3支持动画开始值的设定，以及动画最长时间的设置。这样可以拒绝从0开始的傻瓜式增长，通过该设置可以实现动画位数，例如比如168，设置成150开始，就是最后两位滚动。最长时间的设置可以保证当数字很大时，一直看动画－> _－> 并且支持动画结束以后的回调，可以查看动画开始时间，以及动画时间（时间与设定会有略微差距）.但设置了开始值又设定了动画时间，会比较哪一种方式比较快就会取哪一种
      ![Alt text](http://7xpffz.com1.z0.glb.clouddn.com/3.gif)


 ntvTestSix.setNumberValue("95","100");
        ntvTestSeven.setMaxAnimDuration(2000);
        ntvTestSeven.setUseMax(true);
        ntvTestSeven.setNumberTextViewListener(new N

```
umberTextView.NumberTextViewListener() {
            @Override
            public void animStart(long l) {
            }

            @Override
            public void animEnd(long l, long l1) {
                tvTestSevenTime.setText("时间:"+l1);
            }
        });
        ntvTestSeven.setNumberValue("100");
```

2.4支持数值前后添加文字，这样在数字前面添加符号，在数字后面添加单位，满足更多的应用场景。
 

```
        ntvTestEight.setNumberValue("100");
        ntvTestEight.setNumberValueSymbol("$");
        ntvTestEight.setNumberValueUnit("元");
```
2.5支持属性配置文件，使用起来更佳简便
```
 <com.onlybeyond.numbertextview.NumberTextView
        android:id="@+id/ntv_test_nine"
        app:ntvStartValue="80"
        app:ntvRollInt="3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

//Activity        
ntvTestNine.setNumberValue("100.9");

```
  扫描下载demo
          ![配置图](http://7xpffz.com1.z0.glb.clouddn.com/ic_down.jpg?attname=)            
        
        

                

