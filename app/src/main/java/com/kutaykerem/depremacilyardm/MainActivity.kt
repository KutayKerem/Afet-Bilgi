package com.kutaykerem.depremacilyardm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.app.SearchManager

import android.content.Intent
import android.net.Uri
import android.view.View
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun yardim(view: View){
        var intent = Intent(applicationContext,BilgilerActivity::class.java)
        startActivity(intent)
    }






    fun diyarbakir(view:View){
        var intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + "0412 326 1156"))
        startActivity(intent)
    }

    fun hatay (viewView: View){
        var intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + "0326 112 0000"))
        startActivity(intent)

    }
    fun antep(view: View){
        var intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse("tel:0342 428 1118"))
        startActivity(intent)
    }
    fun adana(view: View){
        var intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse("tel:0322 227 2854"))
        startActivity(intent)
    }

    fun adıyaman(view: View){
        var intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse("tel:0416 216 1231"))
        startActivity(intent)
    }

    fun maras(view: View){

        var intent = Intent(Intent.ACTION_CALL,Uri.parse("tel:" + "0344 221 4991"))
        startActivity(intent)

    }

    fun urfa(view: View){
        var intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse("tel:0414 313 7290"))
        startActivity(intent)
    }


    fun malatya(view:View){
        var intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse("tel:0422 212 8432"))
        startActivity(intent)
    }
    fun mardin(view: View){
        var intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse("tel:0482 212 3740"))
        startActivity(intent)
    }




}