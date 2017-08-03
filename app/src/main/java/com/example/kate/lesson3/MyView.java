package com.example.kate.lesson3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

import com.example.kate.R;

public class MyView extends View{

    private Paint myPaint = new Paint();
    private RectF rectF= new RectF();
    int cx;
    int cy;

    public MyView(Context context) {
        super(context);
        initialize();

    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();
    }

    private void initialize(){
        myPaint.setAntiAlias(true);//сглаживание пикселей при рисовании
        int color = ContextCompat.getColor(getContext(), R.color.buttonsText);
        myPaint.setColor(color);

        myPaint.setStyle(Paint.Style.STROKE);//контур, a FILL - заливка

        //Resources r = getResources();
       // float stokeWidth = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP),2, r.getDisplayMetrics())

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //рисуем круг
//        int cx = getWidth()/2;
//        int cy = getHeight()/2;
        int radius = Math.min(getWidth(), getHeight())/6;
        canvas.drawCircle(cx, cy, radius, myPaint);
        //canvas.rotate();

        //рисуем линию
        int startX = 0;
        int startY = 0;
        int stopX = getWidth();
        int stopY = getHeight();
       // canvas.drawLine(startX, startY, stopX, stopY, myPaint);

        //рисуем полукруг
        rectF.left = 0;
        rectF.top = 0;
        rectF.right= getWidth();
        rectF.bottom = getHeight();
        myPaint.setStyle(Paint.Style.FILL);
       // canvas.drawArc(rectF, 0, -90, true, myPaint);

        //рисуем прямоугольник
      //  canvas.drawRect(50,50,100,100, myPaint);
    }

    //при изменении экрана
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }
    //определяет размеры View
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    //ловит клики на экран
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //будем двигать по экрану и двигаться круг будет
        if (event.getAction() == MotionEvent.ACTION_MOVE){

            cx = (int)event.getX();
            cy = (int)event.getY();
            invalidate();
        }else if(event.getAction() == MotionEvent.ACTION_DOWN){

        }else if(event.getAction() == MotionEvent.ACTION_UP){

        }
        return true;
    }
}
