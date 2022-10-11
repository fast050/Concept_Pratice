package com.example.conceptpratice.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Typeface
import android.text.style.UnderlineSpan
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.AppCompatTextView

class CustomTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {


    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(text, type)
        paint.flags = Paint.UNDERLINE_TEXT_FLAG
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        // if u want to do anything


    }

}