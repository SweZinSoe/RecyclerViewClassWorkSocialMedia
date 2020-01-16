package com.szs.recyckerviewclasswork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyckerviewclasswork.CrushAdapter.CrushAdapter
import com.szs.recyckerviewclasswork.model.FindCrush

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerCrush: RecyclerView = findViewById(R.id.recycler_image)

        var crushList = ArrayList<FindCrush>()
        crushList.add(FindCrush("James", 1, 1, 450, 300, R.drawable.profile, R.drawable.apple))
        crushList.add(FindCrush("Puppy", 2, 3,100, 500, R.drawable.profilegirl, R.drawable.dog))
        crushList.add(FindCrush("John Snow", 3, 10, 400, 400, R.drawable.profileidol, R.drawable.orange))

        var crushAdapter = CrushAdapter(crushList)

        recyclerCrush.layoutManager = LinearLayoutManager(this)

        recyclerCrush.adapter =crushAdapter
    }
}
