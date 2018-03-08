package com.example.omsairam.artbook

import android.graphics.Bitmap

/**
 * Created by omsairam on 09/03/2018.
 */
class Globals {

    companion object Chosen {
        var chosenImage: Bitmap? = null
        fun returnImage():Bitmap {
            return chosenImage!!
        }
    }
}