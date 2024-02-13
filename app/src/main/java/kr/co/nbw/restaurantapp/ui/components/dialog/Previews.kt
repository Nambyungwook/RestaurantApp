package kr.co.nbw.restaurantapp.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kr.co.nbw.restaurantapp.ui.models.buttons.LeadingIconData
import kr.co.nbw.restaurantapp.ui.models.dialog.DialogButton
import kr.co.nbw.restaurantapp.ui.theme.RestaurantAppTheme
import kr.co.nbw.restaurantapp.R

@Preview
@Composable
fun AlertPreview() {
    RestaurantAppTheme {
        DialogPopup.Alert(
            title = "Title",
            bodyText = "blah balh blah",
            buttons = listOf(
                DialogButton.UnderlinedText("Okay") {}
            )
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    RestaurantAppTheme {
        DialogPopup.Default(
            title = "Title",
            bodyText = "blah balh blah",
            buttons = listOf(
                DialogButton.Primary("OPEN") {},
                DialogButton.SecondaryBorderless("CANCEL") {}
            )
        )
    }
}

@Preview
@Composable
fun RatingPreview() {
    RestaurantAppTheme {
        DialogPopup.Rating(
            restaurantName = "The Lord of the Rings: The Two Towers",
            rating = 7.5f,
            buttons = listOf(
                DialogButton.Primary(
                    title = "OPEN",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.ic_send,
                        iconContentDescription = null
                    )
                ) {},
                DialogButton.SecondaryBorderless("CANCEL") {}
            )
        )
    }
}
