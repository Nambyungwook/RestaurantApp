package kr.co.nbw.restaurantapp

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import kr.co.nbw.restaurantapp.features.common.viewmodel.ThemeViewModel

open class BaseDialogFragment: DialogFragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}
