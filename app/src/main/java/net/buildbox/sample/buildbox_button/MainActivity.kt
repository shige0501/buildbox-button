package net.buildbox.sample.buildbox_button

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toastButton: Button = findViewById(R.id.show_toast_button)
        toastButton.setOnClickListener {
            Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
    }
}
