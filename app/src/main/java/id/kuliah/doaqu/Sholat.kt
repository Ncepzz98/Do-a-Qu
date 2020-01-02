package id.kuliah.doaqu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doa_harian.*
import kotlinx.android.synthetic.main.activity_doa_harian.btn_back
import kotlinx.android.synthetic.main.activity_sholat.*

class Sholat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sholat)

        subuh.setOnClickListener() {
            intent = Intent(this, Niatnya::class.java)
            startActivity(intent)
        }

        btn_back.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
