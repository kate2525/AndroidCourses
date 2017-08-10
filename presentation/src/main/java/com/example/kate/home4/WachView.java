package com.example.kate.home4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import com.example.kate.R;

import java.util.Calendar;

public class WachView extends View{

    private Paint myPaint = new Paint();
    private Paint textPaint = new Paint();
    // как бы слой. Область в которой рисовать
    private RectF rectF= new RectF();
    int cx;
    int cy;
    float widthOval; //ширина линии круга

    public WachView(Context context) {
        super(context);
        init();
    }

    public WachView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public WachView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public WachView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
    private void init(){
        myPaint.setAntiAlias(true);//сглаживание пикселей при рисовании
        int color = ContextCompat.getColor(getContext(), R.color.watch);
        widthOval = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,2,getResources().getDisplayMetrics());
        myPaint.setStrokeWidth(widthOval);
        myPaint.setColor(color);
        myPaint.setStyle(Paint.Style.STROKE);//контур, a FILL - заливка
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(40);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //рисуем круг
        int cx = getWidth()/2;
        int cy = getHeight()/2;
        int radius = (int)(Math.min(getWidth(), getHeight())/2 - widthOval/2);
        canvas.drawCircle(cx, cy, radius, myPaint);

        for(int i= 0; i<12; i++) {

            //360:12=30 градусов
            canvas.rotate(30, cx, cy);

            int startX = getWidth() / 2;
            int startY = 0;
            int stopX = getWidth() / 2;
            int stopY = 25;
            canvas.drawLine(startX, startY, stopX, stopY, myPaint);

            //пишем цифры
            canvas.drawText(String.valueOf(i+1), stopX -10, stopY +30, textPaint);
        }

        //делаем время
        Calendar calendar = Calendar.getInstance();
        int minutes = calendar.get(Calendar.MINUTE);
        int hour = calendar.get(Calendar.HOUR);
        Log.e("minnnn", "minutes "+minutes);
        Log.e("hour", "hour "+hour);

        //определяем минуты
        int gradMinut = (360/60)*minutes;
        canvas.save();
        //поворачиваем циферблат на минуты, которые сейчас
        canvas.rotate(gradMinut, cx, cy);
        //отрисовка минутной стрелки
        canvas.drawLine(cx, cy, cx, 0+100, myPaint);
        canvas.restore();

        //определяем часы
        int gradHour = (360/12)*hour;
        canvas.save();
        //цвет и ширина часовой стрелки
        myPaint.setColor(android.graphics.Color.RED);
        myPaint.setStrokeWidth(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,5,getResources().getDisplayMetrics()));
        //поворачиваем циферблат на часы, которые сейчас
        canvas.rotate(gradHour, cx, cy);
        //отрисовка часовую стрелку
        canvas.drawLine(cx, cy, cx, 0+140, myPaint);
        canvas.restore();

    }
}
