package kr.co.nbw.restaurantapp.core

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import kr.co.nbw.restaurantapp.core.viewmodel.ThemeViewModel

open class BaseDialogFragment: DialogFragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}
