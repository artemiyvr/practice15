import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.practice15.R

class SecondActivity : AppCompatActivity() {
    private lateinit var breedTextView: TextView
    private lateinit var birthTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        breedTextView = findViewById(R.id.breedTextView)
        birthTextView = findViewById(R.id.birthTextView)

        val animal = intent.getParcelableExtra<Animal>("animal")

        breedTextView.text = animal?.breed
        birthTextView.text = "${animal?.birthMonth}/${animal?.birthYear}"
    }
}
