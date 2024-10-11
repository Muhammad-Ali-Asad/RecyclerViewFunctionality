package com.example.assignment2

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val recyclerView: RecyclerView =findViewById(R.id.recyclerView)
        val adaptar= ArticlesAdaptar(getArticles())
        recyclerView.adapter=adaptar
        recyclerView.layoutManager= LinearLayoutManager(this)

    }

    fun getArticles(): List<Article>{
        return listOf(
            Article(R.drawable.img1, "Yellow Car", "The 2023 Toyota Camry is a reliable midsize sedan known for its fuel efficiency, smooth ride, and advanced safety features. It offers a stylish design with a spacious interior and a range of tech options.","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),


            Article(R.drawable.img2, "Gray Car", "The 2023 Toyota Camry is a reliable midsize sedan known for its fuel efficiency, smooth ride, and advanced safety features. It offers a stylish design with a spacious interior and a range of tech options.","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),


            Article(R.drawable.img3, "Mustang at Sunset", "The 2023 Toyota Camry is a reliable midsize sedan known for its fuel efficiency, smooth ride, and advanced safety features. It offers a stylish design with a spacious interior and a range of tech options…","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),


            Article(R.drawable.img4, "White car", "The 2023 Toyota Camry is a reliable midsize sedan known for its fuel efficiency, smooth ride, and advanced safety features. It offers a stylish design with a spacious interior and a range of tech options…","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),
        )
    }
}