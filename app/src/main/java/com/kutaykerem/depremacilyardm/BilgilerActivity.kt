package com.kutaykerem.depremacilyardm

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bilgiler.*

class BilgilerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bilgiler)


        kalacakYerler.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH)
            intent.putExtra(
                SearchManager.QUERY,
                "https://twitter.com/ZeydanKaralar01/status/1622644817506205709"
            )
            startActivity(intent)

        }


        ücretsizOteller.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH)
            intent.putExtra(SearchManager.QUERY, "https://www.otelz.com/tr/gecmisolsunturkiyem")
            startActivity(intent)

        }

        kapaliYollar.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH)
            intent.putExtra(
                SearchManager.QUERY,
                " https://www.kgm.gov.tr/Sayfalar/KGM/SiteTr/YolDanisma/TrafigeKapaliYollar.aspx"
            )
            startActivity(intent)


        }

        haberVerme.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH)
            intent.putExtra(SearchManager.QUERY, "https://www.depremyardim.com/")
            startActivity(intent)

        }

        kanBagsi.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH)
            intent.putExtra(SearchManager.QUERY, "https://www.kanver.org/")
            startActivity(intent)

        }

        afadBagis.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH)
            intent.putExtra(SearchManager.QUERY, "https://www.afad.gov.tr/depremkampanyasi2")
            startActivity(intent)

        }

        kizilayBagis.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH)
            intent.putExtra(
                SearchManager.QUERY,
                "https://www.kizilay.org.tr/Bagis/BagisYap/7/genel-bagis?ppac=0&os=0"
            )
            startActivity(intent)


        }

    }




}