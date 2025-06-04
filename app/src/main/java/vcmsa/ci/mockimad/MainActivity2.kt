package vcmsa.ci.mockimad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vcmsa.ci.mockimad.R.id.btnDetails
import vcmsa.ci.mockimad.R.id.ltSpinner

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)



        findViewById<TextView>(R.id.etDate)
        findViewById<TextView>(R.id.etMinutes)
        findViewById<Spinner>(ltSpinner)
        findViewById<Button>(R.id.btnEnter)
        findViewById<Button>(R.id.btnClear)
        findViewById<Button>(btnDetails)













        btnDetails.setOnClickListeners {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }


































        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}

private fun Int.setOnClickListeners(function: () -> Unit) {
    TODO("Not yet implemented")
}
