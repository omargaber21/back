package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.entity.User
import com.example.myapplication.ui.adapter.UserAdapter

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    lateinit var btn:Button
    lateinit var edtText:EditText
    var list:ArrayList<User> = ArrayList()
    val adapter:UserAdapter by lazy { UserAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView)
        btn=findViewById(R.id.addBtn)
        edtText=findViewById(R.id.edtText)

        recyclerView.adapter=adapter
        btn.setOnClickListener {
            list.add(User(1,"asd",edtText.text.toString(),android.R.drawable.sym_def_app_icon)
                )
            list.add(User(0,"asd","asd",0))
//            Toast.makeText(this,list[0].message,Toast.LENGTH_SHORT).show()
            adapter.setList(list,applicationContext)

             edtText.text.clear()
        }
    }
}