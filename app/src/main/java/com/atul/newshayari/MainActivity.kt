package com.atul.newshayari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atul.shayari.adapter.HomeMyAdapter
import com.atul.shayari.adapter.MyAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //category Recycler
        val categoriess = listOf<String>("Good Morning","Attitude","Love","Birthday","English Quotes","Parents","Sad")
        val cate_recl = findViewById<RecyclerView>(R.id.categoty_recycle)
        cate_recl.adapter = MyAdapter(categoriess)
        cate_recl.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        //Home Recycler
        val shayries = listOf<String>("sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg",
            "asdfas dfasdf sad fdsfnajsdbfasbhdfkjfvksajdfasvdfksdg  sd g sd fg s dfg sd g sd fg s d  sdgvaskfj as f a sf sddsgssafdasdfdasfdgsdadsfasasdfasfas fd asfd  asdf  asdf asdf as as f asd asfsafs sdgsdfgsg"
        )
        val home_recl = findViewById<RecyclerView>(R.id.home_recycler)
        home_recl.adapter = HomeMyAdapter(this,shayries)
        home_recl.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}