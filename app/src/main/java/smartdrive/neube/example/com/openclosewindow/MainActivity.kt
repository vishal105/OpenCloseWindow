package smartdrive.neube.example.com.openclosewindow

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
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
        //       val Regular = BackViewModel()

        binding.back = viewModel.back

//        binding.backviewmodel = viewModel.backviewmodel

        viewModel.back.setDrawable(resources.getDrawable(R.drawable.whitebackground))

        // viewModel.back.setDrawable(R.mipmap.jaesquerde)
        buttone1.setOnClickListener { viewModel.setDrawable(context = this) }

        //       buttone1.setOnClickListener { viewModel.setDrawableResources(R.mipmap.jaesquerde)}

        //     buttone1.setOnClickListener { viewModel.setDrawable() }


        //    Mas tu tava setando o `background` do `binding`. Tem que setar o `viewModel` do `binding`


    }

}
// check this activity with other project


