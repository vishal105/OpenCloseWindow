package smartdrive.neube.example.com.openclosewindow

import android.databinding.BaseObservable
import android.databinding.BindingAdapter
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.view.View


class Back : BaseObservable() {

    var mDrawableResource: Int? = null
        private set
    var mColorResource: Int? = null
        private set
    var mColorValue: Int? = null
        private set
    lateinit var mDrawable: Drawable
        private set
    var mBitmap: Bitmap? = null
        private set

    private fun reset() {
        mDrawableResource = null
        mColorResource = null
        mColorValue = null
    }

    fun setDrawableResource(@DrawableRes drawableResource: Int) {
        reset()
        mDrawableResource = drawableResource
        notifyChange()
    }

    fun setColorResource(@ColorRes colorResource: Int) {
        reset()
        mColorResource = colorResource
        notifyChange()
    }

    fun setColorValue(colorValue: Int) {
        reset()
        mColorValue = colorValue
        notifyChange()
    }

    fun setDrawable(drawable: Drawable) {
        mDrawable = drawable
        notifyChange()
    }

    fun setBitmap(bitmap: Bitmap) {
        reset()
        mBitmap = bitmap
        notifyChange()
    }

    fun clear() {
        reset()
        notifyChange()
    }
}

@BindingAdapter("android:background")

fun setBackground(view: View, observable: Back) {
    if (observable.mDrawableResource != null)
        observable.mDrawableResource?.let { view.setBackgroundResource(it) }
    else if (observable.mColorResource != null)
        observable.mColorResource?.let {
            val color = ContextCompat.getColor(view.context, it)
            view.setBackgroundColor(color)
        }
    else if (observable.mColorValue != null)
        observable.mColorValue?.let { view.setBackgroundColor(it) }
    else if (observable.mDrawable != null) {
        observable.mDrawable?.let {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN)
                view.setBackgroundDrawable(it)
            else
                view.background = it
        }
    } else if (observable.mBitmap != null) {
        observable.mBitmap?.let {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN)
                view.setBackgroundDrawable(BitmapDrawable(it))
            else
                view.background = BitmapDrawable(view.context.resources, it)
        }
    } else {
        view.setBackgroundResource(0)
    }
}