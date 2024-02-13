package kr.co.nbw.restaurantapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import kr.co.nbw.restaurantapp.features.common.viewmodel.ThemeViewModel

open class BaseFragment: Fragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}
