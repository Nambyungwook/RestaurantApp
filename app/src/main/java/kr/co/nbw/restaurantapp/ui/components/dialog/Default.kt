package kr.co.nbw.restaurantapp.ui.components.dialog

import androidx.compose.runtime.Composable
import kr.co.nbw.restaurantapp.ui.models.dialog.DialogButton
import kr.co.nbw.restaurantapp.ui.models.dialog.DialogContent
import kr.co.nbw.restaurantapp.ui.models.dialog.DialogText
import kr.co.nbw.restaurantapp.ui.models.dialog.DialogTitle

object DialogPopup

@Composable
fun DialogPopup.Default(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Default(title),
        dialogContent = DialogContent.Default(
            DialogText.Default(bodyText)
        ),
        buttons = buttons
    )
}
