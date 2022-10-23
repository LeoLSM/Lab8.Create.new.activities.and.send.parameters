package ipvc.estg.lab8createnewactivitiesandsendparameters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM1_NAME = "Param1_Name"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button1(view: View) {

        var editTextHello = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(this, editTextHello.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.txt1).setText(editTextHello.text)
    }

    fun button2(view: View) {
        var editTextHello = findViewById<EditText>(R.id.editTextTextPersonName)
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(PARAM1_NAME, editTextHello.text.toString())
        }
        startActivity(intent)
    }
}