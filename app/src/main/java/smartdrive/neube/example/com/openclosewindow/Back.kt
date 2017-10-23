package smartdrive.neube.example.com.openclosewindow

import android.databinding.BaseObservable
import android.databinding.Bindable


class Back: BaseObservable(){

    var janE1: Int = 0
        @Bindable get
        set(value){
            field = value
            notifyPropertyChanged(BR.janE1)
        }

}
