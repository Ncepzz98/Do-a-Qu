package id.kuliah.doaqu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doa_harian.setOnClickListener(){
            intent = Intent(this, DoaHarian::class.java)
            startActivity(intent)
        }

        doa_sholat.setOnClickListener() {
            intent = Intent(this, Sholat::class.java)
            startActivity(intent)
        }
    }
}
