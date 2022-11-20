package com.example.lapor_yuk

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ListPopupWindow.WRAP_CONTENT
import androidx.core.content.ContextCompat
import androidx.core.content.IntentCompat
import androidx.core.view.get
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_jelajahi.*
import kotlinx.android.synthetic.main.slider_item_container.*
import java.text.FieldPosition

class JelajahiActivity : AppCompatActivity() {

    private val introSliderAdapter = IntroSliderAdapter(
        listOf(
            IntroSlide(
                "Lapor-Yuk adalah aplikasi yang membantu anda melaporkan kerusakan yang terjadi di setiap ruas jalan di wilayah Sul-Sel.",
                R.drawable.logo1
            ),
            IntroSlide(
                "Ayo laporkan kerusakan jalan raya yang mengganggu kenyamanan lalu lintas anda!",
                R.drawable.logo2
            ),
            IntroSlide(
                "Pihak instansi terkait akan segera menanganinya hingga tuntas!",
                R.drawable.logo3
            )
        )
    )


    lateinit var activity : Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jelajahi)


        activity = this
        viewpaper.adapter = introSliderAdapter

        setupIndicators()
        setCurrentIndicator(0)
        viewpaper.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
                if (position == listOf(introSliderAdapter).size-1){
                    bt_jelajah.text="Jelajah"

                    bt_jelajah.setOnClickListener{
                        bt_lewati.visibility = View.GONE
                        viewpaper.currentItem++

                    }
                }else if (position == listOf(introSliderAdapter).size-0){
                    bt_jelajah.text = "Selanjutnya"
                    bt_jelajah.setOnClickListener{
                        viewpaper.currentItem++
                    }
                }else {
                    bt_jelajah.text = "Oke, Saya Mengerti"
                    bt_jelajah.setOnClickListener{

                        startActivity(Intent(activity,LoginActivity2::class.java))
                        finish()
                    }
                }
            }
        })

        bt_jelajah.setOnClickListener {
            if (viewpaper.currentItem +1 < introSliderAdapter.itemCount) {
                viewpaper.currentItem += 1
            } else {
                Intent(applicationContext, LoginActivity2::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }
        bt_lewati.setOnClickListener {
            Intent(applicationContext, LoginActivity2::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }

    private fun setupIndicators() {
        val indicator = arrayOfNulls<ImageView>(introSliderAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            WRAP_CONTENT, WRAP_CONTENT
        )
        layoutParams.setMargins(8, 0, 8, 0)

        for (i in indicator.indices) {
            indicator[i] = ImageView(applicationContext)
            indicator[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext, R.drawable.indicator_inactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            indicatorContainer.addView(indicator[i])
        }
    }

    private fun setCurrentIndicator(index: Int) {
        val chilCount = indicatorContainer.childCount
        for (i in 0 until chilCount) {
            val imageView = indicatorContainer[i] as ImageView
            if (i == index) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext, R.drawable.indicator_active
                    )
                )
            } else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext, R.drawable.indicator_inactive
                    )
                )
            }
        }
    }
}

