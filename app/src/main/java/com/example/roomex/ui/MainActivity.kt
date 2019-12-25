package io.navendra.retrofitkotlindeferred.ui
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.roomex.GetListOfPostsUseCase
import com.example.roomex.R
import com.example.roomex.data.PostViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var tmdbViewModel: PostViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tmdbViewModel = ViewModelProviders.of(this).get(PostViewModel::class.java)

        tmdbViewModel.getListOfPosts()
    }
}
