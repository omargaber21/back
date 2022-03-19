package com.example.myapplication.ui.adapter

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.entity.User
import com.example.myapplication.ui.MainActivity

class UserAdapter :RecyclerView.Adapter<UserAdapter.UsersViewHolder>(){
    lateinit var context:Context
    var usersList:ArrayList<User> = ArrayList()
     fun setList(usersList:ArrayList<User>,context:Context){
         this.context=context
//         Toast.makeText(context,"hey",Toast.LENGTH_LONG).show()
        this.usersList=usersList
         notifyDataSetChanged()
    }
    class UsersViewHolder(itemview:View): RecyclerView.ViewHolder(itemview) {
        var textView:TextView= itemview.findViewById(R.id.textView)
        var imageView:ImageView=itemview.findViewById(R.id.imageView)

         fun bind(user: User) {

          textView.text=user.message
             imageView.setImageResource(user.imageId)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)
        return UsersViewHolder(v)
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        val user:User=usersList[position]
        Toast.makeText(context,"position.toString()",Toast.LENGTH_LONG).show()

        holder.bind(user)
    }



    override fun getItemCount(): Int {
        return usersList.size
    }
}