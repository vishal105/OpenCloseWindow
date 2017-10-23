package smartdrive.neube.example.com.openclosewindow

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import smartdrive.neube.example.com.openclosewindow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {

        DataBindingUtil.bind<ActivityMainBinding>(viewRoot)

    }

    private val viewModel: BackViewModel by lazy {
        ViewModelProviders.of(this).get(BackViewModel::class.java)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.backviewmodel = viewModel
//        binding.backviewmodel = viewModel.backviewmodel
     //   viewModel.background.setColorValue(Color.BLUE)
        buttone1.setOnClickListener { viewModel.setColor() }


    }

}

