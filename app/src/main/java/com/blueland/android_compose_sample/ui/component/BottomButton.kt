package kr.co.buddypay.mpay.ui.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.blueland.android_compose_sample.ui.theme.LocalColors
import com.blueland.android_compose_sample.ui.theme.LocalShapes
import com.blueland.android_compose_sample.ui.theme.LocalTextStyles

@Composable
fun BottomButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    backgroundColor: Color = LocalColors.current.main1,
    disabledBackgroundColor: Color = LocalColors.current.text07,
    textColor: Color = LocalColors.current.background,
    pressedTextColor: Color = LocalColors.current.text09,
    disabledTextColor: Color = LocalColors.current.text09,
    textStyle: TextStyle = LocalTextStyles.current.boldBodyXs,
    paddingValues: PaddingValues = PaddingValues(11.dp),
    shape: CornerBasedShape = LocalShapes.medium,
    contentAlignment: Alignment = Alignment.Center
) {
    DefaultButton(
        text = text,
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        enabled = enabled,
        backgroundColor = backgroundColor,
        disabledBackgroundColor = disabledBackgroundColor,
        textColor = textColor,
        pressedTextColor = pressedTextColor,
        disabledTextColor = disabledTextColor,
        textStyle = textStyle,
        paddingValues = paddingValues,
        shape = shape,
        contentAlignment = contentAlignment
    )
}