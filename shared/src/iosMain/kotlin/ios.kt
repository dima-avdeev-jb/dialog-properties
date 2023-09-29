import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.DialogProperties

@OptIn(ExperimentalComposeUiApi::class)
actual fun createDialogProperties(): DialogProperties =
    DialogProperties(
        usePlatformInsets = false
    )
