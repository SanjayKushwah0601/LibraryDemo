package com.sanjay.mylittlelibrary

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

/**
 * Created by Sanjay on 5/17/2017.
 */

class MyView : LinearLayout {

    constructor(context: Context) : super(context) {
        initialize(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initialize(context)
    }

    private fun initialize(context: Context) {
        View.inflate(context, R.layout.my_view, this)
    }
}