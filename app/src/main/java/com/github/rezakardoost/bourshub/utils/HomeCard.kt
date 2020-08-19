package com.github.rezakardoost.bourshub.utils

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import com.github.rezakardoost.bourshub.R
import com.google.android.material.card.MaterialCardView


internal class HomeCard : MaterialCardView {
    private var cardTitle:String? = null
    private var cardSubtitle:String? = null
    private var cardSrc:Int? = null

    constructor(context: Context?) : super(context) {initializeViews()}

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        val a = context!!.obtainStyledAttributes(
            attrs,
            R.styleable.HomeCard)
        cardTitle = a.getString(R.styleable.HomeCard_cardTitle)
        cardSubtitle = a.getString(R.styleable.HomeCard_cardSubtitle)
        cardSrc = a.getResourceId(R.styleable.HomeCard_cardSrc,0)
        a.recycle()
        initializeViews()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {initializeViews()}

    private fun initializeViews() {
        inflate(context, R.layout.home_card_content, this)

        val cardTitleView  = findViewById<TextView>(R.id.cardTitleTXT)
        cardTitleView.text = cardTitle

        val cardSubtitleView  = findViewById<TextView>(R.id.cardSubtitleTXT)
        cardSubtitleView.text = cardSubtitle

        val cardSrcView  = findViewById<ImageView>(R.id.cardSrcIMG)
        cardSrcView.setImageResource(cardSrc!!)
    }
}