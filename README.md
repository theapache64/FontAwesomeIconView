# FontAwesomeIconView
FontAwesomeIconView is an Android widget that can be used to show FontAwesomeIcons in your Android application.

### How to use?

just add the below dependency in your application module's build.gradle file

```groovy
    compile 'com.shifz:font-awesome-icon-view:0.0.1'
```

### Usage

** XML **

```xml
<... 
    ...
    xmlns:custom="http://schemas.android.com/apk/res-auto"
    android:layout_height="match_parent">

    <com.shifz.fontawesomeiconview.FAIconView

        android:id="@+id/fivIcon"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"

        custom:iconColor="@color/batman_black" //Setting icon color
        custom:iconName="@string/fa_adjust" //Setting icon
        custom:iconSize="100sp" //Setting icon size
        />

</...>
```
** Java **
```java
    FAIconView faIconView = (FAIconView) findViewById(R.id.fivIcon);
    faIconView.setIcon(FAIcon.FA_ADJUST);
    faIconView.setIconColor(Color.RED);
    faIconView.setIconSize(250f);
```


### Coming soon ###
* Maven Central support


Licence

***
The MIT License (MIT)

Copyright (c) 2015 FontAwesomeIconView

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.***