package smartdrive.neube.example.com.openclosewindow

import android.arch.lifecycle.ViewModel
import android.content.Context


class BackViewModel : ViewModel() {
    //    lateinit var drawableRes:ObservableInt
    val back = Back()


    fun setDrawable(context: Context) {

        //   fun setDrawableResources(jaesquerde: Int) {

        back.setDrawable(context.getResources().getDrawable(R.mipmap.jaesquerde))
//        back.setDrawableResource(R.mipmap.jaesquerde)
    }
    /*
      fun setDrawable(){

       //   back.setDrawable(ContextCompat.getDrawable(getActivity(), R.mipmap.fechadireta))

  //        var vDrawable: Drawable? = getResources().getDrawable(R.mipmap.jaesquerde)


          back.setDrawable(drawable = getResources().getDrawable(R.mipmap.jaesquerde))


      }

  */

/*
    fun setDrawable(){

   //     var mDrawable: Drawable = getDrawable(getContext(), jaesquerde);

   //     var VDrawable: Drawable = (context.getResources().getDrawable(R.mipmap.jaesquerde))

        back.setDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.janelafrented));

    }
*/

/*
    fun setColor() {
//        var vColor: String = "#2196F3"
        var vColor: Int = Color.BLUE
//   var vColor: Long = "BLUE
//        back.setColorValue(Color.parseColor(vColor));
        back.setColorValue(vColor)
    }
*/

}
