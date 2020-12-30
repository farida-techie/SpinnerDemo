package com.malkinfo.spinnerdemos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var spinnView:Spinner
    private lateinit var setImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set view find Id*/
        spinnView = findViewById(R.id.spinner)
        setImage = findViewById(R.id.imageView)
        /**set Spinner On Item Click*/
        spinnView.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                /**set Images*/
                when(position){
                    0->{ setImage.setImageResource(R.drawable.fruit) }
                    1->{ setImage.setImageResource(R.drawable.apple) }
                    2->{
                        setImage.setImageResource(R.drawable.strawberries) }
                    3->{
                        setImage.setImageResource(R.drawable.guava)
                    }
                    4->{
                        setImage.setImageResource(R.drawable.mango)
                    }
                    5->{
                        setImage.setImageResource(R.drawable.watermelon)
                    }
                }


                /**set Toast massage*/
                Toast.makeText(this@MainActivity,
                    "You Selected ${parent?.getItemAtPosition(position).toString()}",
                    Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }
}