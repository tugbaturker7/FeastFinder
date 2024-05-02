package com.example.feastfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private lateinit var foodName : String
    private lateinit var image : ImageView
    private lateinit var text : TextView
    private lateinit var image2 : ImageView
    private lateinit var text2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        foodName = ""
        image = findViewById(R.id.detailImageView)
        text = findViewById(R.id.detailTextView)

        if (intent.hasExtra("foodname")) {
            foodName = intent.getStringExtra("foodname")!!
        }

        if(foodName.equals("Baklava")) {
            image.setBackgroundResource(R.drawable.baklavajpg)
            text.setText("Baklava: Baklava, which is consumed as much in Turkey as in the Middle East, the Balkans and South Asia, can be produced with many different ingredients. One of the most preferred among these is pistachio baklava, which is the symbol of Gaziantep cuisine. After many years of heated debate about its origin, the EU commission registered that baklava is a flavor unique to Turkish cuisine. In addition to the type of pistachio used, the special syrup that makes a difference with its consistency is also responsible for the pistachio baklava produced in Gaziantep to become so famous.")

        }
        if(foodName.equals("Kebap")) {
            image.setBackgroundResource(R.drawable.kebap)
            text.setText("Kebab: Adana kebab, which is preferred with lamb meat, is prepared with the addition of salt and pepper, cooked over coal fire or on a barbecue, and served with a special pita bread and sumac onions. The way the soft minced meat melts in your mouth while eating and the taste of the flavors accompanying the kebab slowly mix with the meat offers perhaps one of the most enjoyable kebab eating experiences in the world.")


        }
        if(foodName.equals("Mantı")) {
            image.setBackgroundResource(R.drawable.manti)
            text.setText("Manti: One of the most important features of Kayseri manti, which requires a little more effort than other types of preparation, is its size. So much so that in Kayseri, it was once believed that young women who could not fit 40 dumplings into a spoon could not get married. Manti, which is one of the most famous dishes in Turkey and served with a sauce consisting of spices and butter poured over garlic or plain yoghurt upon request, is also worth trying, as are the types prepared using various cooking techniques in different regions such as Sinop, Thrace, Çorum and Nevşehir.")

        }
        if(foodName.equals("Yaprak Sarma")) {
            image.setBackgroundResource(R.drawable.yapraksarma)
            text.setText("Yaprak Sarma: Olive oil stuffed wrap is another important legacy of Ottoman cuisine that survives today and is a dish identified with the Aegean Region, which is also described as the olive warehouse of Turkey. Olive oil stuffed wrap is prepared by wrapping vine leaves in a stuffing containing rice and various spices. Although grape leaves are generally used, there are also types of olive oil stuffing prepared with different tree leaves. In addition, although the one with olive oil comes to the fore, stuffed vine leaves with meat are also frequently made and consumed with pleasure. One of the most special examples of these is the variety prepared with cherry leaves in Malatya.")


        }
        if(foodName.equals("Lahmacun")) {
            image.setBackgroundResource(R.drawable.lahmacun)
            text.setText("Lahmacun: It takes its name from \"lahm bi ajin\", which is used to express \"meat dough\" in Arabic. Lahmacun, also known as Turkish pizza, has gained an indispensable place on everyone's table, thanks to the Turkish food restaurants and kebab shops that have opened in all cities, especially in the last 50 years, after being consumed fondly in the east of Turkey for centuries. Gaziantep and Şanlıurfa are among the cities most associated with this special dish, which is cooked in a stone oven and has a crispy taste thanks to the blend of unique spices.")

        }

    }
}