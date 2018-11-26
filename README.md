# 效果图

![ScreenGif.gif](https://github.com/superSp/PasswordInputEdt/blob/master/PasswordInputEdt.gif)

# 使用
在根目录的build.gradle中添加
````
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
````
在项目的build.gradle中添加
````
 compile 'com.github.superSp:PasswordInputEdt:v1.0'
````
在布局中添加
````
 <lsp.com.lib.PasswordInputEdt
        android:id="@+id/edt"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
````
在Activity中使用
````
edt = (PasswordInputEdt) findViewById(R.id.edt);
edt.setOnInputOverListener(new PasswordInputEdt.onInputOverListener() {
      @Override
      public void onInputOver(String text) {
          Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
      }
});
````
# 可以自定义的属性(xml和代码都可以设置)
````
    <attr name="numLength" format="integer" />              <!-- 输入位数的长度-->
    <attr name="isPwd" format="boolean" />                  <!-- 是否显示为密码-->
    <attr name="autoCloseKeyBoard" format="boolean" />      <!-- 输入完成后是否自动关闭键盘-->
    <attr name="isNumber" format="boolean" />               <!-- 是否只能输入数字-->
    <attr name="widthSpace" format="dimension" />           <!-- 框框之间的横向间隙-->
    <attr name="heightSpace" format="dimension" />          <!-- 框框之间的纵向间隙-->
    <attr name="rectStroke" format="dimension" />           <!-- 框框的宽度-->
    <attr name="txtSize" format="dimension" />              <!-- 字体的大小-->
    <attr name="circleRadius" format="dimension" />         <!-- 密码格式中圆形的半径-->
    <attr name="bgFill" format="boolean" />                 <!-- 框框是否附带背景-->
    <attr name="textColor" format="color" />                <!-- 字体的颜色-->
    <attr name="rectNormalColor" format="color" />          <!-- 框框没选中时候默认的颜色-->
    <attr name="rectChooseColor" format="color" />          <!-- 框框选中时候默认的颜色-->
    <attr name="pwdType" format="enum" >                    <!-- 密码的类型：圆或者*号-->
        <enum name="CIRCLE" value="0"/>
        <enum name="XINGHAO" value="1"/>
    </attr>
    
    clearLastOne()					    <!--删除最后一个字符方法-->
    clearAll()					            <!--清空内容方法-->
    getText()						    <!--获取文本内容-->
````

[简书地址](http://www.jianshu.com/p/a8cfe904f55a)
              
