package com.example.viewandroidviewgroupevent

import android.content.Context
import android.util.Log
import android.view.MotionEvent
import android.widget.LinearLayout
import android.widget.Toast

class CustomLayout(
    context: Context
): LinearLayout(context)  {

    /**
     *
     */
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.d("phael", "CustomViewGroup in called dispatchTouchEvent()")
        return super.dispatchTouchEvent(ev)
    }

    /**
     * 화면에 TouchEvent가 발생했을 경우, 이벤트 전달 순서
     * Activity > ViewGroup > View 순서이다.
     * onInterceptTouchEvent 메소드에서 true를 리턴한다면
     * View에서 Event 처리를 하지 않도록 intercept 하도록 한다.
     *
     * 즉, ChlidView 에게 이벤트 전달을 할 것인가? -> true or false
     */
    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        Log.d("phael", "CustomViewGroup in called onInterceptTouchEvent()")
        return false
    }

    /**
     * ViewGroup 에 TouchEvent가 발생했을 경우
     *
     * onInterceptTouchEvent 매소드에서 true를 리턴해야 ViewGroup의 onTouchEvent가 호출된다.
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("phael", "CustomViewGroup in called onTouchEvent()")
        Toast.makeText(this.rootView.context, "뷰 그룹의 Touch 발생!", Toast.LENGTH_SHORT).show()
        return super.onTouchEvent(event)
    }
}