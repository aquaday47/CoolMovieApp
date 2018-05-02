package com.aaq.android.coolmovieapp.Views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.aaq.android.coolmovieapp.R;

public class MovieView extends View {

    private
    private String mMovieTitle;
    private Paint mViewPaint;
    //adapted from android docs for 'subclass a view'
    public MovieView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //TODO (I) move to RecyclerView
        //this may belong in OnDraw? or actually in RecyclerViewAdapter!!!
        //in view constructor:
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.MovieView, 0, 0);

        if (a.hasValue(R.styleable.MovieView_numberHalfStars)){
            float val = a.getFloat(R.styleable.MovieView_numberHalfStars, 0);
        }
        a.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


}
