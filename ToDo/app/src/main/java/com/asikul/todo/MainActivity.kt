package com.asikul.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Find the listview
        val listView = findViewById<ListView>(R.id.listView)

        //Declearing array for the list
        val toDoItems = arrayListOf<String>()
        toDoItems.add("Learn kotlin")
        toDoItems.add("Study for exam")
        toDoItems.add("Take brake")
        toDoItems.add("Pray")
        toDoItems.add("Sleep")
        toDoItems.add("Get ready for college")

        //Making array adapter to send the data to the list view
        val adapterForListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, toDoItems)

        //Setting the listview with array adapter
        listView.adapter = adapterForListView

        //Give behaviour to the list items
        listView.setOnItemClickListener { adapterView, view, i, l ->

            //Get the item text and display a toast msg.
            val msg = "Clicked on: " + (view as TextView).text.toString()
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }
    }
}