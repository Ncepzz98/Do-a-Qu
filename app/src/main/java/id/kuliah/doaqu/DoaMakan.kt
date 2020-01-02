package id.kuliah.doaqu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doa_makan.*

class Doanya : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_makan)

        btn_back.setOnClickListener(){
            intent = Intent(this, DoaHarian::class.java)
            startActivity(intent)
        }
    }
}
