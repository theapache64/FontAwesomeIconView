package com.shifz.fontawesomeiconview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.ColorRes;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Shifar Shifz on 7/9/2015.
 */
public class FAIconView extends TextView {

    private static final String FONT_AWESOME_TTF_PATH = "fa.ttf";

    public FAIconView(Context context) {
        super(context);
        init(context);
    }

    public FAIconView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Initializing fontAwesome font.
        init(context);

        //Collecting XML Attributes
        TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.FAIconView);
        String iconName = ta.getString(R.styleable.FAIconView_iconName);
        float iconSize = ta.getDimension(R.styleable.FAIconView_iconSize,18f);
        int iconColor = ta.getColor(R.styleable.FAIconView_iconColor, android.R.color.black);
        ta.recycle();

        //Setting XML Attributes
        setText(iconName);
        setTextSize(iconSize);
        setTextColor(iconColor);
    }

    public FAIconView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        //Blocking default preview behaviour
        if(isInEditMode()){
            return;
        }

        Typeface fa = Typeface.createFromAsset(context.getAssets(),FONT_AWESOME_TTF_PATH);
        setTypeface(fa);
    }

    /**
     * This method is used set Icon programatically
     * @param icon an enum from FAIcon
     */
    public void setIcon(FAIcon icon){
        setText(icon.cheatCode);
    }

    /**
     * Used to set icon color
     * @param iconColor icon color resource
     */
    public void setIconColor(int iconColor){
        setTextColor(iconColor);
    }

    /**
     * Used to set icon color from #Codes
     * @param colorHash
     */
    public void setIconColor(String colorHash){
        setTextColor(Color.parseColor(colorHash));
    }

    /**
     * Used to set icon size
     * @param iconSize
     */
    public void setIconSize(float iconSize){
        setTextSize(iconSize);
    }

}
