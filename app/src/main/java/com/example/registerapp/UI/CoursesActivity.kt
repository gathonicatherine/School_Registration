package com.example.registerapp.UI

class CoursesActivity {
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import androidx.recyclerview.widget.LinearLayoutManager
    import androidx.recyclerview.widget.RecyclerView
    import com.example.first_app.models.Courses
    import com.example.first_app.CousesAdapter
    import com.example.first_app.R

    class CoursesActivity : AppCompatActivity() {
        lateinit var rvCourses: RecyclerView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_courses)
            displayCourses()
        }
        fun displayCourses(){
            var coursesList= listOf(
                Courses("Python","467665","Python for 21st","James"),
                Courses("IOT","467665","IOT for 21st","Barre"),
                Courses("JavaScript","467665","JavaScript for 21st","Maina"),
                Courses("UX research","467665","UX research for 21st","Joy"),
                Courses("UI/UX design","467665","UI/UX design for 21st","Asiago"),
                Courses("PD","467665","PD for 21st","Rodgers"),
                Courses("Kotlin","467665","KOtlin for 21st","John"),
                Courses("NYJ","467665","NYJ for 21st","Thamaini"),
                Courses("Technical Writing","62187","Technical Writing for 21st","Sophia Akoth"),
                Courses("AWS","000665","AWS for 21st","Yet to find out"),
                Courses("NYJ","467665","NYJ for 21st","Thamaini"),
            )
            rvCourses=findViewById(R.id.rvCourses)
            var cousesAdapter= CousesAdapter(coursesList)
            rvCourses.layoutManager=LinearLayoutManager(baseContext)
            rvCourses.adapter=cousesAdapter

            rvCourses.apply {
                layoutManager=LinearLayoutManager(baseContext)
                adapter=cousesAdapter
            }
        }
    }
}