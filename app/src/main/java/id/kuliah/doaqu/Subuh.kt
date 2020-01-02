package id.kuliah.doaqu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doa_makan.*

class Niatnya : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subuh)

        btn_back.setOnClickListener(){
            intent = Intent(this, Sholat::class.java)
            startActivity(intent)
        }
    }
}
