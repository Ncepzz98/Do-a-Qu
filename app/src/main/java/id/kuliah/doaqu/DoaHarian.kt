package id.kuliah.doaqu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doa_harian.*

class DoaHarian : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        doa_sblm_makan.setOnClickListener() {
            intent = Intent(this, Doanya::class.java)
            startActivity(intent)
        }

        btn_back.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}
