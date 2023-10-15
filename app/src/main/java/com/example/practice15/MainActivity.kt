
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.practice15.R

class MainActivity : AppCompatActivity() {
    private lateinit var breedEditText: EditText
    private lateinit var birthYearEditText: EditText
    private lateinit var birthMonthEditText: EditText
    private lateinit var submitButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        breedEditText = findViewById(R.id.breedEditText)
        birthYearEditText = findViewById(R.id.birthYearEditText)
        birthMonthEditText = findViewById(R.id.birthMonthEditText)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val breed = breedEditText.text.toString()
            val birthYear = birthYearEditText.text.toString().toInt()
            val birthMonth = birthMonthEditText.text.toString().toInt()

            val animal = Animal(breed, birthYear, birthMonth)

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("animal", animal)
            startActivity(intent)
        }
    }
}
