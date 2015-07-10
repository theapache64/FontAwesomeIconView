# FontAwesomeIconView
FontAwesomeIconView is an Android widget that can be used to show FontAwesomeIcons in your Android application.

### Usages ###

XML

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
Java
```java
	FAIconView faIconView = (FAIconView) findViewById(R.id.fivIcon);
    faIconView.setIcon(FAIcon.FA_ADJUST);
    faIconView.setIconColor(Color.RED);
    faIconView.setIconSize(250f);
```


### Coming soon ###
* jCenter support
* Maven Center support