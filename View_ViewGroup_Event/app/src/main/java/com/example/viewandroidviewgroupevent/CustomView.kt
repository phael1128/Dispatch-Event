package com.example.viewandroidviewgroupevent

import android.content.Context
import android.util.Log
import android.view.MotionEvent
import android.widget.Toast

class CustomView(context: Context): androidx.appcompat.widget.AppCompatButton(context) {

    /**
     *
     */
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.d("phael", "CustomView in called dispatchTouchEvent()")
        return super.dispatchTouchEvent(ev)
    }

    /**
     * View애 TouchEvent가 발생했을 경우
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("phael", "CustomView in called onTouchEvent()")
        Toast.makeText(this.rootView.context, "뷰의 Touch 발생!", Toast.LENGTH_SHORT).show()
        return super.onTouchEvent(event)
    }
}