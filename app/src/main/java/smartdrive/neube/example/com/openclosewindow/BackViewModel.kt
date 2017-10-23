package smartdrive.neube.example.com.openclosewindow

import android.arch.lifecycle.ViewModel
import android.graphics.Color
import com.prilaga.verge_agni_yoga.view.view_model.ObservableBackground

class BackViewModel: ViewModel(){

    val background = ObservableBackground()

    fun setColor() {
        background.setColorValue(Color.BLACK)
    }


}